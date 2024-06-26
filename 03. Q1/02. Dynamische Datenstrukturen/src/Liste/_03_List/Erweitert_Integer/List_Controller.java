package Liste._03_List.Erweitert_Integer;
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

    @FXML private TextField tfCount;
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
    @FXML private Button btTausche;
    @FXML private Button btUmdrehen;

    @FXML private Button btCount;

    @FXML private Button btToMax;
    @FXML private Button btAverage;
    @FXML private TextField tfToMax;
    @FXML private TextField tfAverage;

    @FXML private Button btLineareSuche;
    @FXML private TextField tfLineareSuche;

    @FXML private Button btBinaereSuche;
    @FXML private TextField tfBinaereSuche;

    @FXML private Button btBubbleSort;
    @FXML private  TextField tfBubbleSort;


    private List_SaS list; //Fragestellung: Wie kriege ich in diese Variable sowohl List_Integer als auch List_Erweitert

    public void btList_click() {
        list = new List_SaS(){};
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
        btCount.setDisable(false);
        btTausche.setDisable(false);
        btUmdrehen.setDisable(false);

        btToMax.setDisable(false);
        btAverage.setDisable(false);

        tfIsEmpty.setDisable(false);
        tfHasAccess.setDisable(false);
        tfGetContent.setDisable(false);
        tfSetContent.setDisable(false);
        tfAppend.setDisable(false);
        tfInsert.setDisable(false);
        tfAverage.setDisable(false);
        tfToMax.setDisable(false);
        tfCount.setDisable(false);

        btLineareSuche.setDisable(false);
        tfLineareSuche.setDisable(false);

        btBinaereSuche.setDisable(false);
        tfBinaereSuche.setDisable(false);
        btBubbleSort.setDisable(false);
        tfBubbleSort.setDisable(false);
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
        tfGetContent.setText(list.getContent().toString());
    }

    public void btSetContent_click() {
        list.setContent(Integer.valueOf(tfSetContent.getText()));
        gibAus();
    }

    public void btAppend_click() {
        list.append(Integer.valueOf(tfAppend.getText()));
        gibAus();
    }

    public void btInsert_click() {
        list.insert(Integer.valueOf(tfInsert.getText()));
        gibAus();
    }

    public void btConcat_click() {
        List<Integer> l2 = new List<Integer>() {};
        l2.append(1);l2.append(2); l2.append(3); l2.append(10); l2.append(100); l2.append(500); l2.append(501);
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


    public void btCount_click(){
        tfCount.setText(String.valueOf(list.count()));
    }

    public void btTausche_click(){
        list.tauscheRechts();
        gibAus();
    }

    public void btUmdrehen_click(){
        list.dreheUm();
        gibAus();
    }

    public void btToMax_click(){
        if (list.toMax() != null){
            tfToMax.setText(list.toMax().toString());
        }
        gibAus();
    }

    public void btAverage_click(){
        if (list.average() != null){
            tfAverage.setText(list.average().toString());
        }
        gibAus();
    }

    public void btLineareSuche_click(){
        String search = tfLineareSuche.getText();
        if (list.lineareSuche(search)){
            tfLineareSuche.setText("Gefunden");
        }
        else tfLineareSuche.setText("Nicht gefunden");
        gibAus();
    }

    public void btBinaereSuche_click(){
        if (list.binaereSuche(Integer.parseInt(tfBinaereSuche.getText()))){
            tfBinaereSuche.setText("Gefunden");
        }
        else{
            tfBinaereSuche.setText("Nicht gefunden");
        }
        gibAus();
    }

    public void btBubbleSort_click(){
        tfBubbleSort.setText("Sortiere...");
        list.bubbleSort();
        gibAus();
        tfBubbleSort.setText("Sortiert!");
    }

    public void gibAus() {
        //Hilfsliste list2 - nur für Zwischenspeicherung current!
        List list2 = new List <Integer>(){};
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