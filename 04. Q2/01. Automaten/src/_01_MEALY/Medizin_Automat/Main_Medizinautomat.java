package _01_MEALY.Medizin_Automat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_Medizinautomat extends Application {

    public static void main(String[] args) {
        System.out.println("Aktueller Zustand: q0 | Eingabe: nichts | Ausgabe: nichts");
        launch(args);
        System.out.println("\n\nVielen Dank für Ihren Besuch in der Digitalen Apotheke Dr. Benedikt Heffels!");
        System.out.println("Es bediente Sie: Dr. Benedikt Heffels");
    }

    @Override
    public void start(Stage pStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXML_Medizinautomat.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        pStage.setScene(scene);
        pStage.show();
        pStage.setTitle("Digitale Apotheke Dr. Benedikt Heffels");
    }
}
