import java.util.Scanner;

public class Aufgabe3_Kalkulation {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie den Einkaufspreis ein:");
        Scanner eingabe = new Scanner(System.in);
        float Einkaufspreis = eingabe.nextFloat();
        float EinkaufpHandlung = Einkaufspreis + Einkaufspreis / 100*40;
        System.out.println("Darauf berechnen wir nun 40% Handlungskostenzuschlag. Ihr Selbstkostenpreis beträgt damit "
                + EinkaufpHandlung + "€.");
        float Nettoverkaufspreis = EinkaufpHandlung + EinkaufpHandlung / 100 * 5;
        System.out.println("Ihr Nettoverkaufspreis beträgt " +  Nettoverkaufspreis + "€.");
        float Bruttoverkaufspreis = Nettoverkaufspreis + Nettoverkaufspreis / 100 * 19;
        System.out.println("Darauf muss dann noch der Mehrwertscteuersatz von 19% berechnet werden.\n" +
                "Insgesmat beläuft sich die Kostenkalkulation also auf " + Bruttoverkaufspreis + "€.\n");
        System.out.println("Wollen sie eine Rechnung der Kostenkalkulation drucken? (Ja/Nein)");
        Scanner scan = new Scanner(System.in);
        String druckwunsch = scan.nextLine();
        if(druckwunsch.equals("Ja")) {
            System.out.println("Hier ist die Rechnung");
            System.out.println("---- Sie können auf diese Funktion leider noch nicht zugreifen. Dafür wird das Pro-Abo benötigt. ----");
        }
        else{
            System.out.println("In Ordnung, fügen Sie die Werte in ihre eigene Rechnung ein.");
            System.out.println("Hier ist nochmal das wichtigste zusammengefasste:\n" +
                    "Nettopreis: " + Nettoverkaufspreis + "€\n" +
                    "Bruttopreis: " + Bruttoverkaufspreis + "€");
        }
    }
}
