package Aufgabe2Fu�ball;

public class ZugriffNeu {
    public static void main(String[] args) {
        Schiedsrichter schiedsrichter = new Schiedsrichter();
        System.out.println("Wir sind hier in der wundersch�nen HueckTechArena versammelt.");
        System.out.println("Hier findet heute das Dorf-Derbie zwischen dem  FC H�ckelhoven und dem SV HueckHaupt statt.");
        System.out.println("\nDieses Spiel wird gesponsert von HueckTech\n" +
                "HueckTech - Programmed for your success!\n\n");
        boolean go = true;
        System.out.println("Anpfiff! Entscheiden Sie mit Hilfe der M�nze, welches Team Ansto� hat: ");
        System.out.println("Das spiel l�uft");
        //
        int ergebnisW1 = schiedsrichter.m�nzeWerfen();
        if (ergebnisW1 == 0) {
            System.out.println("Ansto� f�r den FC H�ckelhoven!");
        }
        else if (ergebnisW1 == 1) {
            System.out.println("Ansto� f�r den SV HueckHaupt");
        }

        for (int runden = 1; runden <= 20; runden++) {
            System.out.println("Runde " + runden + "von 20!" );

        }
        spielEnde(0, 0); //VAR TORE

    }

    public static void spielEnde (int toreSV, int toreFC){
        System.out.println("Das Spiel ist zu Ende!\n" +
                "Das Spiel endet mit " + toreFC + " Toren f�r den FC H�ckelhoven und " + toreSV + " Toren f�r den SV HueckHaupt!");
        if (toreFC > toreSV) {
            System.out.println("Der FC gewinnt damit die Partie!");
        }
        else if (toreSV > toreFC) {
            System.out.println("Der SV gewinnt damit die Partie!");
        }
        else if (toreSV == toreFC) {
            System.out.println("Das Spiel geht also Unentschieden aus!");
        }
        System.out.println("Besonderer dank gilt unserem langj�hrigen Sponsor HueckTech");

        System.out.println("SchoolBall22\n" +
                "Programmed by HueckTechGaming\n" +
                "Team: Johannes - Benedikt - Fabian\n" +
                "#MakePlayingGreatAgain");
    }
}

