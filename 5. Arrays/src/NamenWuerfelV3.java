// TO-DO: String in Array-Namen umwandeln!
// Idee: Array mit allen Kursen, Array mit zuordnung Benutzername - kurse

import java.util.Random;
import java.util.Scanner;

public class NamenWuerfelV3 {
    public static void main(String[] args) {
        String alleKurseMitTeilnahmern [][] = {
                // Latein (GK1)
                {"23", "Berra", "Liv", "Deniz", "Yan Yan", "Vivian", "Johannes", "Martha", "Dominik", "Adam",
                        "Benedikt H.", "Parnia", "Lucy", "Fatih", "Karim M.", "Katharina", "Denis", "Jakon",
                        "Melina", "Shaban", "Nevia", "Tufan", "Zümra", "Tuana"},
                // Latein (GK2)
                {"22", "A", "B", "C"},
                // Physik (GK2) --- Liste Fehlerhaft!
                {"20", "Johannes", "Dominik", "Eren", "Daniel"},
                // Chemie (GK1) --- Liste Fehlerhaft!
                {"20", "Benedikt H.", "Dominik", "Jule", "Annika", "Vivian", "Karim"},
                // Biologie (GK1) --- Liste fehlerhaft!
                {"20", "A", "B", "C"},
                // Informatik (GK1)
                {"22", "Liv", "Burcu", "Issa", "Deniz", "Emilio", "Daniel", "Eren", "Philipp G.", "Johannes", "Martha",
                        "Dominik", "Adam", "Jorit", "Benedikt H.", "Fabian", "Karim M.", "Vincent", "Denis", "Jakob",
                        "Valeria", "Nevia", "Sten"},

        };
        String accounts[][][] = {
                {{"BenHef", "password"}, {"0", "false", "4", "false", "6"}}, // accountline = 0
                {{"JohGoe", "vergessen"}, {"0", "3", "false", "false", "6"}}
        };

        String verwendeteListe [] = new String[25];

        Random wuerfelwerfen = new Random();
        Scanner scan = new Scanner(System.in);
        int accountline = 0;
        String gueltigeListe = "unkown";
        String gueltigerBN = "unkown";
        boolean go = false;
        System.out.println("Willkommen beim Namen-Würfel-Generator von BenTech.");
        System.out.println("Bitte loggen Sie sich ein, um Ihre Kurse abrufen und bearbeiten zu können!");
        while (go == false) {
            System.out.println("Benutzername:");
            String e_bn = scan.next();
            System.out.println("Passwort:");
            String e_pw = scan.next();
            for (int i = 0; i < 2; i++) {
                if (accounts[i][0][0].equals(e_bn)) {
                    accountline = i;
                    break;
                }
            }



            if (accounts[accountline][0][1].equals(e_pw)) {
                go = true;
                gueltigerBN = e_bn;
                System.out.println("Login erfolgreich - Willkommen!");
            } else {
                System.out.println("Passwort und/oder Benutzername falsch!");
            }
        }
        // gueltigeListe = "kurse" + gueltigerBN; // Update required!
        boolean waehlen = false;
        boolean gueltigeWahl = false;
        int gewuerfelt_bereinigt = 0;

        int fachposition = 0;


        while (go == true) {
            System.out.println("\n\nWählen Sie bitte das Fach aus, in dem Sie würfeln möchten: ");
            String gewuenschtesFach = scan.next();
            if (gewuenschtesFach.equals("Deutsch")) {
                System.out.println("Diese Kursliste existiert noch nicht!");
            }
            else if(gewuenschtesFach.equals("Englisch")) {
                System.out.println("Diese Kursliste existiert noch nicht!");
            }
            else if (gewuenschtesFach.equals("Latein")) {
                if (!(accounts[accountline][1][0].equals("false"))) {
                    fachposition = Integer.valueOf(accounts[accountline][1][0]);
                    waehlen = true;
                }
                else {
                    System.out.println("Du hast dieses Fach nicht belegt!");
                }
            }
            else if (gewuenschtesFach.equals("Musik")) {
                System.out.println("Diese Kursliste existiert noch nicht!");
            }
            else if (gewuenschtesFach.equals("Geschichte")) {
                System.out.println("Diese Kursliste existiert noch nicht!");
            }
            else if(gewuenschtesFach.equals("Sozialwissenschaften")) {
                System.out.println("Diese Kursliste existiert noch nicht!");
            }
            else if (gewuenschtesFach.equals("Religion")) {
                System.out.println("Diese Kursliste existiert noch nicht!");
            }
            else if (gewuenschtesFach.equals("Mathe")) {
                System.out.println("Diese Kursliste existiert noch nicht!");
            }
            else if (gewuenschtesFach.equals("Physik")) {
                if (!(accounts[accountline][1][1].equals("false"))) {
                    fachposition = Integer.valueOf(accounts[accountline][1][1]);
                    waehlen = true;
                }
                else {
                    System.out.println("Du hast dieses Fach nicht belegt!");
                }
            }
            else if (gewuenschtesFach.equals("Chemie")) {
                if (!(accounts[accountline][1][2].equals("false"))) {
                    fachposition = Integer.valueOf(accounts[accountline][1][2]);
                    waehlen = true;
                }
                else {
                    System.out.println("Du hast dieses Fach nicht belegt!");
                }
            }
            else if (gewuenschtesFach.equals("Biologie")) {
                if (!(accounts[accountline][1][3].equals("false"))) {
                    fachposition = Integer.valueOf(accounts[accountline][1][3]);
                    waehlen = true;
                }
                else {
                    System.out.println("Du hast dieses Fach nicht belegt!");
                }
            }
            else if (gewuenschtesFach.equals("Informatik")) {
                if (!(accounts[accountline][1][3].equals("false"))) {
                    fachposition = Integer.valueOf(accounts[accountline][1][3]);
                    waehlen = true;
                }
                else {
                    System.out.println("Du hast dieses Fach nicht belegt!");
                }
            }
            // Kopieren der Kursliste in den Array verwendete Liste
            for (int i = 0; i <= Integer.valueOf(alleKurseMitTeilnahmern[Integer.valueOf( fachposition)] [0]); i++) {
                verwendeteListe[i] = alleKurseMitTeilnahmern[fachposition][i];
            }
            while (waehlen == true) {
                gueltigeWahl = false;
                while (gueltigeWahl != true) {
                    int gewuerfelt = wuerfelwerfen.nextInt((Integer.valueOf(alleKurseMitTeilnahmern[fachposition][0]) - 1));
                    gewuerfelt_bereinigt = gewuerfelt + 1;
                    if (!(verwendeteListe[gewuerfelt_bereinigt].equals("false"))) {
                        gueltigeWahl = true;
                    }
                }

                System.out.println("\n\n" + verwendeteListe[gewuerfelt_bereinigt] + " wurde gewürfelt.");
                System.out.println("\nNochmal werfen? (Ja/Nein)");
                String erneutwerfen = scan.next();
                if (erneutwerfen.equals("Ja")) {
                    System.out.println("Möchten Sie " + verwendeteListe[gewuerfelt_bereinigt] + " " +
                            "aus der Übergangsliste löschen (= In diesem Durchgang nicht erneut würfelbar)? (Ja/Nein)");
                    String loeschen = scan.next();
                    if (loeschen.equals("Ja")) {
                        verwendeteListe[gewuerfelt_bereinigt] = "false";
                    }
                    waehlen = true;
                } else {
                    System.out.println("Stattdessen lieber das Fach wechseln? (Ja/Nein)");
                    String fachwechseln = scan.next();
                    if (fachwechseln.equals("Ja")) {
                        waehlen = false;
                    }
                    else {
                        System.out.println("Vielen Dank, dass Sie den Namen-Würfel-Generator von BenTech genutzt haben!\n" +
                                "Beehren Sie uns bald wieder!");
                        System.out.println("\n\nImpressum:\n" +
                                "BenTech GmbH\n" +
                                "BenPlaza 1\n" +
                                "52525-Randerath\n" +
                                "Deutschland\n" +
                                "#makelearninggreatagain");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
