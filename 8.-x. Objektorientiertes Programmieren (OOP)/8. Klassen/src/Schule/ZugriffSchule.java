package Schule;
import java.util.Scanner;

public class ZugriffSchule {
    public static void main(String[] args) {
        Schule schule = new Schule();
        Scanner scanner = new Scanner(System.in);
        boolean go = true;
        System.out.println("Bitte geben sie den aktuelllen tag an:");
        String tag = scanner.next();
        System.out.println("Bitte geben Sie die aktuelle Uhrzeit an (Format xx.xx , also z.B. 07.20):");
        double uhrzeit = scanner.nextDouble();
        int aktuelleStundeNR = Schule.aktuelleStunde(uhrzeit, 1);
        int aktuelleArrayWert = Schule.aktuelleStunde(uhrzeit, 2);
        while (go){
            System.out.println("Es ist " + tag + " um " + uhrzeit + ". Aktuell läuft die " + aktuelleStundeNR + ". Stunde.");
            System.out.println("Was wollen Sie tun?");
            System.out.println("\t(1) Uhrzeit und Stunde ändern");
            System.out.println("\t(2)Aktuelle Stunde ausgeben");
            System.out.println("\t(3) Nächste Stunde ausgeben");
            System.out.println("\t(4) Raum wechseln");
            System.out.println("\t(5) lernen");
            System.out.println("\t(6) Gelerntes wiedergeben");
            System.out.println("\t(7) Hausaufgaben machen");
            System.out.println("\t(8) Hausaufgabe hinzufügen");
            System.out.println("\t(9) Aufgaben machen");
            System.out.println("\t(10) Klausur/Test schreiben");
            System.out.println("\t(11) Materialien packen");
            System.out.println("\t(12) Materialien auspacken");
            System.out.println("\t(13) Sprechen/Melden");
            System.out.println("\t(14) Programm verlassen");

            int wunsch = scanner.nextInt();
            if (wunsch == 1) {

            }
            else if (wunsch == 2) {

            }
            else if (wunsch == 14) {
                System.exit(14);
            }
            else{
                System.out.println("Packages 'JavaFX for class Schule' and 'More Options for class Schule' are missing!");
                System.out.println("Please program this packages!");
            }
        }
    }
}
