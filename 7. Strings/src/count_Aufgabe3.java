//Program by Benedikt Heffels

import java.util.Scanner;

public class count_Aufgabe3 {
    public static void main(String[] args) {
        System.out.println("Text eingeben:");
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.next();
        System.out.println("Welchen Buchstaben möchten Sie suchen?");
        String suchstabe = scanner.next();
        int anzahlSuchstaben = 0;
        for (int y = 0; y < eingabe.length(); y++) {
            if ((String.valueOf(eingabe.charAt(y)).equals(suchstabe))){
                anzahlSuchstaben += 1;
            }
        }
        int längeEingabe = 0;
        for (int x = 0; x < eingabe.length(); x++) {
            längeEingabe += 1;
        }
        System.out.println("Ihr gesuchter Buchstabe ist " + anzahlSuchstaben + " mal im Text vorhanden!");
        System.out.println("Der Text ist " + längeEingabe + " Buchstaben lang!");
    }
}