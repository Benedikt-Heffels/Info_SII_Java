package _02_DEA._01_Programme._03_Terme;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_Termautomat extends Application {

    public static void main(String[] args) {
        //System.out.println("Aktueller Zustand: q0 | Eingabe: nichts | Ausgabe: nichts");
        launch(args);
    }

    @Override
    public void start(Stage pStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXML_Termautomat.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        pStage.setScene(scene);
        pStage.show();
        pStage.setTitle("Überprüfung zur Gültigkeit von Termen");
    }
}
