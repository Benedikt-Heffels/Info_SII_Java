import java.sql.SQLOutput;
import java.util.Scanner;

public class StadtLandFluss {
    public static void main(String[] args) {
        // Allgemeine Definitionen
        System.out.println("Herzlich Willkommen bei Stadt-Land-Fluss!");
        System.out.println("Mit wie vielen Spielern wollt ihr spielen (2-5)?");
        Scanner allgeingaben = new Scanner(System.in);
        int anzahlplayer = allgeingaben.nextInt();
        System.out.println("Wie viele Runden wollt ihr spielen?");
        int anzahlrunden = allgeingaben.nextInt();
        System.out.println("Es gibt folgende Kategorien: Stadt - Land - Fluss - Tier - Pflanze - Spiel.");

        String[] ep1 = {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel"};
        String[] ep2 = {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel"};
        String[] ep3 = {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel"};
        String[] ep4 = {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel"};
        String[] ep5 = {"Stadt", "Land", "Fluss", "Tier", "Pflanze", "Spiel"};
        Scanner spieleingaben = new Scanner(System.in);
        // Spiel
        int durchlaufenerunden = 1;
        while (durchlaufenerunden <= anzahlrunden) {

            for (int nowplayer = 1; nowplayer <= anzahlplayer; nowplayer++) {
                System.out.println("Stadt - Land - Fluss - Tier - Pflanze - Spiel");

            }
            durchlaufenerunden += 1;
        }
    }
}
