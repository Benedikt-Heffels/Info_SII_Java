package Aufgabe4Parkhaus;
import java.util.Scanner;

public class Zugriff {
    public static void global(Ticket paramTicket){
    }
    public static void main(String[] args) {
        Automat Automat = new Automat();
        Parker Parker = new Parker();
        System.out.println("Herzlich Willkommen bei HueckTechParking!");
        System.out.println("Der Parkpreis pro angefangene Stunde beträgt " + Automat.getParkpreisPerHour() + " €.");
        System.out.println("Wichtig: Dieses Parkhaus erlaubt kein Nachtparken und schließt von 24:00 bis 06:00 Uhr!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zum fortfahren ENTER drücken");
        String scan1 = scanner.nextLine();
        if (scan1.equals("PedMat")) {
            System.out.println("Hallo, Herr Mat***! Hier können Sie das Programm mit theoretischen Werten ausprobieren.");
            System.out.println("Diese nicht-praxisorientierte Umschreibung  wurde extra für Sie vollzogen!");
            System.out.println("Bitte geben Sie die Startzeit (hh:mm:ss) ein:");
            String scan_startzeit = scanner.nextLine();
            Automat.setStartzeit(scan_startzeit);
            Parker.neuesTicketNehmenONLYFORPEDMAT();
            System.out.println("Bitte geben Sie die Endzeit (hh:mm:ss) ein:");
            String scan_endzeit = scanner.nextLine();
            System.out.println("Preis wird berechnet...");
            Automat.setAktuelleZeit(scan_endzeit);
            Parker.gebuehrBezahlenONLYFORPEDMAT();
            boolean bezahlt = Parker.isBezahlt();
            if (bezahlt == true) {
                System.out.println("*Schranke geht auf*\n" +
                        "Gute Fahrt!\n" +
                        "Ihr HueckTechParking");
            } else {
                System.out.println("Herr Mat***, Parken ist nicht umsonst! Bezahlen!");
            }
        }
        else {
            System.out.println("Bitte loggen sie sich mit ihrem Account bei der HueckTech-Bank ein!(WIRD ÜBERSPRUNGEN, DA VERBINDUNG NICHT VORHANDEN)");//Wie Zugriff?
            Parker.neuesTicketNehmen();
            System.out.println("Parkhaus verlassen? (ENTER)");
            String scan2 = scanner.nextLine();
            System.out.println("Preis wird berechnet...");
            Parker.gebuehrBezahlen();
            boolean bezahlt = Parker.isBezahlt();
            if (bezahlt == true) {
                System.out.println("*Schranke geht auf*\n" +
                        "Gute Fahrt!\n" +
                        "Ihr HueckTechParking");
            }
            else {
                System.out.println("Sie müssen erst noch bezahlen!");
            }



        }
    }
}
