import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie den Monat in Zahlenform ein:");
        Scanner eingabe = new Scanner(System.in);
        int monatszahl = eingabe.nextInt();
        switch (monatszahl) {
            case 1:
                System.out.println("Der gesuchte Monat ist Januar! Er hat 31 Tage.");
                break;
            case 2:
                System.out.println("Der gesuchte Monat ist Februar! Er hat 28 Tage (in einem Schaltjahr 29).");
                break;
            case 3:
                System.out.println("Der gesuchte Monat ist März! Er hat 31 Tage.");
                break;
            case 4:
                System.out.println("Der gesuchte Monat ist April! Er hat 30 Tage.");
                break;
            case 5:
                System.out.println("Der gesuchte Monat ist April! Er hat 31 Tage.");
                break;
            case 6:
                System.out.println("Der gesuchte Monat ist Juni! Er hat 30 Tage.");
                break;
            case 7:
                System.out.println("Der gesuchte Monat ist Juli! Er hat 31 Tage.");
                break;
            case 8:
                System.out.println("Der gesuchte Monat ist August! Er hat 31 Tage.");
                break;
            case 9:
                System.out.println("Der gesuchte Monat ist September! Er hat 30 Tage.");
                break;
            case 10:
                System.out.println("Der gesuchte Monat ist Oktober! Er hat 31 Tage.");
                break;
            case 11:
                System.out.println("Der gesuchte Monat ist November! Er hat 30 Tage");
                break;
            case 12:
                System.out.println("Der gesuchte Monat ist Dezember! Er hat 31 Tage");
                break;
            case 13:
                System.out.println("Da ist woll jemand ganz Jeck...");
                System.out.println("Stammst du aus Köln? (Ja/Nein)");
                Scanner Wohnort = new Scanner(System.in);
                String Koelnornot = Wohnort.next();
                if (Koelnornot == "Ja") {
                    System.out.println("Der Monat hat doch kein Ende...");
                }
                else if (Koelnornot == "Nein") {
                    System.out.println("Er geht vom 11.11. um 11:11 Uhr bis Veilchendienstag");
                }
                break;
            default:
                System.out.println("Den Monat gibt es nicht...");
        }
    }
}
