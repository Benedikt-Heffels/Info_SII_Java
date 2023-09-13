package _02_DEA._03_Terme;

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
    private Termautomat.tEingabe eingabe;

    public void btEingabe_onClick(){
        String eingabe = tfTerm.getText();
        while (eingabe.length() > 0) {
            int leerzeichen1 = eingabe.indexOf(" ");
            String sub = eingabe.substring(0, leerzeichen1);
            eingabe = eingabe.substring(leerzeichen1 + 1, eingabe.length());
            if (sub.equals("+")){
                termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.plus);
            }
            else if (sub.equals("-")){
                termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.minus);
            }
            else if (sub.equals("*")) {
                termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.mal);
            }
            else if (sub.equals("/")){
                termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.geteilt);
            }
            else {
                try{
                    Integer.parseInt(sub);
                    termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.zahl);
                }
                catch (Exception e) {
                    termautomat.überganzgfunktion(zustand, Termautomat.tEingabe.error);
                }
            }

        }
    }
/*
    public void print()  {
        System.out.print("Aktueller Zustand: " + pZustand + " | Eingabe: " + pEingabe + " | Ausgabe: " + pAusgabe);
        System.out.print("\n");
    }
    */
    }


