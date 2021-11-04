import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie ihre Zahl ein:");
        Scanner scan = new Scanner(System.in);
        int eingabe = scan.nextInt();
        int endergebnis = 0;
        for (int addifaktor = 0; addifaktor < eingabe; addifaktor++) {
            endergebnis = eingabe + addifaktor;
        }
        System.out.println(endergebnis);
    }
}
