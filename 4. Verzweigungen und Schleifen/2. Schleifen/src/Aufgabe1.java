import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Seitenlänge eingeben:");
        int eingabe = scan.nextInt();

        for (int x=0; x < eingabe; x++) {
            for (int y = 0; y < eingabe; y++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}