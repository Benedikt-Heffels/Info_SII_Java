import java.util.Scanner;

public class letzteuebung {
    public static void main (String[] args) {
        System.out.println("Dies sind die letzten Übungen vor der Informatikklausur morgen!");
        System.out.print("Ich schreibe in einer Zeile...");
        System.out.print("...Und schreibe trotz neuem print Befehl immer noch in dieser Zeile!");
        System.out.println("Jetzt nicht mehr - anderer print-Befehl");
        System.out.println("\n\n Scanner-Variable:\n" +
                "Gib bitte ein Y oder N ein:");
        Scanner yorn = new Scanner(System.in);
        String eingabe1 = yorn.next();
        if (eingabe1.equals("Y")){
            System.out.println("Da ist wohl jemand ein sehr positiver Mensch!");
        }
		else if (eingabe1.equals("N")){
            System.out.println("Du Minusmensch!");
        }
        System.out.println("\n\n Nun der ganze Spaß mit einer case-Abfrage. Gib bitte eine Zahl zwischen 1 und 5 ein:");
        Scanner scan = new Scanner(System.in);
        int zahl = scan.nextInt();
        switch(zahl) {
            case 1:
                System.out.println("Zahleingabe 1");
                break;
            case 2:
                System.out.println("Zahleingabe 2");
                break;
            case 3:
                System.out.println("Zahleingabe 3");
                break;
            default:
                System.out.println("Denkst du ernsthaft, ich programmiere ohne IDE alle Fälle durch? Da habe ich besseres zu tun!");
        }
        for (int i = 0; i < zahl*zahl; i++) {
            System.out.println("BEN!");
            System.out.println("Wir alle lieben BEN!");
        }
        System.out.println("Weil ich es sage: Ja oder Nein?");
        String weilichessage = scan.next();
        int schleifendurchläufe = 0;
        do{
            System.out.println("Einsatzgebiet für die dümmste Schelife der Welt!");
            System.out.println("Wer nutzt noch do-while-Schleifen?");
            System.out.println(" -- Anscheinend ich! (Mathias, Alter Unbekannt, Fan von do-while-Schleifen)");
            System.out.println(" -- Ich leider auch! (Ben, 15, Kein Fan von do-while-Schleifen)"); //Ja ist den das zu glauben? Kein Fan!
            schleifendurchläufe += 1;
        }while (weilichessage.equals("Ja")&&schleifendurchläufe<=5);
        System.out.println("Ich kann doch Java. Bekomme ich eine 1 in der Klausur, Herr Mathias?");
    }
}