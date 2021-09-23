import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie den Einkaufspreis ein:");
        Scanner eingabe = new Scanner(System.in);
        float Einkaufspreis = eingabe.nextFloat();
        EinkaufpHandlung = Einkaufspreis + Einkaufspreis/100+40;
        System.out.println("Darauf berechnen wir nun 40% Handlungskostenzuschlag.");
    }
}
