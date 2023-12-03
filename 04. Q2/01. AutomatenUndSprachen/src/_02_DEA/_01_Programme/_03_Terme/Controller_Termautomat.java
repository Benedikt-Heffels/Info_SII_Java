package _02_DEA._01_Programme._03_Terme;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller_Termautomat {

    @FXML
    private TextField tfTerm;
    @FXML
    private Button btEingabe;

    Termautomat termautomat = new Termautomat();
    private Termautomat.tZustand zustand = Termautomat.tZustand.z0;
    private Termautomat.tAusgabe ausgabe = Termautomat.tAusgabe.nichts;
    private Termautomat.tEingabe eingabe;

    public void btEingabe_onClick(){
        String eingabe = tfTerm.getText();
        while (eingabe.length() > 0) {
            eingabe = tfTerm.getText();
            int leerzeichen1 = eingabe.indexOf(" ");
            if (leerzeichen1 == 1 && eingabe.length() > 1){
                break;
            }
            String sub = eingabe.substring(0, leerzeichen1);
            eingabe = eingabe.substring(leerzeichen1 + 1);
            switch (sub) {
                case "+":
                    zustand = termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.plus);
                    ausgabe = termautomat.Ausgabefunktion(zustand);
                    print(zustand, Termautomat.tEingabe.plus, ausgabe);
                    break;
                case "-":
                    zustand = termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.minus);
                    ausgabe = termautomat.Ausgabefunktion(zustand);
                    print(zustand, Termautomat.tEingabe.minus, ausgabe);
                    break;
                case "*":
                    zustand = termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.mal);
                    ausgabe = termautomat.Ausgabefunktion(zustand);
                    print(zustand, Termautomat.tEingabe.mal, ausgabe);
                    break;
                case "/":
                    zustand = termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.geteilt);
                    ausgabe = termautomat.Ausgabefunktion(zustand);
                    print(zustand, Termautomat.tEingabe.geteilt, ausgabe);
                    break;
                default:
                    zustand = termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.zahl);
//                    try {
//                        Integer.parseInt(sub);
//                        termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.zahl);
//                    } catch (Exception e) {
//                        termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.error);
//                    }
                    ausgabe = termautomat.Ausgabefunktion(zustand);
                    print(zustand, Termautomat.tEingabe.zahl, ausgabe);
                    break;
            }
            tfTerm.setText(eingabe);
        }
    }
    public void print(Termautomat.tZustand pZustand, Termautomat.tEingabe pEingabe, Termautomat.tAusgabe pAusgabe)  {
        System.out.print("Aktueller Zustand: " + pZustand + " | Eingabe: " + pEingabe + " | Ausgabe: " + pAusgabe);
        System.out.print("\n");
    }
    }


