package Aufgabe2Fußball;

import java.util.Random;

public class Schiedsrichter {
    public Schiedsrichter () {}

    private String aktuelleKarte = "NONE";

    public void Karte_zeigen(String karte, String spieler) {
        System.out.println("Welche Karte?");
        System.out.println("\t(1) Rote Karte");
        System.out.println("\t(2) Gelbe Karte");
        System.out.println("\t(3) Gazprom-Karte");
    }
    public static int münzeWerfen() {
        Random random = new Random();
        int entscheidung = random.nextInt(2);
        if (entscheidung == 0) {
            System.out.println("Kopf!");
        }
        else if (entscheidung == 1) {
            System.out.println("Zahl!");
        }
        else {
            System.out.println("Schiri, wir wissen wo dein... - dass du nicht fangen kannst!");
        }
        return entscheidung;
    }
}
