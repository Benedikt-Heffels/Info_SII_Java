package Handy;

import java.awt.*;
import java.net.URI;
import java.util.Random;
import java.util.Scanner;

public class Android extends Handy{
    public Android(){}
    private static Scanner scanner = new Scanner(System.in);

    public static void setAktiviät() {
        System.out.println("Handy wird gestartet...");
        URI logo = URI.create("https://cdn-icons-png.flaticon.com/512/38/38002.png");
        try {
            Desktop.getDesktop().browse(logo);
            Thread.sleep(20);
        } catch (Exception e) {
            System.exit(130);
        }
        Handy.Aktivität = true;
    }

    public static void xiaomiSpecial() {
        Random random = new Random();
        int zufall = random.nextInt(10);
        int zufallCheck = random.nextInt(10);
        if (zufall == zufallCheck) {
            System.out.println("--------------------------------\n" +
                    "This is a Message by the Government of the United States of America:\n" +
                    "Since today is Xiaomi part of the Entity list because of their closeness to the government of the People's Republic of China.\n" +
                    "So, American companies aren't longer allowed to trade with China.\n");
            System.out.println("Because of this directive by the U.S. Government, Alphabet Inc. end all services for Xiaomi-Phones.");
            System.exit(1);
        }
    }

    public static void übernachtungBuchen(int zahlÜ){
        System.out.println("Die Kosten pro Nacht betragen 50 €.");
        System.out.println("Insgesamt betragen die Kosten also " + zahlÜ * 50 + " €.");
        System.out.println("Fortfahren? (Ja/Nein)");
        String üWahl = scanner.next();
        if (üWahl.equals("Ja")) {
            System.out.println("Die Gebühren werden von Ihrem Konto abgebucht!");
        }
    }

}
