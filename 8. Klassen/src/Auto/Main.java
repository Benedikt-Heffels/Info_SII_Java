import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.net.URI;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen bei Mercedes-Benz!");
        boolean go = true;
        int autowahl = 0;
        while (go) {
            System.out.println("Welches Auto fahren Sie?");
            System.out.println("\t(1) Mercedes-Benz G-Klasse");
            System.out.println("\t(2) Mercedes-Benz A-Klasse");
            System.out.println("\t(3) Mercedes-Benz E-Klasse");
            System.out.println("\t(4) Mercedes-Benz S-Klasse Guard");
            System.out.println("\t(5) Was ist das?");
            System.out.println("Eingabe: ");
            autowahl = scanner.nextInt();
            if (autowahl == 5) {
                URI gKlasse = URI.create
                        ("https://www.mercedes-benz.de/passengercars/mercedes-benz-cars/models/g-class/suv-w463/explore/highlights.module.html");
                URI aKlasse = URI.create
                        ("https://www.mercedes-benz.de/passengercars/mercedes-benz-cars/models/a-class/hatchback-w177/explore.html");
                URI eKlasse = URI.create
                        ("https://www.mercedes-benz.de/passengercars/mercedes-benz-cars/models/e-class/saloon-w213-fl/explore.html");
                URI sKlasseGuard = URI.create
                        ("https://www.mercedes-benz.com/de/fahrzeuge/personenwagen/s-klasse/guard-sonderschutzversion-der-neuen-s-klasse/");
                try {
                    Desktop.getDesktop().browse(gKlasse);
                    Thread.sleep(10000);
                }
                catch (Exception e) {
                    System.out.println("Laden der G-Klasse schiefgelaufen!");
                }
                try {
                    Desktop.getDesktop().browse(aKlasse);
                    Thread.sleep(10000);
                }
                catch (Exception e) {
                    System.out.println("Laden der A-Klasse schiefgelaufen!");
                }
                try {
                    Desktop.getDesktop().browse(eKlasse);
                    Thread.sleep(10000);
                }
                catch (Exception e) {
                    System.out.println("Laden der E-Klasse schiefgelaufen!");
                }
                try {
                    Desktop.getDesktop().browse(sKlasseGuard);
                    Thread.sleep(10000);
                }
                catch (Exception e) {
                    System.out.println("Laden der S-Klasse Guard schiefgelaufen!");
                }
            }
            else {
                break;
            }
        }
        Auto auto = new Auto();
        if (autowahl == 1) {
            System.out.println("Sie haben die haben die G-Klasse gewählt, Ihr neues Auto benötigt 15 Liter Benzin auf " +
                    "Hundert Kilometer, sie haben eine Maximale Tankfüllung von 100 Litern");
            auto.setVerbrauch100KM(15.0);
            auto.setMöglicheTankfüllung(100);
        }
        else if (autowahl == 2) {
                System.out.println("Sie haben die haben die A-Klasse gewählt, Ihr neues Auto benötigt 8 Liter Benzin auf " +
                        "Hundert Kilometer");
            auto.setVerbrauch100KM(8.0);
            auto.setMöglicheTankfüllung(66);
        }

        else if (autowahl == 3) {
            System.out.println("Sie haben die haben die E-Klasse gewählt, Ihr neues Auto benötigt 11 Liter Benzin auf " +
                    "Hundert Kilometer");
            auto.setVerbrauch100KM(11.0);
            auto.setMöglicheTankfüllung(51);
        }

        else if (autowahl == 4) {
            System.out.println("Sie haben die haben die S-Klasse Guard gewählt, Ihr neues Auto benötigt 19,5 Liter Benzin auf " +
                    "Hundert Kilometer und , und ist ein Rund um gepanzertes Fahrzeug, sie könnten sogar einer Bombe " +
                    "standhalten, jetzt nur noch auf nach Afghanistan (wenn sie das Wollen).");
            auto.setVerbrauch100KM(19.5);
            auto.setMöglicheTankfüllung(100);
        }

        else{
            System.out.println("Sie haben leider eine ungültige Wahl getroffen");
        }
    }
}
