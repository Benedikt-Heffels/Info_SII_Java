import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie Ihre erste Zahl ein:");
        Scanner eingabe = new Scanner(System.in);
        double zahl1 = eingabe.nextDouble();
        System.out.println("Bitte geben Sie Ihre zweite Zahl ein:");
        double zahl2 = eingabe.nextDouble();
        System.out.println("Bitte geben Sie Ihre dritte Zahl ein:");
        double zahl3 = eingabe.nextDouble();

        if (zahl1 > zahl2 && zahl1 > zahl3){
            System.out.println("Zahl 1 ist die größte Zahl!");
        }
        else if (zahl2 > zahl1 && zahl2 > zahl3){
            System.out.println("Zahl 2 ist die größte Zahl!");
        }
        else if (zahl3 > zahl1 && zahl3 > zahl2){
            System.out.println("Zahl 3 ist die größte Zahl!");
        }
        else if (zahl1 == zahl2 && zahl1 == zahl3){
            System.out.println("Die Zahlen sind gleichgroß!");
        }
        else{
            System.out.println("Leider ist ein unerwarteter Fehler aufgetreten. Bitte versuchen Sie es später erneut!");
        }
    }
}
