import java.io.*;
import java.util.*;

public class Bank {
    public static String strkontopath = "Nicht angemeldet!";
    public static File kontopath = new File("Z. HueckTech/users/NE-NichtEingeloggt.txt");
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean go = false; // Startet Hauptprogramm!
        System.out.println("Herzlich Willkommen in der HueckTechBank!");
        System.out.println("Bitte anmelden!");
        strkontopath = (String) allg_funktionen.LogIn();
        if (!(strkontopath.equals("Nicht angemeldet!"))) {
            kontopath = new File(strkontopath);
            go = true;
        }
        else {
            System.out.println("Systemfehler");
            System.out.println("Fehlercode: S-B-LI-0001");
            System.exit(1);
        }
        while (go) {
            System.out.println("Was wollen Sie tun?\n" +
                    "\t(1) Kontostand anzeigen\n" +
                    "\t(2) Geld auszahlen\n" +
                    "\t(3) Geld einzahlen\n" +
                    "Nummer eingeben:");
            int wahl = scanner.nextInt();
            switch (wahl) {
                case 1:
                    int kontostand = (int) allg_funktionen.kstd_lesen(strkontopath);
                    System.out.println(kontostand);
                default:
                    System.out.println("Error");
            }

        }
    }
}