import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        System.out.println("Bitte Zahl eingeben, zu der die multiplikative Reihe ausgegeben werden soll:");
        Scanner eingeben = new Scanner(System.in);
        int eingegebene_zahl = eingeben.nextInt();
        for(int multifaktor=1; multifaktor<=10; multifaktor++) {
            System.out.println(eingegebene_zahl*multifaktor);
        }
    }
}