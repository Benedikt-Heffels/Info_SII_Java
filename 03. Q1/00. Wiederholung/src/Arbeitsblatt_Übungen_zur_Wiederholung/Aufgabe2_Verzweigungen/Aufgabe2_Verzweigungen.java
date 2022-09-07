package Arbeitsblatt_Übungen_zur_Wiederholung.Aufgabe2_Verzweigungen;

import java.util.Scanner;

public class Aufgabe2_Verzweigungen {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie den Namen des Wochentages ein: ");
        Scanner scanner = new Scanner(System.in);

        String eingabe = scanner.next();
        int wochentag = 0;

        if (eingabe.toUpperCase().substring(0,1).equals("MO")){
            wochentag = 1;
        }
        else if (eingabe.toUpperCase().substring(0,1).equals("DI")){
            wochentag = 2;
        }
        else if (eingabe.toUpperCase().substring(0,1).equals("MI")) {
            wochentag = 3;
        }
        else if (eingabe.toUpperCase().substring(0,1).equals("DO")) {
            wochentag = 4;
        }
        else if (eingabe.toUpperCase().substring(0,1).equals("FR")) {
            wochentag = 5;
        }
        else if (eingabe.toUpperCase().substring(0,1).equals("SA")) {
            wochentag = 6;
        }
        else if (eingabe.toUpperCase().substring(0,1).equals("SO")) {
            wochentag = 7;
        }

        if (wochentag <= 5){
            System.out.println("Schade, kein Wochenende :(");
        }
        else if (wochentag >= 6) {
            System.out.println("Schön :), Wochenende!");
        }
    }
}
