package Türme_von_Hanoi;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class TVH_Controller {
    @FXML private Button btStart;
    @FXML private Button btAutomatisch;
    @FXML private Button btNext;

    @FXML private TextField tfAnzahlScheiben;

    @FXML private Label lblAnzahlZüge;
    @FXML private Label lblZugbeschreibung;

    @FXML private ListView lvTurmA;
    @FXML private ListView lvTurmB;
    @FXML private ListView lvTurmC;


    Türme_von_Hanoi türme_von_hanoi;
    int anzahlScheiben;
    public void btStart_onClick(){
        if (!tfAnzahlScheiben.getText().equals("Anzahl Scheiben") && !tfAnzahlScheiben.getText().equals("")){
            btAutomatisch.setDisable(false);
            btNext.setDisable(false);
            lblAnzahlZüge.setDisable(false);
            lblZugbeschreibung.setDisable(false);

            anzahlScheiben = Integer.valueOf(tfAnzahlScheiben.getText());
            türme_von_hanoi = new Türme_von_Hanoi(anzahlScheiben);
        }
        else {
            tfAnzahlScheiben.setText("Bitte Anzahl Scheiben Angeben!");
        }

    }

    public void btAutomatisch_onClick(){
        türme_von_hanoi.move(anzahlScheiben, "A", "C", "B");
    }
}
