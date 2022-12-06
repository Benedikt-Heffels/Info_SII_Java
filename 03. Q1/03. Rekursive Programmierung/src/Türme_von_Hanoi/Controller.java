package Türme_von_Hanoi;
//Fehlerquelle: static <- BESEITIGT!
//Absturz ab zweitem Next-Klick
//Nicht alle ELemente werden in "Automatic" in die LV übernommen!

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class Controller {
    @FXML public Button btStart;
    @FXML public Button btAutomatisch;
    @FXML public Button btNext;

    @FXML public TextField tfAnzahlScheiben;

    @FXML public Label lblAnzahlZüge;
    @FXML public Label lblZugbeschreibung;

    @FXML public ListView lvTurmA;
    @FXML public ListView lvTurmB;
    @FXML public ListView lvTurmC;


    public int anzahlScheiben;
    public boolean nextRunning = false;
    public TVH_Stack <String> TurmA = new TVH_Stack <String>();
    public TVH_Stack <String> TurmB = new TVH_Stack <String>();
    public TVH_Stack <String> TurmC = new TVH_Stack <String>();;
    private boolean running = false;

    public void btStart_onClick(){
        if (!tfAnzahlScheiben.getText().equals("Anzahl Scheiben") && !tfAnzahlScheiben.getText().equals("")){
            btAutomatisch.setDisable(false);
            btNext.setDisable(false);
            lblAnzahlZüge.setDisable(false);
            lblZugbeschreibung.setDisable(false);

            anzahlScheiben = Integer.valueOf(tfAnzahlScheiben.getText());
            setAnzahlScheiben(anzahlScheiben);
        }
        else {
            tfAnzahlScheiben.setText("Bitte Anzahl Scheiben Angeben!");
        }
        tfAnzahlScheiben.setText("BEWEIS");

    }

    public void btNext_onClick(){
        nextRunning = true;
        btNext.setDisable(true);
        if (!running){
            move(anzahlScheiben, "A", "C", "B", true);
        }
    }

    public void btAutomatisch_onClick(){
        move(anzahlScheiben, "A", "C", "B", false);
    }

    public void gibAus(boolean sourceNext){ //boolean sourceNext: Vgl. TVH-Klasse
        if (sourceNext) {
            nextRunning = false;
            btNext.setDisable(false);
        }

        //Ausgabe über Hilfsstack
        //TURMA
        TVH_Stack<String> s2 = new TVH_Stack<String>();
        System.out.println("HIER");
        lvTurmA.getItems().clear();
        while (!TurmA.isEmpty()){
            //vorderstes Element ausgeben + zwischenspeichern auf Hilfsstack + löschen
            lvTurmA.getItems().add(TurmA.top());
            s2.push(TurmA.top());
            TurmA.pop();
        }
        //Stack rekonstruieren (und Hilfsstack leeren)
        while (!s2.isEmpty()){
            TurmA.push(s2.top());
            s2.pop();
        }

        //TURMB
        s2 = new TVH_Stack<String>();
        lvTurmB.getItems().clear();
        while (!TurmB.isEmpty()){
            //vorderstes Element ausgeben + zwischenspeichern auf Hilfsstack + löschen
            lvTurmB.getItems().add(TurmB.top());
            s2.push(TurmB.top());
            TurmB.pop();
        }
        //Stack rekonstruieren (und Hilfsstack leeren)
        while (!s2.isEmpty()){
            TurmB.push(s2.top());
            s2.pop();
        }

        //TURMC
        s2 = new TVH_Stack<String>();
        lvTurmC.getItems().clear();
        while (!TurmC.isEmpty()){
            //vorderstes Element ausgeben + zwischenspeichern auf Hilfsstack + löschen
            lvTurmC.getItems().add(TurmC.top());
            s2.push(TurmC.top());
            TurmC.pop();
        }
        //UPN_Stack rekonstruieren (und Hilfsstack leeren)
        while (!s2.isEmpty()){
            TurmC.push(s2.top());
            s2.pop();
        }

        if (sourceNext){
            while (!nextRunning){
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println("Fehler");
                }

            }
            System.out.println("WARTE AUF EINGABE");
        }

    }

    protected void scheibenHinzufügen(int anzahlScheiben) {
        for (int i = anzahlScheiben; i >= 1 ; i--) {
            TurmA.push(String.valueOf(i));
        }
    }

    public void setAnzahlScheiben(int anzahlScheiben) {
        this.anzahlScheiben = anzahlScheiben;
        scheibenHinzufügen(this.anzahlScheiben);
    }

    public void move(int pAnzahlScheiben, String von, String nach, String über, boolean sourceNext) { //sourceNext == true: Aufruf aus "NEXT", sonst Aufruf aus "AUTOMATIC"
        running = true;
        if (pAnzahlScheiben == 1){
            System.out.println("Bewege eine Scheibe von Turm " + von + " zum Turm " + nach + ".");
            //Überschreiben der Stacks -> Bessere Ausgabe
            if (von.equals("A") && nach.equals("B")){
                String element = TurmA.top();
                TurmA.pop();
                TurmB.push(element);
            }
            else if (von.equals("A") && nach.equals("C")){
                String element = TurmA.top();
                TurmA.pop();
                TurmC.push(element);
            }
            else if (von.equals("B") && nach.equals("A")){
                String element = TurmB.top();
                TurmB.pop();
                TurmA.push(element);
            }
            else if (von.equals("B") && nach.equals("C")){
                String element = TurmB.top();
                TurmB.pop();
                TurmC.push(element);
            }
            else if (von.equals("C") && nach.equals("A")){
                String element = TurmC.top();
                TurmC.pop();
                TurmA.push(element);
            }
            else if (von.equals("C") && nach.equals("B")){
                String element = TurmC.top();
                TurmC.pop();
                TurmA.push(element);
            }

            gibAus(sourceNext);
            if (!sourceNext){
                try {
                    Thread.sleep(100);
                    System.out.println("WAIT");

                } catch (Exception e){
                    System.out.println("Technische Probleme");
                }
            }
        }
        else {
            running = true;
            move(pAnzahlScheiben - 1, von, über, nach, sourceNext);
            running = true;
            move(1, von, nach, über, sourceNext);
            running = true;
            move(pAnzahlScheiben-1, über, nach, von, sourceNext);
            running = false;
        }
    }



}
