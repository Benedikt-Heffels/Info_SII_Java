package Verschlüsselung;

import java.util.Scanner;

public class frontend {
    public static void main(String[] args) {
        System.out.println("Willkommen");
        boolean go = true;
        while (go) {
            System.out.println("Was wollen Sie tun?");
            System.out.println("\t(1) Nachricht verschlüsseln");
            System.out.println("\t(2) Nachricht entschlüsseln");
            System.out.println("\t(3)Programm verlassen");
            System.out.println("Eingabe: ");
            Scanner scanner = new Scanner(System.in);
            int wahl = scanner.nextInt();
            if (wahl == 1) {
                //backend.verschlüsseln();
                System.out.println("1");


            }
            if (wahl == 2) {
                //backed.entschlüsseln();
                System.out.println("2");
            }

            if (wahl == 3){
                go = false;
            }
        }
    }
}