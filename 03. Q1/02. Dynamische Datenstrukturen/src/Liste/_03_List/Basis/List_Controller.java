package Liste._03_List.Basis;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class List_Controller {
    @FXML private TextField tfIsEmpty;
    @FXML private TextField tfHasAccess;
    @FXML private TextField tfGetContent;
    @FXML private TextField tfSetContent;
    @FXML private TextField tfAppend;
    @FXML private TextField tfInsert;
    @FXML private ListView lv;
    @FXML private Button btIsEmpty;
    @FXML private Button btHasAccess;
    @FXML private Button btNext;
    @FXML private Button btToFirst;
    @FXML private Button btToLast;
    @FXML private Button btGetContent;
    @FXML private Button btSetContent;
    @FXML private Button btAppend;
    @FXML private Button btInsert;
    @FXML private Button btConcat;
    @FXML private Button btRemove;

    private List<String> list;

    public void btList_click() {
        list = new List<String>();
        gibAus();
        btIsEmpty.setDisable(false);
        btHasAccess.setDisable(false);
        btNext.setDisable(false);
        btToFirst.setDisable(false);
        btToLast.setDisable(false);
        btGetContent.setDisable(false);
        btSetContent.setDisable(false);
        btAppend.setDisable(false);
        btInsert.setDisable(false);
        btConcat.setDisable(false);
        btRemove.setDisable(false);
    }

    public void btIsEmpty_click() {
        if (list.isEmpty()) tfIsEmpty.setText("ja - leer!"); else tfIsEmpty.setText("nicht leer!");
    }

    public void btHasAccess_click() {
        if (list.hasAccess()) tfHasAccess.setText("ja - current!"); else tfHasAccess.setText("kein current!");
    }

    public void btNext_click() {
        list.next();
        gibAus();
    }

    public void btToFirst_click() {
        list.toFirst();
        gibAus();
    }

    public void btToLast_click() {
        list.toLast();
        gibAus();
    }

    public void btGetContent_click() {
        tfGetContent.setText(list.getContent());
    }

    public void btSetContent_click() {
        list.setContent(tfSetContent.getText());
        gibAus();
    }

    public void btAppend_click() {
        list.append(tfAppend.getText());
        gibAus();
    }

    public void btInsert_click() {
        list.insert(tfInsert.getText());
        gibAus();
    }

    public void btConcat_click() {
        List <String> l2 = new List <String> ();
        l2.append("1"); l2.append("2"); l2.append("3");
        list.concat(l2);
        gibAus();
    }

    public void btRemove_click() {
        list.remove();
        gibAus();
    }

    public void btPrevious_click() {
        list.current = list.getPrevious(list.current);
        gibAus();
    }

    public void gibAus() {
        //Hilfsliste list2 - nur für Zwischenspeicherung current!
        List <String> list2 = new List <String> ();
        list2.current = list.current;
        lv.getItems().clear();
        list.toFirst();
        while (list.hasAccess()) {
            if (list.current == list2.current) {
                lv.getItems().add(list.getContent() + " - current!");
            } else {
                lv.getItems().add(list.getContent());
            }
            list.next();
        }
        list.current = list2.current;
    }
}