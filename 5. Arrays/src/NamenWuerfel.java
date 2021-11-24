// TO-DO: String in Array-Namen umwandeln!

import java.util.Random;
import java.util.Scanner;

public class NamenWuerfel {
    public static void main(String[] args) {
        String kurseBenHef [][] = {
                // Latein (GK1)
                {"23", "Berra", "Liv", "Deniz", "Yan Yan", "Vivian", "Johannes", "Martha", "Dominik", "Adam",
                        "Benedikt H.", "Parnia", "Lucy", "Fatih", "Karim M.", "Katharina", "Denis", "Jakon",
                        "Melina", "Shaban", "Nevia", "Tufan", "Zümra", "Tuana"},
                // Informatik (GK1)
                {"22", "Liv", "Burcu", "Issa", "Deniz", "Emilio", "Daniel", "Eren", "Philipp G.", "Johannes", "Martha",
                        "Dominik", "Adam", "Jorit", "Benedikt H.", "Fabian", "Karim M.", "Vincent", "Denis", "Jakob",
                        "Valeria", "Nevia", "Sten"},
        };
        String accounts[][] = {
                {"BenHef", "password"},
        };

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
                if (accounts[i][0].equals(e_bn)) {
                    accountline = i;
                    break;
                }
            }



            if (accounts[accountline][1].equals(e_pw)) {
                go = true;
                gueltigerBN = e_bn;
            } else {
                System.out.println("Passwort und/oder Benutzername falsch!");
            }
        }
        // gueltigeListe = "kurse" + gueltigerBN; // Update required!
        boolean waehlen = true;

        int fachposition = 0;

        System.out.println("Willkommen!");
        while (go == true) {
            System.out.println("Wählen Sie bitte das Fach aus, in dem Sie würfeln möchten: ");
            String gewuenschtesFach = scan.next();
            if (gewuenschtesFach.equals("Deutsch")) {
                System.out.println("Diese Kursliste existiert noch nicht!");
            }
            else if(gewuenschtesFach.equals("Englisch")) {
                System.out.println("Diese Kursliste existiert noch nicht!");
            }
            else if (gewuenschtesFach.equals("Latein")) {
                fachposition = 0;
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
            else if (gewuenschtesFach.equals("Chemie")) {
                System.out.println("Diese Kursliste existiert noch nicht!");
            }
            else if (gewuenschtesFach.equals("Biologie")) {
                System.out.println("Diese Kursliste existiert noch nicht!");
            }
            else if (gewuenschtesFach.equals("Informatik")) {
                fachposition = 1;
            }
            waehlen = true;
            while (waehlen == true) {
                int gewuerfelt = wuerfelwerfen.nextInt(Integer.valueOf(kurseBenHef[fachposition][0]));
                System.out.println(kurseBenHef[fachposition][gewuerfelt] + " wurde gewürfelt.");
                System.out.println("\nNochmal werfen? (Ja/Nein)");
                String erneutwerfen = scan.next();
                if (erneutwerfen.equals("Ja")) {
                    waehlen = true;
                } else {
                    System.out.println("Stattdessen lieber das Fach wecheln? (Ja/Nein)");
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
