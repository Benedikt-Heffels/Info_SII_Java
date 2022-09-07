package Arbeitsblatt_Übungen_zur_Wiederholung.Aufgabe1_Zahlen;

import java.util.Scanner;

public class Aufgabe1_Zahlen {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie nun in jeder Zeile eine Zahl ein!");
        Scanner scanner = new Scanner(System.in);
        int zahl1 = scanner.nextInt();
        int zahl2 = scanner.nextInt();
        int zahl3 = scanner.nextInt();

        double schnitt = (zahl1 + zahl2 + zahl3) / 3;

        System.out.println("Der Durchschnitt Ihrer Zahlen ist " + schnitt);
    }
}
