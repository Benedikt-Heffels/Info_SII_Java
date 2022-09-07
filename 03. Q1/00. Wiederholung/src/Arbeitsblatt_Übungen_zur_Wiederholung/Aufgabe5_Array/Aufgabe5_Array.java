package Arbeitsblatt_Übungen_zur_Wiederholung.Aufgabe5_Array;

import java.util.Scanner;

public class Aufgabe5_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahlenArray[] = new int[5];
        for (int i = 1; i <= 5; i++) {
            System.out.println("Bitte geben Sie Ihre Zahl Nr. " + i + " ein! (1-9)");
            zahlenArray[i-1] = scanner.nextInt();
        }
        System.out.print("Ihre Zahleneingabe: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(zahlenArray[i]);
        }

        System.out.println("\nWelche Zahl wollen sie suchen und im Anschluss - falls vorhanden - löschen?");
        int suchzahl = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            if (zahlenArray[i] == suchzahl) {
                for (int j = i+1; j < 5; j++) {
                    zahlenArray[i] = zahlenArray[j];
                    i += 1;
                }
                zahlenArray[4] = 0;
                break;
            }
        }
        System.out.println("Ihre korrigierte Zahleneingabe: (0: gelöschte Stelle)");
        for (int i = 0; i < 5; i++) {
            System.out.print(zahlenArray[i]);
        }
    }
}
