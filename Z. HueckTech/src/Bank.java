import java.io.*;
import java.util.*;

public class Bank {
    public static File kontopath = new File("Z. HueckTech/users/NE-NichtEingeloggt.txt");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strkontopath = "Nicht eingeloogt!";
        boolean go = false; // Startet Hauptprogramm!
        System.out.println("Herzlich Willkommen in der HueckTechBank!");
        System.out.println("Bitte anmelden!");
        String strkontopathungueltig = (String) allg_funktionen.LogIn();
        if (!(strkontopathungueltig.equals("Nicht angemeldet!"))) {
            strkontopath = strkontopathungueltig;
            kontopath = new File(strkontopath);
            go = true;
        }
        else {
            System.out.println("Systemfehler");
            System.out.println("Fehlercode: S-B-LI-0001");
            System.exit(1);
        }
        int kontostand = 0;
        while (go) {
            System.out.println("\n\nWas wollen Sie tun?\n" +
                    "\t(1) Kontostand anzeigen\n" +
                    "\t(2) Geld auszahlen\n" +
                    "\t(3) Geld einzahlen\n" +
                    "Nummer eingeben:");
            int wahl = scanner.nextInt();
            int funktion = 0;
            kontostand = (int) allg_funktionen.kstd_lesen(strkontopath);
            switch (wahl) {
                case 1:
                    System.out.println("Ihr Kontostand: " + kontostand + "€");
                    break;
                case 2:
                    funktion = 2;
                    System.out.println("Wie viel Geld wollen Sie sich auszahlen lassen?");
                    int auszahlung = scanner.nextInt();
                    if (auszahlung <= kontostand) {
                        allg_funktionen.kstd_veraendern(strkontopath, auszahlung, funktion);
                    }
                    else {
                        boolean eingabe_auszahlung = false;
                        do {
                            System.out.println("Auf ihrem Konto sind nur " + kontostand + "€. Bitte ändern Sie den Betrag!");
                            int auszahlung2 = scanner.nextInt();
                            if (auszahlung2 <= kontostand) {
                                eingabe_auszahlung = true;
                                allg_funktionen.kstd_veraendern(strkontopath, auszahlung, funktion);
                            }
                        } while (!eingabe_auszahlung);
                    }
                    System.out.println("Ihre Auszahlung in Höhe von " + auszahlung + "€ ist erfolgt!");
                    kontostand = (int) allg_funktionen.kstd_lesen(strkontopath);
                    System.out.println("Ihr Kontostand beträgt nun " + kontostand + "€.");
                    break;
                case 3:
                    funktion = 1;
                    System.out.println("Wie viel Geld wollen Sie einzahlen?");
                    int einzahlung = scanner.nextInt();
                    allg_funktionen.kstd_veraendern(strkontopath, einzahlung, funktion);
                    System.out.println("Ihre Einzahlung in Höhe von " + einzahlung + " ist erfolgt!");
                    kontostand = (int) allg_funktionen.kstd_lesen(strkontopath);
                    System.out.println("Ihr Kontostand beträgt nun " + kontostand + "€.");
                    break;
                default:
                    System.out.println("Error");
            }

        }
    }
}