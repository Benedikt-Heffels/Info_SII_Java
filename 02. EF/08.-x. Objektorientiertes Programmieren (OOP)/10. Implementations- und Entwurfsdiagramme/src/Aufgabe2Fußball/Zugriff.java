package Aufgabe2Fußball;

import java.util.Scanner;

public class Zugriff {
    public static void main(String[] args) {
        System.out.println("Willkommen, Schiedsrichter!");
        boolean go = true;
        while (go) {
            System.out.println("Das Spiel läuft, was wollen Sie tun?");
            System.out.println("\t(1)Karte zeigen");
            System.out.println("\t(2) Münze werfen");
            System.out.println("\t(3) Pfeifen");
            System.out.println("Zahl eingeben:");
            Scanner scanner = new Scanner(System.in);
            int wahl_basic = scanner.nextInt();
            switch (wahl_basic) {
                case 1:

                case 2:

                case 3:

            }

            System.out.println("(1)Rote Karte");
            System.out.println("(2)Gelbe Karte");
            System.out.println("(3)Arsch Karte");
            System.out.println("(4) Gazprom-Werbe-Karte");
            Scanner kartenScanner = new Scanner(System.in);
            int wahl_karte = scanner.nextInt();
            switch (wahl_karte) {

            }
        }
    }

}
