package _06_Datenbankklassen.Version_FXML;


import _06_Datenbankklassen.Version_MAT.DatabaseConnector;
import _06_Datenbankklassen.Version_MAT.QueryResult;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GUI_SQLLite_Controller {
    @FXML
    private Button bt_Verbindungsstart;
    @FXML
    private Button bt_BefehlAusfuehren;
    @FXML
    private TextField tf_SQLBefehl;
    @FXML
    private TableView tableView_SQL;

    static DatabaseConnector myDatabase;


    public void bt_Verbindungsstart_onClick(ActionEvent actionEvent){
        //Vorsicht! SQLite-Treiber ("jdbc" - jar-Datei) muss im Projekt eingebunden sein!
        //dazu unter "File-Project Structure-Modules-Dependencies" die jar-Datei hinzufügen!
        myDatabase = new DatabaseConnector("",0,"04. Q2/02. Datenbankprogrammierung/src/_06_Datenbankklassen/Bank.db3","","");
        //Fehlermeldungen ggf. auch testweise provozieren!
        if (myDatabase.getErrorMessage() != null)
            tf_SQLBefehl.setText("Fehler! " + myDatabase.getErrorMessage());
        else tf_SQLBefehl.setText("Okay, die Datenbank ist bereit! Notiere hier Deine SQL-Anfrage!");
    }

    public void setBt_BefehlAusfuehren(ActionEvent actionEvent){
        //SQL-Abfrage wird an die Datenbank weitergegeben!
        myDatabase.executeStatement(tf_SQLBefehl.getText());
        System.out.println(myDatabase.getErrorMessage());
        //Ergebnistabelle der SQL-Abfrage wird in myQueryResult abgespeichert!
        QueryResult myQueryResult = myDatabase.getCurrentQueryResult();
        //Hilfsvariablen
        int Spalten = myQueryResult.getColumnCount();
        int Zeilen = myQueryResult.getRowCount();
        String [] Spaltentitel = myQueryResult.getColumnNames();
        String [][] Daten = myQueryResult.getData();

        //Kopieren der Daten in die TaableView
        tf_SQLBefehl.setEditable(true);

        //???????

        /*
        //Anpassen der Tabellengröße an (Ergebnistabelle der) SQL-Abfrage
        jTable1Model.setRowCount(Zeilen);
        jTable1Model.setColumnCount(Spalten);
        //Einfügen der Spaltenüberschriften
        for (int i=0; i<Spalten; i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderValue(Spaltentitel[i]);
        }
        //Einfügen der Daten
        for (int i=0; i<Zeilen; i++) {
            for (int j=0; j<Spalten; j++) {
                jTable1.setValueAt(Daten[i][j],i,j);
            }
        }
         */
    }
}
