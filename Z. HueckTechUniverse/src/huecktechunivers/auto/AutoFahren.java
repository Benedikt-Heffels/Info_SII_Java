package huecktechunivers.auto;

import java.util.Scanner;

public class AutoFahren {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Auto auto = new Auto();
        boolean go = true;
        System.out.println("Willkommen in ihrem Auto!");
        System.out.println("\t(1) Radio nutzen");
        System.out.println("\t(2) Tanken");
        System.out.println("\t(3) Fahren");
        System.out.println("Bitte Zahl eingeben");
        int wahl = scanner.nextInt();



        if (wahl == 1){
            System.out.println("Aktion wählen: ");
            int radio = auto.getRadio();
            if (radio == 0) {
                System.out.println("\t(0) Radio einschalten");
            }
            else if (radio == 1) {
                System.out.println("\t(0) Radio ausschalten");
            }
            else if (radio == 1) {
                System.out.println("\t(1) WDR2");
                System.out.println("\t(2) 1Live");
                System.out.println("\t(3) 100,5");
                //BBC, WDR5, WDR3, WDR4; Deutsche Welle
            }

            // WDR2 : https://www1.wdr.de/radio/player/radioplayer104~_layout-popupVersion.html
            //1Live : https://www1.wdr.de/radio/1live/index.html
            //100.5 : https://radioplayer.dashitradio.de
            //BBC   : https://www.internetradio-horen.de/gb/bbc-world-service
            // Deutsche Welle https://www.internetradio-horen.de/deutsche-welle
        }
    }
}
