package Liste._01_Stack._B_Umgekehrte_Polnische_Notation;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class UPN_Controller {
    @FXML private TextField tfIsEmpty;
    @FXML private TextField tfPush;
    @FXML private TextField tfTop;
    @FXML private TextField tfUPN;
    @FXML private TextField tfKopie;
    @FXML private ListView lv;
    @FXML private Button btIsEmpty;
    @FXML private Button btPush;
    @FXML private Button btPop;
    @FXML private Button btTop;
    @FXML private Button btBerechnen;
    @FXML private Button btKopieren;

    private UPN_Stack<String> stack;

    public void btStack_onClick() {
        stack = new UPN_Stack<>();
        gibAus();
        btIsEmpty.setDisable(false);
        btPush.setDisable(false);
        btPop.setDisable(false);
        btTop.setDisable(false);
        btBerechnen.setDisable(false);
        btKopieren.setDisable(false);
        tfUPN.setText("UPN");
    }

    public void btIsEmpty_onClick() {
        if (stack.isEmpty()) tfIsEmpty.setText("ja - leer!"); else tfIsEmpty.setText("nicht leer!");
    }

    public void btPush_onClick() {
        stack.push(tfPush.getText());
        gibAus();
    }

    public void btPop_onClick() {
        stack.pop();
        gibAus();
    }

    public void btTop_onClick() {
        tfTop.setText("" + stack.top());
    }

    public void gibAus() {
        //Ausgabe über Hilfsstack
        UPN_Stack<String> s2 = new UPN_Stack<>();
        lv.getItems().clear();
        while (!stack.isEmpty()){
            //vorderstes Element ausgeben + zwischenspeichern auf Hilfsstack + löschen
            lv.getItems().add(stack.top());
            s2.push(stack.top());
            stack.pop();
        }
        //UPN_Stack rekonstruieren (und Hilfsstack leeren)
        while (!s2.isEmpty()){
            stack.push(s2.top());
            s2.pop();
        }
    }

    public void btKopie_click() {
        String k = tfUPN.getText();
        tfKopie.setText(k);
    }

    public void btBerechnen_onClick(){
        String upnText = tfUPN.getText();
        String upnText_aktuell;
        if (upnText.length() == 1) upnText_aktuell = upnText;
        else upnText_aktuell = upnText.substring(0, upnText.indexOf(" "));

        //Zahlen werden dem Stack hinzugefügt
        if (!upnText_aktuell.equals("+") && !upnText_aktuell.equals("-") && !upnText_aktuell.equals("*") &&
                !upnText_aktuell.equals("/")) {
            stack.push(upnText_aktuell);
        }
        else {
            double value2 = Double.parseDouble(stack.top()); //Der zweite Operand wird zuletzt hinzugefügt!
            stack.pop();
            double value1 = Double.parseDouble(stack.top()); //Der erste Operand wurde vorher hinzugefügt!
            stack.pop();
            double ergebnis = 0;
            switch (upnText_aktuell) {
                case "+": ergebnis = value1 + value2;
                case "-": ergebnis = value1 - value2;
                case "*": ergebnis = value1 * value2;
                case "/": ergebnis = value1 * value2;
            }
            stack.push(String.valueOf(ergebnis));
        }
        gibAus();
        if (upnText.length() == 1) { // Ausgabe des Ergebnis, wenn in tf nur noch der letzte Operand sein kann (Alternativ: UPN-Fehler)
            double zwischenspeicherung = Double.parseDouble(stack.top());
            stack.pop();
            if (stack.isEmpty()) {
                stack.push(String.valueOf(zwischenspeicherung));
                tfUPN.setText("E: " + stack.top());
                btBerechnen.setDisable(true);
            }
            else tfUPN.setText("Fehler");

        }
        else {
            upnText = upnText.substring(upnText.indexOf(" ") + 1);
            tfUPN.setText(upnText);
        }
    }

}
