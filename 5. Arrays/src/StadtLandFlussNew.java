import java.util.Random;
import java.util.Scanner;

public class StadtLandFlussNew {
    public static void main(String[] args) {
        // Allgemeine Definitionen
        System.out.println("Herzlich Willkommen bei Stadt-Land-Fluss!");
        System.out.println("Mit wie vielen Spielern wollt ihr spielen (2-5)?");
        Scanner allgeingaben = new Scanner(System.in);
        int anzahlplayer = allgeingaben.nextInt();
        System.out.println("Wie viele Runden wollt ihr spielen? (1-3)");
        int anzahlrunden = allgeingaben.nextInt();
        System.out.println("Es gibt folgende Kategorien: Stadt - Land - Fluss - Tier - Pflanze - Spiel.");

        String[] ep1 = {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel"};
        String[] ep2 = {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel"};
        String[] ep3 = {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel"};
        String[] ep4 = {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel"};
        String[] ep5 = {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel"};
        String round1[][] = {
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
        };
        String round2[][]= {
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
        };
        String round3 [][] = {
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
                {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel", "Ergebnis"},
        };
        Scanner spieleingaben = new Scanner(System.in);
        Random randomwert = new Random();


        // ----------------------------------------- Spiel --------------------------------------------------------------
        int durchlaufenerunden = 1;
        while (durchlaufenerunden <= anzahlrunden) {
            char buchstabe = (char) (randomwert.nextInt(26) + 'A');
            for (int nowplayer = 1; nowplayer <= anzahlplayer; nowplayer++) {
                switch (nowplayer) {
                    case 1:
                        System.out.println("Spieler 1: Stadt - Land - Fluss - Tier - Pflanze - Spiel");
                        System.out.println("Anfangsbuchstabe: " + buchstabe);
                        System.out.println("Stadt:");
                        ep1[0] = spieleingaben.next();
                        System.out.println("Land:");
                        ep1[1] = spieleingaben.next();
                        System.out.println("Fluss:");
                        ep1[2] = spieleingaben.next();
                        System.out.println("Tier:");
                        ep1[3] = spieleingaben.next();
                        System.out.println("Pflanze:");
                        ep1[4] = spieleingaben.next();
                        System.out.println("Spiel:");
                        ep1[5] = spieleingaben.next();
                        break;
                    case 2:
                        System.out.println("Spieler 2: Stadt - Land - Fluss - Tier - Pflanze - Spiel");
                        System.out.println("Anfangsbuchstabe: " + buchstabe);
                        System.out.println("Stadt:");
                        ep2[0] = spieleingaben.next();
                        System.out.println("Land:");
                        ep2[1] = spieleingaben.next();
                        System.out.println("Fluss:");
                        ep2[2] = spieleingaben.next();
                        System.out.println("Tier:");
                        ep2[3] = spieleingaben.next();
                        System.out.println("Pflanze:");
                        ep2[4] = spieleingaben.next();
                        System.out.println("Spiel:");
                        ep2[5] = spieleingaben.next();
                        break;
                    case 3:
                        System.out.println("Spieler 3: Stadt - Land - Fluss - Tier - Pflanze - Spiel");
                        System.out.println("Anfangsbuchstabe: " + buchstabe);
                        System.out.println("Stadt:");
                        ep3[0] = spieleingaben.next();
                        System.out.println("Land:");
                        ep3[1] = spieleingaben.next();
                        System.out.println("Fluss:");
                        ep3[2] = spieleingaben.next();
                        System.out.println("Tier:");
                        ep3[3] = spieleingaben.next();
                        System.out.println("Pflanze:");
                        ep3[4] = spieleingaben.next();
                        System.out.println("Spiel:");
                        ep3[5] = spieleingaben.next();
                        break;
                    case 4:
                        System.out.println("Spieler 4: Stadt - Land - Fluss - Tier - Pflanze - Spiel");
                        System.out.println("Anfangsbuchstabe: " + buchstabe);
                        System.out.println("Stadt:");
                        ep4[0] = spieleingaben.next();
                        System.out.println("Land:");
                        ep4[1] = spieleingaben.next();
                        System.out.println("Fluss:");
                        ep4[2] = spieleingaben.next();
                        System.out.println("Tier:");
                        ep4[3] = spieleingaben.next();
                        System.out.println("Pflanze:");
                        ep4[4] = spieleingaben.next();
                        System.out.println("Spiel:");
                        ep4[5] = spieleingaben.next();
                        break;
                    case 5:
                        System.out.println("Spieler 5: Stadt - Land - Fluss - Tier - Pflanze - Spiel");
                        System.out.println("Anfangsbuchstabe: " + buchstabe);
                        System.out.println("Stadt:");
                        ep5[0] = spieleingaben.next();
                        System.out.println("Land:");
                        ep5[1] = spieleingaben.next();
                        System.out.println("Fluss:");
                        ep5[2] = spieleingaben.next();
                        System.out.println("Tier:");
                        ep5[3] = spieleingaben.next();
                        System.out.println("Pflanze:");
                        ep5[4] = spieleingaben.next();
                        System.out.println("Spiel:");
                        ep5[5] = spieleingaben.next();
                        break;
                }
            }

            // Eingabe-Arrays werden in RUnden-Arrays übertragen (+theoretische Ausgabe, derzeit auskommentiert)
            if (anzahlplayer >= 1) {
                System.out.println("\nSpieler 1:");
                for (int ausgaben = 0; ausgaben <= 5; ausgaben++) {
                    //System.out.print(ep1[ausgaben] + " - ");
                    switch (durchlaufenerunden) {
                        case 1:
                            round1[0][ausgaben] = ep1[ausgaben];
                            break;
                        case 2:
                            round2[0][ausgaben] = ep1[ausgaben];
                            break;
                        case 3:
                            round3[0][ausgaben] = ep1[ausgaben];
                            break;
                    }
                }
            }
            if (anzahlplayer >= 2) {
                System.out.println("\nSpieler 2:");
                for (int ausgaben = 0; ausgaben <= 5; ausgaben++) {
                    //System.out.print(ep2[ausgaben] + " - ");
                    switch (durchlaufenerunden) {
                        case 1:
                            round1[1][ausgaben] = ep2[ausgaben];
                            break;
                        case 2:
                            round2[1][ausgaben] = ep2[ausgaben];
                            break;
                        case 3:
                            round3[1][ausgaben] = ep2[ausgaben];
                            break;
                    }
                }
            }
            if(anzahlplayer >= 3){
                System.out.println("\nSpieler 3:");
                for(int ausgaben = 0; ausgaben <= 5; ausgaben++) {
                    //System.out.print(ep3[ausgaben] + " - ");
                    switch (durchlaufenerunden) {
                        case 1:
                            round1[2][ausgaben] = ep3[ausgaben];
                            break;
                        case 2:
                            round2[2][ausgaben] = ep3[ausgaben];
                            break;
                        case 3:
                            round3[2][ausgaben] = ep3[ausgaben];
                            break;
                    }
                }
            }
            if (anzahlplayer >= 4) {
                System.out.println("\nSpieler 4:");
                for(int ausgaben = 0; ausgaben <= 5; ausgaben++) {
                    //System.out.print(ep4[ausgaben] + " - ");
                    switch (durchlaufenerunden) {
                        case 1:
                            round1[3][ausgaben] = ep4[ausgaben];
                            break;
                        case 2:
                            round2[3][ausgaben] = ep4[ausgaben];
                            break;
                        case 3:
                            round3[3][ausgaben] = ep4[ausgaben];
                            break;
                    }
                }
            }
            if (anzahlplayer >= 5) {
                System.out.println("\nSpieler 5:");
                for(int ausgaben = 0; ausgaben <= 5; ausgaben++) {
                    //System.out.print(ep5[ausgaben] + " - ");
                    switch (durchlaufenerunden) {
                        case 1:
                            round1[4][ausgaben] = ep5[ausgaben];
                            break;
                        case 2:
                            round2[4][ausgaben] = ep5[ausgaben];
                            break;
                        case 3:
                            round3[4][ausgaben] = ep5[ausgaben];
                            break;
                    }
                }
            }

            // Punktebewertung
            for(int element = 0; element <= 5; element++){
                switch (durchlaufenerunden) {
                    case 1: // Erste Runde

                }
            }
            durchlaufenerunden += 1;
        }
    }
}
