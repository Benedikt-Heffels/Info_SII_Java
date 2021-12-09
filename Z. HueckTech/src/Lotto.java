
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        System.out.println("Herzlich Willkommen bei Lotto HueckTech - 6 aus 49");
        boolean spielen = true;
        long kontostand = 100;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] tipps = new int[7];
        int[] ziehung = new int [7];
        boolean richtigeZahlen;
        boolean nutzbareZahlen;
        boolean zahlenListeHinzufuegen = true;
        int anzahlRichtige = 0;

        while(spielen) {
            System.out.println("Die Runde kostet 1 Euro!");
            System.out.println("Wollen Sie spielen? (Ja/Nein)");
            String spielstart = scanner.next();
            if (spielstart.equals("Ja")) {
                if (kontostand >= 1) {
                    kontostand -= 1;
                    System.out.println("Kontostand: " + kontostand + "€");
                }
                else {
                    System.out.println("Auf Ihrem Konto ist leider nicht genug Geld für die Runde.");
                    System.exit(2);
                }
            }
            else {
                break;
            }
            boolean superzahl = false;
            // Eingabe der Tipps
            do {
                richtigeZahlen = true;
                for (int waehlen = 0; waehlen < 6; waehlen++) {
                    nutzbareZahlen = false;
                    do {
                        zahlenListeHinzufuegen = true;
                        int nrTipp = waehlen + 1;
                        System.out.println("Bitte geben Sie Ihren Tipp Nr. " + nrTipp + " ein (1-49, noch nicht getippt)!");
                        int eingabe = scanner.nextInt();
                        if (eingabe <= 49 && eingabe >= 1) {
                            for (int alteZahlenPositionen = 0; alteZahlenPositionen < waehlen; alteZahlenPositionen++) {
                                if (tipps[alteZahlenPositionen] == eingabe) {
                                    zahlenListeHinzufuegen = false;
                                    break;
                                }
                            }
                            if (zahlenListeHinzufuegen) {
                                tipps[waehlen] = eingabe;
                                nutzbareZahlen = true;
                            }
                            else {
                                System.out.println("Die Eingabe war fehlerhaft!");
                                nutzbareZahlen = false;
                            }
                        }
                        else {
                            System.out.println("Die Eingabe war fehlerhaft!");
                            nutzbareZahlen = false;
                        }
                    } while (!nutzbareZahlen);
                }
                zahlenListeHinzufuegen = false;
                do {
                    System.out.println("Bitte geben Sie noch Ihre Supperzahl ein (0-9)!");
                    int esuperzahl = scanner.nextInt();
                    if (esuperzahl <= 9 && esuperzahl >= 0) {
                        tipps[6] = esuperzahl;
                        zahlenListeHinzufuegen = true;
                    }
                    else {
                        System.out.println("Ihre Superzahl war ungültig!");
                    }
                }while (!zahlenListeHinzufuegen);
                System.out.print("\nDas ist ihre Eingabe: ");
                for (int i = 0; i < 7; i++) {
                    System.out.print(tipps[i] + " ");
                }
                System.out.println("\nIst das so richtig? (Ja/Nein, bei Nein geben Sie alle Tipps erneut ein)");
                String zahlenRichtig = scanner.next();
                if (zahlenRichtig.equals("Nein")) {
                    richtigeZahlen = false;
                }
            }while (!richtigeZahlen);
            boolean lose_gueltig = true;
            // Auslosen der Gewinnziffern + Kontrolle, dass jede nur einmal vorkommt
            do {
                lose_gueltig = true;
                for (int normaleZiehung = 0; normaleZiehung < 6; normaleZiehung++) {
                    int gezogeneZahl = random.nextInt(48);
                    int gezogeneZahlKorrigiert = gezogeneZahl + 1;
                    ziehung[normaleZiehung] = gezogeneZahlKorrigiert;
                }
                for (int position1_array = 0; position1_array < 6; position1_array++) {
                    for (int position2_array = 0; position2_array < 6; position2_array++) {
                        if(position1_array != position2_array) {
                            if (ziehung[position1_array] == ziehung[position2_array]) {
                                lose_gueltig = false;
                            }
                        }
                    }
                }
            } while (!lose_gueltig);
            ziehung[6] = random.nextInt(9);

            // Gewinnkontrolle
            for (int elementInTipp = 0; elementInTipp < 6; elementInTipp++) {
                for (int elementInZiehung = 0; elementInZiehung < 6; elementInZiehung++) {
                    if (tipps[elementInTipp] == ziehung[elementInZiehung]) {
                        anzahlRichtige += 1;
                    }
                }
            }
            if (tipps[6] == ziehung[6]) {
                superzahl = true;
            }
            // Zuordnung des Gewinnes
            System.out.println("\n\n");
            switch (anzahlRichtige) {
                case 0:
                    if (superzahl) {
                        System.out.println("Leider trifft nur die Superzahl zu.");
                    }
                    else {
                        System.out.println("Leider ist keiner Ihrer Tipps richtig.");
                    }
                    break;
                case 1:
                    if (superzahl) {
                        System.out.println("Leider haben Sie nur einen richtigen Tipp, plus die Superzahl.");
                    }
                    else {
                        System.out.println("Leider haben Sie nur einen richtigen Tipp.");
                    }
                    break;
                case 2:
                    if (superzahl) {
                        System.out.println("Glückwunsch! Sie haben zwei Richtige, plus die Superzahl!");
                        System.out.println("Sie haben 6 Euro gewonnen!");
                        kontostand += 6;
                    }
                    else {
                        System.out.println("Leider haben Sie nur zwei richtige Tipps abgegeben.");
                    }
                    break;
                case 3:
                    if (superzahl) {
                        System.out.println("Glückwunsch! Sie haben 3 Richtige und die Superzahl!");
                        System.out.println("Sie haben 26 Euro gewonnen!");
                        kontostand += 26;
                    }
                    else {
                        System.out.println("Glückwunsch! Sie haben 3 Richtige!");
                        System.out.println("Sie haben 14 Euro gewonnen!");
                        kontostand += 14;
                    }
                    break;
                case 4:
                    if (superzahl) {
                        System.out.println("Glückwunsch! Sie haben 4 Richtige und die Superzahl richtig.");
                        System.out.println("Sie haben 243 Euro gewonnen!");
                        kontostand += 243;
                    }
                    else{
                        System.out.println("Glückwunsch! Sie haben 4 Richtige!");
                        System.out.println("Sie haben 68 Euro gewonnen!");
                        kontostand += 68;
                    }
                    break;
                case 5:
                    if (superzahl) {
                        System.out.println("Glückwunsch! 5 von Ihren Tipps und die Superzahl sind Richtig!");
                        System.out.println("Sie haben 17000 Euro gewonnen!");
                        kontostand += 17000;
                    }
                    else {
                        System.out.println("Glückwunsch! Sie haben 5 Richtige!");
                        System.out.println("Sie haben 5500 Euro gewonnen!");
                        kontostand += 5500;
                    }
                    break;
                case 6:
                    if (superzahl) {
                        System.out.println("Glückwunsch! All Ihre Tipps sind richtig!");
                        System.out.println("Hauptgewinn! Sie haben 3,5 Millionen Euro gewonnen!!");
                        kontostand += 3500000;
                    }
                    else {
                        System.out.println("Glückwunsch! Sie haben 6 Richtige!");
                        System.out.println("Sie haben 2,5 Millionen Euro gewonnen!");
                        kontostand += 2500000;
                    }
                    break;
            }
            System.out.print("\nDies waren Ihre Tipps: ");
            for (int element = 0; element < 7; element++) {
                System.out.print(tipps[element] + " ");
            }
            System.out.print("\nDies waren die Zufallszahlen: ");
            for (int element = 0; element < 7; element++) {
                System.out.print(ziehung[element] + " ");
            }
            System.out.println("\n\nErneut spielen? (Ja/Nein)");
            String nochESpiel = scanner.next();
            if (nochESpiel.equals("Nein")) {
                spielen = false;
            }
        }
        System.out.println("\n\n\nIhr Kontostand bei der HueckTechBank: " + kontostand + "€");
        System.out.println("\nVielen Dank, dass Sie Lotto HueckTech verwendet haben!\n" +
                "Wir hoffen Sie bald wiederzubeehren!");
    }
}