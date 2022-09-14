package _01_Tutorial_TU_Dortmund.Teil1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button button1;
    @FXML
    private TextField textField1;
    @FXML
    private Label label1;

    public void button1_onClick(ActionEvent actionEvent) {
        String eingabe = textField1.getText();

        label1.setText(eingabe);
    }

    public TextField getTextField1() {
        return textField1;
    }

    public void setLabel1(Label label1) {
        this.label1 = label1;
    }
}
