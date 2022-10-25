package Arbeitsblatt_Übungen_zur_Wiederholung.Aufgabe6.Projekt_ToDo_Liste;


import java.util.Scanner;

public class Zugriff {
    private final static ToDoListe toDoListe = new ToDoListe();
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Herzlich Willkommen im Cockpit von BenDo!");
        System.out.println("Bitte loggen Sie sich ein!");
        System.out.print("Benutzername: ");
        String bn = scanner.next();
        System.out.println("Passwort: ************");
        try {
            Thread.sleep(100);
        }
        catch (Exception e) {
            System.out.println("Auch wir brauchen mal Sommerferien!");
            System.exit(1);
        }
        System.out.println("Hallo Ben, Herzlich Willkommen zurück im BenDo Cockpit.");
        cockpit();
    }

    public static void cockpit(){
        System.out.println("\n\nWas möchtest du tun?");
        System.out.println("(0)\tCockpit verlassen - Freizeit genießen");
        System.out.println("(1)\tNächste Aufgabe anzeigen - Fokussiert Arbeiten");
        System.out.println("(2)\tAufgabenübersicht anzeigen - Frei arbeiten");
        System.out.println("(3)\tAufgabe hinzufügen - Mehr arbeiten");
        int auswahl = scanner.nextInt();
        System.out.println("\n");
        switch (auswahl) {
            case 0:
                toDoListe.exit();
            case 1:
                toDoListe.showNextTask();
                break;
            case 2:
                toDoListe.showAllTasks();
                break;
            case 3:
                toDoListe.newTask();


        }
    }
}
