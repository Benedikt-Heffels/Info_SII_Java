package Liste._01_Stack._B_Umgekehrte_Polnische_Notation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UPN_Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage pStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UPN_FXML.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        pStage.setScene(scene);
        pStage.show();
        pStage.setTitle("UPN_Stack & Co.");
    }
}
