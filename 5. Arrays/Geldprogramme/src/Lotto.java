import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        System.out.println("Herzlich Willkommen bei Lotto HueckTech - 6 aus 49");
        boolean spielen = true;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] tipps = new int[7];
        int[] ziehung = new int [7];
        boolean richtigeZahlen;
        int anzahlRichtige = 0;

        while(spielen) {
            boolean superzahl = false;
            // Eingabe der Tipps
            do {
                richtigeZahlen = true;
                for (int waehlen = 0; waehlen < 6; waehlen++) {
                    int nrTipp = waehlen + 1;
                    System.out.println("Bitte geben Sie Ihren Tipp Nr. " + nrTipp + " ein (1-49)!");
                    int eingabe = scanner.nextInt();
                    tipps[waehlen] = eingabe;
                }
                System.out.println("Bitte geben Sie noch Ihre Supperzahl ein (0-9)!");
                tipps[6]= scanner.nextInt();
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
            // Auslosen der Gewinnziffern
            for (int normaleZiehung = 0; normaleZiehung < 6; normaleZiehung++) {
                int  gezogeneZahl = random.nextInt(48);
                int gezogeneZahlKorrigiert = gezogeneZahl + 1;
                ziehung[normaleZiehung] = gezogeneZahlKorrigiert;
            }
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
                        System.out.println("Leider haben Sie nur einen richtigen TIpp.");
                    }
                    break;
                case 2:
                    if (superzahl) {
                        System.out.println("Glückwunsch! Sie haben zwei Richtige, plus die Superzahl!");
                    }
                    else {
                        System.out.println("Leider haben Sie nur zwei richtige TIpps abgegeben.");
                    }
                    break;
                case 3:
                    if (superzahl) {
                        System.out.println("Glückwunsch! Sie haben 3 Richtige und die Superzahl!");
                    }
                    else {
                        System.out.println("Glückwunsch! Sie haben 3 Richtige!");
                    }
                    break;
                case 4:
                    if (superzahl) {
                        System.out.println("Glückwunsch! Sie haben 4 Richtige und die Superzahl richtig.");
                    }
                    else{
                        System.out.println("Glückwunsch! Sie haben 4 Richtige!");
                    }
                    break;
                case 5:
                    if (superzahl) {
                        System.out.println("Glückwunsch! 5 von Ihren Tipps und die Superzahl sind Richtig!");
                    }
                    else {
                        System.out.println("Glückwunsch! Sie haben 5 Richtige!");
                    }
                    break;
                case 6:
                    if (superzahl) {
                        System.out.println("Glückwunsch! All Ihre Tipps sind richtig!");
                    }
                    else {
                        System.out.println("Glückwunsch! Sie haben 6 Richtige!");
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
                System.out.println("\n\n\nVielen Dank, dass Sie Lotto HueckTech verwendet haben!\n" +
                        "Wir hoffen Sie bald wiederzubeehren!");
            }
        }
    }
}
