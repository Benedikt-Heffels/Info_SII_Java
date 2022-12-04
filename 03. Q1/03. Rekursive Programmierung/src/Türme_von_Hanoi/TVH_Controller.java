package Türme_von_Hanoi;

import javafx.event.ActionEvent;
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

    public void btStart_onClick(ActionEvent actionEvent){
        btAutomatisch.setVisible(true);
        btNext.setVisible(true);

    }
}
