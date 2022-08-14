package OrganicalChemistry;

import java.util.Scanner;

public class Zugriff {
    public static void main(String[] args) {
        System.out.println("Herzlich Willkommen bei OrganicalChemistry!");
        System.out.println("Dieses Programm hilft ihnen beim Umgang mit Organischen Elementen bis C10 und O10, inklusive" +
                " der Hydroxy-, Carbonyl-, Carboxy- und Estergruppen!");
        boolean go = true;
        while (go) {
            System.out.println("Was wollen Sie tun?");
            System.out.println("\t(1)Organische Chemikalie zeichnen lassen");
            System.out.println("\t(2)Organisches Element reagieren lassen");
            System.out.println("Ihre Wahl:");
            Scanner scanner = new Scanner(System.in);
            int wahl = scanner.nextInt();
            switch (wahl){
                case 1:
                    break;
                case 2:
                    break;
            }
        }
    }
}
