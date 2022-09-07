package Arbeitsblatt_Übungen_zur_Wiederholung.Aufgabe4_Zeichenketten;

import java.util.Scanner;

public class Aufgabe4_Zeichenketten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Zeichenkette ein: ");
        String zeichenkette = scanner.nextLine(); //Eingabe
        String zeichenkette_gedreht = new StringBuilder(zeichenkette).reverse().toString().toUpperCase(); // gedrehte Zeichenkette
        System.out.println("\nIhre gedrehte Zeichenkette: " + zeichenkette_gedreht);
    }
}
