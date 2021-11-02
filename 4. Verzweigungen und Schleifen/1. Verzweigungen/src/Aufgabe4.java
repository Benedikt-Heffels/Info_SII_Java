import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        System.out.println("Dieses Programm sagt Ihnen, was Sie eigegeben haben.");
        System.out.println("Ihre Eingabe:");
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.next();
        int ascii_zeichen = (int) (eingabe.charAt(0));
        if (ascii_zeichen >= 33 && ascii_zeichen <= 47
                || ascii_zeichen >= 58 && ascii_zeichen <= 64
                || ascii_zeichen >= 91 && ascii_zeichen <= 96
                || ascii_zeichen >= 123 && ascii_zeichen <= 126){
            System.out.println(eingabe + " ist ein Sonderzeichen");
        }
        else if (ascii_zeichen >= 48 && ascii_zeichen <= 57) {
            System.out.println(eingabe + " ist eine Zahl!");
        }
        else if (ascii_zeichen >= 65 && ascii_zeichen <= 90) {
            System.out.println(eingabe + " ist ein Großbuchstabe");
        }
        else if (ascii_zeichen >= 97 && ascii_zeichen <= 122) {
            System.out.println(eingabe + " ist ein Kleinbuchstabe!");
        }
    }
}
