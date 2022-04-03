package Handy;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class iOS extends Handy{
    public iOS(){}
    private static Scanner scanner = new Scanner(System.in);

    public static void setAktiviät(){
        System.out.println("Handy wird gestartet...");
        URI logo = URI.create("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTe2ICtTiCNFnTisaXB8NrmCEScsqKXX_JZps4oFgdRlppqDCinWakJex2u3mBe-62W9MI&usqp=CAU");
        try {
            Desktop.getDesktop().browse(logo);
            Thread.sleep(10);
        }
        catch (Exception e) {
            System.exit(130);
        }
        Handy.Aktivität = true;
    }
    public static void übernachtungBuchen(int zahlÜ){
        System.out.println("Die Kosten pro Nacht betragen 75 €.");
        System.out.println("Insgesamt betragen die Kosten also " + zahlÜ * 75 + " €.");
        System.out.println("Fortfahren? (Ja/Nein)");
        String üWahl = scanner.next();
        if (üWahl.equals("Ja")) {
            System.out.println("Die Gebühren werden von Ihrem Konto abgebucht!");
        }
    }
}
