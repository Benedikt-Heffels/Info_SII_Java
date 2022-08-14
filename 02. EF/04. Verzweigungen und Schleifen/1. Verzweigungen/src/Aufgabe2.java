import java.util.Random;
import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Random zahl = new Random();
        int zufallszahl = zahl.nextInt(100);
        Scanner eingabe = new Scanner(System.in);
        int versuche = 0;
        boolean go = true;
        while (go == true) {
            System.out.println("Bitte geben Sie Ihre Vermutung ein:");
            int tipp = eingabe.nextInt();
            if (tipp > zufallszahl) {
                System.out.println("Die Zufallszahl ist kleiner als Ihr Tipp!\n");
            }
            else if (tipp < zufallszahl) {
                System.out.println("Die Zufallszahl ist größer als Ihr Tipp!\n");
            }
            else if (tipp == zufallszahl) {
                System.out.println("\n\nApplaus! :clap:\n" +
                        "Sie haben die Zufallszahl (" + zufallszahl + ") erraten!");
                go = false;
            }
            versuche += 1;
        }
        System.out.println("Sie haben lediglich " + versuche + " Versuche benötigt, um die richtige Zahl zu erraten!");
    }
}
