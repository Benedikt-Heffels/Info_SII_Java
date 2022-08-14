package Handy;

import java.util.Scanner;

public class Zugriff {
    private static Handy handy = new Handy();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean needwelcome = Handy.isHandyDefined();
        if(!needwelcome) {
            welcome();
        }
        System.out.println("Bitte schalten Sie zunächst Ihr Handy ein!");
        String fortfahren = scanner.nextLine();
        handy.setAktivität();
        System.out.println("Durchgang1");
        Android.xiaomiSpecial();
        boolean go = true;
        while (go) {
            Android.xiaomiSpecial();
            System.out.println("Was wollen Sie tun?");
            System.out.println("\t(1) Übernachtung im B-Hotel buchen");
            System.out.println("\t(100) Handy deaktivieren");
            int wahl = scanner.nextInt();
            switch (wahl) {
                case 1:
                    handy.übernachtungBuchen();
                    break;
                case 100:
                    handy.setAktivität();
            }
        }
    }
    public static void welcome (){
        System.out.println("Herzlich Willkommen im Handy-Manager!");
        handy.setHandy();
    }
    public static void deaktiv (){
        System.out.println("Das Handy ist deaktiviert!");
        System.out.println("Bitte starten Sie ihr Handy neu (1) oder beenden das Programm (Enter)");
        Scanner scanner = new Scanner(System.in);
        String neustarten = scanner.nextLine();
        if (neustarten.equals("1")) {
            main(null);
        }
        System.out.println("Bis Bald!");
        System.out.println("\n\nHandy-Manager is a software by BenTechHandys GmbH.");
        System.out.println("Developed by BenTech in Germany.");
        System.out.println("Protected under the Law of Germany and the European Union.");
    }
}
