package Handy;

import java.util.Scanner;

public class Handy {
    public Handy(){}
    private static Scanner scanner = new Scanner(System.in);
    protected static boolean Aktivität = false;
    private static String Type[] = {"Betriebssystem", "Hersteller", "Typ"};
    private static String Marken[][] = {{"Apple", "iPhone 13", "iPhone 12",},
            {"Google", "Pixel 6", "Pixel 5",},
            {"Samsung", "Galaxy A5", "Galaxy S22",},
            {"Xiaomi", "Xiaomi 12", "Xiaomi 11",},};

    public static void setHandy(){
        System.out.println("Von welcher Marke stammt Ihr Handy?");
        String marke = scanner.nextLine();
        if (marke.equals(Marken[0][0]) || marke.equals(Marken[1][0]) || marke.equals(Marken[2][0]) || marke.equals(Marken[3][0])) {
            Type[2] = marke;
            if (marke.equals("Apple")) {
                Type[1] = "iOS";
            }
            else{
                Type[1] = "Android";
            }
        }
        else {
            System.out.println("Tut uns Leid, diese Marke ist uns unbekannt! Bitte versuchen Sie es erneut.");
            Handy.setHandy();
        }
        System.out.println("Welches von den Folgenden Modelle besitzen Sie?");
        if (marke.equals(Marken[0][0])) {
            System.out.println("\t(1) " + Marken[0][1]);
            System.out.println("\t(2) " + Marken[0][2]);
        }
        else if(marke.equals((Marken[1][0]))){
            System.out.println("\t(1) " + Marken[1][1]);
            System.out.println("\t(2) " + Marken[1][2]);
        }
        else if (marke.equals(Marken[2][0])) {
            System.out.println("\t(1) " + Marken[2][1]);
            System.out.println("\t(2) " + Marken[2][2]);
        }
        else if (marke.equals(Marken[3][0])) {
            System.out.println("\t(1) " + Marken[3][1]);
            System.out.println("\t(2) " + Marken[3][2]);
        }
        System.out.println("Eingabe:");
        String modell = scanner.next();
        Type[2] = modell;

    }

    public static void übernachtungBuchen(){
        System.out.println("Herzlich Willkommen auf der Webseite des B-Hotels!");
        System.out.println("Wie viele Nächte wollen Sie übernachten?");
        int zahlÜ = scanner.nextInt();
        if (Type[0].equals("iOS")) {
            iOS.übernachtungBuchen(zahlÜ);
        }
        else {
            Android.übernachtungBuchen(zahlÜ);
        }

    }
    public static void setAktivität (){
        if (!Aktivität) {
            System.out.println("if1");
            if (Type[0].equals("iOS")) {
                iOS.setAktivität();
            }
            else {
                System.out.println("else1"); //ERROR: Scheinbar wird dies als Schleife ausgeführt?
                Android.setAktivität();
            }
        }
        else {
            Aktivität = false;
            Zugriff.deaktiv();

        }
    }
    public static boolean isHandyDefined(){
        if (Type[0].equals("iOS") || Type[0].equals("Android")) {
            return true;
        }
        else {
            return false;
        }
    }
}
