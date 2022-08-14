package Aufgabe2Fußball;

import java.util.Random;
import java.util.Scanner;

public class Spiel {

    public Spiel(){};
    private static Random random = new Random();
    private static SV_HueckHaupt sv_hueckHaupt = new SV_HueckHaupt();
    private static FC_Hückelhoven fc_hückelhoven = new FC_Hückelhoven();
    private static Scanner scanner = new Scanner(System.in);

    //Diese Methode regelt den Verlauf des Spieles!
    public static void verlauf(){
        System.out.println("Aktueller Spielstand: " + sv_hueckHaupt.getToreSV() + " Tore für den SV HueckHaupt und " + fc_hückelhoven.getToreFC() + " Tore für den FC Hückelhoven.");
        int IFereignis = random.nextInt(10);
        if (IFereignis % 2 == 0) { //SPEZIALEREIGNISS
            int whichEreigniss = random.nextInt(100);
            if (whichEreigniss % 3 == 0) {
                //Spieler
            }
            else if (whichEreigniss % 16 == 0) {
                //Faul/Schirientscheidung
            }
            else if (whichEreigniss % 25 == 0) {
                //TOOOOOOOR
            }
        }
        System.out.println("Was wollen Sie tun?");
        System.out.println("\t(0) Nichts");
        System.out.println("\t(1) Eine Karte verhängen");
        System.out.println("\t(2) Die Münze werfen");
        System.out.println("\t(3) Pfeifen");
        System.out.println("\t(4) Den HueckTechTanz aufführen");
        System.out.println("\t(130) Spiel verlassen");
        int wahl = scanner.nextInt();
        switch (wahl) {
            case 1:
                Schiedsrichter.karteZeigen();
                break;
            case 2:
                Schiedsrichter.münzeWerfen();
                break;
            case 3:

                break;
            case 4:
                System.out.println("Der Schiedsrichter führt den HueckTechTanz aus.");
                break;
            case 130:
                ZugriffNeu.spielEnde(sv_hueckHaupt.getToreSV(), fc_hückelhoven.getToreFC());
        }

    }
}


/*
- Faul
- Ereignis
- NICHTS
 */

/*
range 10
wenn zahl gerade: spezielles ereigniss
    new random range 100
    %3 = Easteregg
        random mannschaft
    %16 = Faul
    %25 = TOOOOOOOOOOOOOOOOOR

wenn zahl ungerade: kein ereigniss - nichts spezielles passiert. Schiri-Abfrage
 */