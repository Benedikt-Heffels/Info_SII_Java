package benzon;

import benzon.Moebelstueck.Moebelstueck;

import java.util.Scanner;

public class Benzon_Zugriff_NEU {
    public static void main(String[] args) {
        int anzahlProdukteBeiBenzon = Ware.getAnzahlProdukteBeiBenzon();
        Ware [] wares = new Ware[anzahlProdukteBeiBenzon]; //Länge des Arrs: Anzahl möglicher Produkte
        Scanner scanner = new Scanner(System.in);
        System.out.println("Herzlich Willkommen bei benzon! Ihrem Online-Händler für alles mögliche!");
        boolean go = false;
        for (int i = 0; i < anzahlProdukteBeiBenzon; i++) {
            System.out.println("Was möchten Sie kaufen?");
            System.out.println("\t(1) Möbel");
            System.out.println("Eingabe: ");
            int wahl = scanner.nextInt();
            switch (wahl) {
                case 1:
                    Ware ware = new Moebelstueck();
                    ware.SelectProdukt(ware);
                    Ware.WarenkorbAusgeben(ware);
                    wares[i] = ware;

            }
            //Ware.WarenkorbAusgeben(wares);
            System.exit(100);
        }
    }
}
