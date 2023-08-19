package _01_Medizin_Automat;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller_Medizinautomat {

    @FXML private Button btFach;
    @FXML private TextField tfFach;

    @FXML private Button btRezept;
    @FXML private Button btFreiRezept;
    @FXML private Button btZahlRezept;

    @FXML private Button btWahl;
    @FXML private TextField tfWahl;

    @FXML private Button btZahlen;


    Medizinautomat medizinautomat = new Medizinautomat();
    Medizinautomat.tZustand zustand = Medizinautomat.tZustand.q0;
    Medizinautomat.tEingabe eingabe;
    Medizinautomat.tAusgabe ausgabe;

    int medNumber = 1; //Hilfe zur Unterscheidung der Eingaben btWahl und btWeitereWahl


    public void btFach_onClick(){
        if (btFach.getText().equals("Fach")) {
            eingabe = Medizinautomat.tEingabe.btFach;
            zustand = medizinautomat.Übergangsfunktion(zustand, eingabe); //Eingabe alter Zustand, Rückgabe neuer Zustand
            ausgabe = medizinautomat.Ausgabefunktion(eingabe);
            print(eingabe, zustand, ausgabe, true, "Bitte Fachpin eingeben!");
            btFach.setText("Pin übermitteln");
            tfFach.setVisible(true);
        }
        else if (btFach.getText().equals("Pin übermitteln")){
            tfFach.getText(); //Man stelle sich hier eine Abfrage vor, ob Pin wahr ist...
            eingabe = Medizinautomat.tEingabe.code;
            zustand = medizinautomat.Übergangsfunktion(zustand, eingabe);
            Medizinautomat.tAusgabe ausgabe = medizinautomat.Ausgabefunktion(eingabe);
            print(eingabe, zustand, ausgabe, true, "Pin " + tfFach.getText() + " gültig, Ihr Medikament wird ausgegeben. Bis bald!");
            tfFach.setText("Fachpin hier");
            btFach.setText("Fach");
            tfFach.setVisible(false);
        }
    }

    public void btRezept_onClick(){
        eingabe = Medizinautomat.tEingabe.btRezept;
        zustand = medizinautomat.Übergangsfunktion(zustand, eingabe); //Eingabe alter Zustand, Rückgabe neuer Zustand
        ausgabe = medizinautomat.Ausgabefunktion(eingabe);
        print(eingabe, zustand, ausgabe, false, null);
        btFreiRezept.setVisible(true);
        btZahlRezept.setVisible(true);
    }

    public void btFreiRezept_onClick(){
        eingabe = Medizinautomat.tEingabe.freiRezept;
        zustand = medizinautomat.Übergangsfunktion(zustand, eingabe);
        ausgabe = medizinautomat.Ausgabefunktion(eingabe);
        print(eingabe, zustand, ausgabe, true, "Rezept akzeptiert, Ihr Medikament wird ausgegeben. Bis bald!");
        btZahlRezept.setVisible(false);
        btFreiRezept.setVisible(false);
    }

    public void btZahlRezept_onClick(){
        eingabe = Medizinautomat.tEingabe.zahlRezept;
        zustand = medizinautomat.Übergangsfunktion(zustand, eingabe);
        ausgabe = medizinautomat.Ausgabefunktion(eingabe);
        print(eingabe, zustand, ausgabe, true, "Rezept akzeptiert, bitte Medikament bezahlen!");
        btZahlen.setVisible(true);
    }

    public void btWahl_onClick(){
        if (btWahl.getText().equals("Wahl")) {
            tfWahl.setVisible(true);
            eingabe = Medizinautomat.tEingabe.btWahl;
            zustand = medizinautomat.Übergangsfunktion(zustand, eingabe);
            ausgabe = medizinautomat.Ausgabefunktion(eingabe);
            print(eingabe, zustand, ausgabe, true, "Bitte Medikamentenwahl eingeben!");
            btWahl.setText("(Weitere) Wahl übermitteln");
        }
        else if (btWahl.getText().equals("(Weitere) Wahl übermitteln") && medNumber == 1) {
            String med = tfWahl.getText();
            eingabe = Medizinautomat.tEingabe.wahl;
            zustand = medizinautomat.Übergangsfunktion(zustand, eingabe);
            ausgabe = medizinautomat.Ausgabefunktion(eingabe);
            print(eingabe, zustand, ausgabe, true, med + " ausgewählt.");
            btZahlen.setVisible(true);
            tfWahl.setVisible(false);
            medNumber = 2;
        }
        else if (btWahl.getText().equals("(Weitere) Wahl übermitteln") && medNumber == 2) {
            eingabe = Medizinautomat.tEingabe.btWeitereWahl;
            zustand = medizinautomat.Übergangsfunktion(zustand, eingabe);
            ausgabe = medizinautomat.Ausgabefunktion(eingabe);
            print(eingabe, zustand, ausgabe, false, null);
            tfWahl.setVisible(true);
            tfWahl.setText("Name des Medikamentes");
            medNumber = 1;
        }
    }

    public void btZahlen_onClick(){
        eingabe = Medizinautomat.tEingabe.karteZahlung;
        zustand = medizinautomat.Übergangsfunktion(zustand, eingabe);
        ausgabe = medizinautomat.Ausgabefunktion(eingabe);
        print(eingabe, zustand, ausgabe, true, "Zahlung erfolgreich, Ihr Medikament wird ausgegeben. Bis bald!");
        btWahl.setText("Wahl"); //Wiederherstellung Ursprungszustand
        tfWahl.setText("Name des Medikamentes");
        tfWahl.setVisible(false);
        btZahlRezept.setVisible(false);
        btFreiRezept.setVisible(false);
        btZahlen.setVisible(false);
        medNumber = 1;
    }




    public void print(Medizinautomat.tEingabe pEingabe, Medizinautomat.tZustand pZustand, Medizinautomat.tAusgabe pAusgabe,
                      boolean bNote, String note)  {
        System.out.print("Aktueller Zustand: " + pZustand + " | Eingabe: " + pEingabe + " | Ausgabe: " + pAusgabe);
        if (bNote) {
            System.out.print(" | Bemerkung: " + note);
        }
        System.out.print("\n");
    }

}
