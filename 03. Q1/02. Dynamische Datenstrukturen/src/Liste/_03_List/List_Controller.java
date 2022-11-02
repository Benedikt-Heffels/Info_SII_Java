package Liste._03_List;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class List_Controller {
    @FXML private Button btList;
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

    @FXML private Label lblIsEmpty;
    @FXML private Label lblHasAccess;
    @FXML private Label lblGetContent;

    @FXML private TextField tfSetContent;
    @FXML private TextField tfAppend;
    @FXML private TextField tfInsert;

    @FXML private ListView lvListe;

    private List<String> list;

    public void btList_onClick(){
        list = new List<String>();
    }

    public void btIsEmpty_onClick(){
        if (list.isEmpty()) {
            lblIsEmpty.setText("Liste leer!");
        }
        else {
            lblIsEmpty.setText("Liste gefüllt!");
        }
        //gibAus();
    }

    public void btHasAccess_onClick(){
        if (list.hasAccess()){
            lblHasAccess.setText("Es gibt ein aktuelles Element!");
        }
        else {
            lblHasAccess.setText("Es gibt kein aktuelles Element!");
        }
        gibAus();
    }

    public void btNext_onClick(){
        list.next();
        gibAus();
    }

    public void btToFirst_onClick(){
        list.toFirst();
        gibAus();
    }

    public void btToLast_onClick(){
        list.toLast();
        gibAus();
    }
    public void btGetContent_onClick(){
        lblGetContent.setText(list.getContent().toString());
        gibAus();
    }

    public void btSetContent_onClick(){
        list.setContent(tfSetContent.getText());
        gibAus();
    }

    public void btAppend_onClick(){
        list.append(tfAppend.getText());
        gibAus();
    }

    public void btInsert_onClick(){
        list.insert(tfInsert.getText());
        gibAus();
    }

    public void btConcat_onClick(){
        //To Be Defined
    }

    public void btRemove_onClick(){
        list.remove();
        gibAus();
    }

    public void gibAus(){
        List<String> list2 = new List<String>();
        lvListe.getItems().clear();
        while (!list.isEmpty()){
            //vorderstes Element ausgeben/in listView übertragen + zwischenspeichern auf list2 + aus list löschen
            list.toFirst();
            lvListe.getItems().add(list.getContent().toString());
            list2.insert(list.getContent());
            list2.toFirst();
            list.remove();
        }
        //list rekonstruieren (und list2 leeren)
        while (!list2.isEmpty()){
            list2.toFirst();
            list.append(list2.getContent());
            list2.remove();
        }
        btIsEmpty_onClick();
        btHasAccess_onClick();
        btGetContent_onClick();
    }

}
