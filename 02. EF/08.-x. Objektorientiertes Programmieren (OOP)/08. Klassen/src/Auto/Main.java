//by Benedikt und Johannes


package Auto;
import java.util.Scanner;
import java.awt.*;
import java.net.URI;



public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static Auto autowahlTreffen(Auto auto) {
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
                go = false;
            }
        }

        auto = new Auto();
        if (autowahl == 1) {
            System.out.println("Sie haben die haben die G-Klasse gewählt, Ihr neues Auto benötigt 15 Liter Benzin auf " +
                    "Hundert Kilometer, sie haben eine Maximale Tankfüllung von 100 Litern");
            auto.setVerbrauch100KM(15.0);
            auto.setMöglicheTankfüllung(100);
            auto.setAutoType("G-Klasse");
        }
        else if (autowahl == 2) {
            System.out.println("Sie haben die haben die A-Klasse gewählt, Ihr neues Auto benötigt 8 Liter Benzin auf " +
                    "Hundert Kilometer");
            auto.setVerbrauch100KM(8.0);
            auto.setMöglicheTankfüllung(66);
            auto.setAutoType("A-Klasse");
        }

        else if (autowahl == 3) {
            System.out.println("Sie haben die haben die E-Klasse gewählt, Ihr neues Auto benötigt 11 Liter Benzin auf " +
                    "Hundert Kilometer");
            auto.setVerbrauch100KM(11.0);
            auto.setMöglicheTankfüllung(51);
            auto.setAutoType("E-Klasse");
        }

        else if (autowahl == 4) {
            System.out.println("Sie haben die haben die S-Klasse Guard gewählt, Ihr neues Auto benötigt 19,5 Liter Benzin auf " +
                    "Hundert Kilometer und , und ist ein Rund um gepanzertes Fahrzeug, sie könnten sogar einer Bombe " +
                    "standhalten, jetzt nur noch auf nach Afghanistan (wenn sie das Wollen).");
            auto.setVerbrauch100KM(19.5);
            auto.setMöglicheTankfüllung(100);
            auto.setAutoType("S-Klasse Guard");
        }

        else{
            System.out.println("Sie haben leider eine ungültige Wahl getroffen");
        }
        return auto;
    }

    public static Auto farbeÄndern(Auto auto) {
        while (true) {
            System.out.println("Willkommen in Ihrer Lackierwerkstatt!");
            if (auto.getAutoType().equals("S-Klasse Guard")) {
                System.out.println("Leider ist die S-Klasse Guard nur in schwarz verfügbar!");
                break;
            }
            System.out.println("Bitte geben sie die Nummer Ihrer gewünschter Autofarbe für Ihren " + auto.getAutoType()
                    + " hier an: ");
            System.out.println("\t(1) Schwarz");
            System.out.println("\t(2) Grau");
            System.out.println("\t(3) Rot");
            System.out.println("\t(4) Weiß");
            int farbwahl = scanner.nextInt();
            if (farbwahl == 1) {
                auto.setFarbe("schwarz");
            } else if (farbwahl == 2) {
                auto.setFarbe("grau");
            } else if (farbwahl == 3) {
                auto.setFarbe("rot");
            } else if (farbwahl == 4) {
                auto.setFarbe("weiß");
            }
            break;
        }
        return auto;
    }

    public static Auto autoAnzeigen(Auto auto) {
        System.out.println("Alle wichtigen Daten:");
        System.out.println("Modell: " + auto.getAutoType());
        System.out.println("Farbe: " + auto.getFarbe());
        System.out.println("Aktuelle Tankfüllung: " + auto.getTankfüllungAktuell() + " Liter von " +
                auto.getMöglicheTankfüllung() + " möglichen Litern");
        System.out.println("Schaden: Das Auto ist zu "  + auto.getSchaden() + " kaputt.");
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen bei Mercedes-Benz!");
        Auto auto = new Auto();
        boolean go = true;
        while (go) {
            System.out.println("Willkommen!");
            System.out.println("Was wollen Sie tun?");
            boolean isAutoDefined = auto.isAutoDefined();
            if (!isAutoDefined) {
                System.out.println("\t(1) Auto wählen");
                System.out.println("\t(2) Auto wählen, um es zu kaufen");
                System.out.println("\t(100) Programm verlassen");
            }
            else if (isAutoDefined) {
                System.out.println("\t(1) Auto ändern");
                System.out.println("\t(2) Aktuelles Auto kaufen");
                System.out.println("\t(3) Lackieren");
                System.out.println("\t(4) Auto anzeigen");
                System.out.println("\t(5) Auto fahren");
                System.out.println("\t(100) Programm verlassen");
            }
            System.out.println("Bitte Zahl eingeben: ");
            int wahl = scanner.nextInt();

            //Wahl
            if (!isAutoDefined && wahl == 1 || isAutoDefined && wahl == 1) {
                auto = autowahlTreffen(auto);
            }
            else if (!isAutoDefined && wahl == 2) {
                //AUTO KAUFEN
            }
            else if (isAutoDefined && wahl == 3) {
                farbeÄndern(auto);
            }
            else if (isAutoDefined && wahl == 4) {
                autoAnzeigen(auto);
            }
            else if (isAutoDefined && wahl == 5) {
                //FAHREN
            }
            else if (wahl == 100) {
                System.out.println("Vielen Dank, das Sie dieses Programm zum bestellen Ihres neuen Mercedes-Benz" +
                        "verwendet haben. Wir wünschen Ihnen noch einen schönen Tag!");
                System.out.println("Ihre Mercedes-Benz Vertragswerkstätten Heffels-Goergens");
                System.out.println("#Let'sMakeDrivingGreatAgain");
                System.exit(100);
            }
        }
    }
}


/*
UPDATE:
- Fahren
    - Bestimmte Strecke
    - Freie Strecke
- Farbe
- Tanken
- Kaufen
 */