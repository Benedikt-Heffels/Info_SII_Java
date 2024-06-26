package _05_Programme_Unterricht._01_Ratespiel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.util.Random;

public class RS_Controller {
    @FXML
    Button bt_Start;
    @FXML
    Button bt_Eingabe;
    @FXML
    TextField tf_Eingabe;
    @FXML
    Label lbl_Lösung;

    private int gesuchteZahl;
    private int anzahlVersuche;

    public void bt_Start_onClick(ActionEvent actionEvent){
        Random random = new Random();
        gesuchteZahl = random.nextInt(0, 100);
        lbl_Lösung.setText("Zu suchende Zahl wurde ermittelt. Viel Glück beim finden!");
    }


    public void bt_Eingabe_onClick(ActionEvent actionEvent){
        anzahlVersuche += 1;
        //int eingabe = Integer.valueOf(tf_Eingabe.getText().toString());
        if (Integer.valueOf(tf_Eingabe.getText().toString()) == gesuchteZahl){
            lbl_Lösung.setText
                    ("Sie haben in " + anzahlVersuche + " Versuchen die gesuchte Zahl "+ gesuchteZahl + " erraten! Glückwunsch!");
        }
        else if (Integer.valueOf(tf_Eingabe.getText().toString()) < gesuchteZahl) {
            lbl_Lösung.setText("Die gesuchte Zahl ist größer als Ihre Eingabe!");
        }
        else if (Integer.valueOf(tf_Eingabe.getText().toString()) > gesuchteZahl) {
            lbl_Lösung.setText("Die gesuchte Zahl ist kleiner als Ihre Eingabe!");
        }
    }
}
