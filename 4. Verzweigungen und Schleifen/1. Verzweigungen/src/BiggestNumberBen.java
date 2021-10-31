import java.util.Scanner;

public class BiggestNumberBen{
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie Ihre erste Zahl ein:");
        Scanner eingabe = new Scanner(System.in);
        double zahl1 = eingabe.nextDouble();
        System.out.println("Bitte geben Sie Ihre zweite Zahl ein:");
        double zahl2 = eingabe.nextDouble();
        System.out.println("Bitte geben Sie Ihre dritte Zahl ein:");
        double zahl3 = eingabe.nextDouble();

        if (zahl1 >= zahl2 && zahl1 >= zahl3){
            System.out.println(zahl1 + " ist die größte Zahl!");
        }
        else if (zahl2 >= zahl1 && zahl2 >= zahl3){
            System.out.println(zahl2 + "ist die größte Zahl!");
        }
        else if (zahl3 >= zahl1 && zahl3 >= zahl2){
            System.out.println(zahl3 + " ist die größte Zahl!");
        }
        else{
            System.out.println("Leider ist ein unerwarteter Fehler aufgetreten. Bitte versuchen Sie es später erneut!");
        }
    }
}
