package Arbeitsblatt_Übungen_zur_Wiederholung.Aufgabe3_Wiederholungen;

import java.util.Scanner;

public class Aufgabe3_Wiederholungen {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie Ihr Passwort ein:");
        boolean go;
        do {
            Scanner scanner = new Scanner(System.in);
            String passwort_eingabe = scanner.next();
            if (passwort_eingabe.equals("SuperSicheresPasswort!")){
                go = false;
                System.out.println("Richtige Eingabe! Herzlich Willkommen im SuperSicherenPasswortSafe!");
            }
            else {
                System.out.println("Die Eingabe war falsch! Bitte versuchen Sie es erneut!");
                go = true;
            }
        } while (go);
    }
}
