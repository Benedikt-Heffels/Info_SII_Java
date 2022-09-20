package _05_Programme_Unterricht._02_Taschenrechner;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class TR_Controller {
    @FXML
    public static ChoiceBox cB_Operator; // = new ChoiceBox(FXCollections.observableArrayList("Plus"));
    @FXML
    private Button button_ON;

    public void button_ON_onClick(ActionEvent actionEvent) {
        cB_Operator.getItems().add("Plus (+)");
        cB_Operator.getItems().add("Minus (-)");
        cB_Operator.getItems().add("Mal (*)");
        cB_Operator.getItems().add("Geteilt (/)");
    }


    //cB_Operator.getItems().add();


    //choiceBox.setItems(FXCollections.observableArrayList
    //        ("Plus (+)", "Minus (-)", "Mal (*)", "Geteilt (/)"))


}
