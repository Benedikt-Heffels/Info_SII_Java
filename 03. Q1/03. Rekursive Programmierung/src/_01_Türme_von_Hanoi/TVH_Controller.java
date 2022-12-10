package _01_Türme_von_Hanoi;
//Fehlerquelle: static
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class TVH_Controller {
    @FXML public Button btStart;
    @FXML public Button btAutomatisch;
    @FXML public Button btNext;

    @FXML public TextField tfAnzahlScheiben;

    @FXML public Label lblAnzahlZüge;
    @FXML public Label lblZugbeschreibung;

    @FXML public static ListView lvTurmA;
    @FXML public static ListView lvTurmB;
    @FXML public static ListView lvTurmC;


    static Türme_von_Hanoi türme_von_hanoi = new Türme_von_Hanoi();

    public int anzahlScheiben;
    public static boolean nextRunning = false;


    public void btStart_onClick(){
        if (!tfAnzahlScheiben.getText().equals("Anzahl Scheiben") && !tfAnzahlScheiben.getText().equals("")){
            btAutomatisch.setDisable(false);
            btNext.setDisable(false);
            lblAnzahlZüge.setDisable(false);
            lblZugbeschreibung.setDisable(false);

            anzahlScheiben = Integer.valueOf(tfAnzahlScheiben.getText());
            türme_von_hanoi.setAnzahlScheiben(anzahlScheiben);
        }
        else {
            tfAnzahlScheiben.setText("Bitte Anzahl Scheiben Angeben!");
        }

    }

    public void btNext_onClick(){
        nextRunning = true;
        btNext.setDisable(true);
        if (!türme_von_hanoi.isRunning()){
            türme_von_hanoi.move(anzahlScheiben, "A", "C", "B", true);
        }
    }

    public void btAutomatisch_onClick(){
        türme_von_hanoi.move(anzahlScheiben, "A", "C", "B", false);
    }

    //Unschön: Zugriff auf TVH-Klasse -> Verbesserungsansatz
    public static void gibAus(boolean sourceNext){ //boolean sourceNext: Vgl. TVH-Klasse
        if (sourceNext) {
            nextRunning = false;
            //btNext.setDisable(false);
        }

        //Ausgabe über Hilfsstack
        //TURMA
        TVH_Stack<String> s2 = new TVH_Stack<String>();
        lvTurmA.getItems().clear();
        while (!türme_von_hanoi.TurmA.isEmpty()){
            //vorderstes Element ausgeben + zwischenspeichern auf Hilfsstack + löschen
            lvTurmA.getItems().add(türme_von_hanoi.TurmA.top());
            s2.push(türme_von_hanoi.TurmA.top());
            türme_von_hanoi.TurmA.pop();
        }
        //Stack rekonstruieren (und Hilfsstack leeren)
        while (!s2.isEmpty()){
            türme_von_hanoi.TurmA.push(s2.top());
            s2.pop();
        }

        //TURMB
        s2 = new TVH_Stack<String>();
        lvTurmB.getItems().clear();
        while (!türme_von_hanoi.TurmB.isEmpty()){
            //vorderstes Element ausgeben + zwischenspeichern auf Hilfsstack + löschen
            lvTurmB.getItems().add(türme_von_hanoi.TurmB.top());
            s2.push(türme_von_hanoi.TurmB.top());
            türme_von_hanoi.TurmB.pop();
        }
        //Stack rekonstruieren (und Hilfsstack leeren)
        while (!s2.isEmpty()){
            türme_von_hanoi.TurmB.push(s2.top());
            s2.pop();
        }

        //TURMC
        s2 = new TVH_Stack<String>();
        lvTurmC.getItems().clear();
        while (!türme_von_hanoi.TurmC.isEmpty()){
            //vorderstes Element ausgeben + zwischenspeichern auf Hilfsstack + löschen
            lvTurmC.getItems().add(türme_von_hanoi.TurmC.top());
            s2.push(türme_von_hanoi.TurmC.top());
            türme_von_hanoi.TurmC.pop();
        }
        //UPN_Stack rekonstruieren (und Hilfsstack leeren)
        while (!s2.isEmpty()){
            türme_von_hanoi.TurmC.push(s2.top());
            s2.pop();
        }

        if (sourceNext){
            while (!nextRunning){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Fehler");
                }

            }
        }

    }
}
