package Arbeitsblatt_Übungen_zur_Wiederholung.Aufgabe6_Projekt_ToDo_Liste;

import java.util.Scanner;

public class ToDoListe {
    public ToDoListe(){}
    protected static Aufgaben aufgaben = new Aufgaben();
    protected static Scanner scanner = new Scanner(System.in);
    protected static String[][][] liste = Aufgaben.urspruenglicheListe();



    public static void showNextTask(){
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 5; b++) {
                if (!liste[a][b][0].equals("TBD")){
                    System.out.print("Nächste Aufgabe: " + liste[a][b][0] + "; fällig am " + liste[a][b][1] + ". Die Aufgabe wurde als 'Wichtigkeit: ");
                    String prio = "unbekannt";
                    switch (a) {
                        case 0:
                            prio = "hoch";
                            break;
                        case 1:
                            prio = "mittel";
                            break;
                        case 2:
                            prio = "niedrig";
                            break;
                    }
                    System.out.print(prio + "' eingestuft.");
                    System.out.println("\nWollen Sie die Aufgabe nun löschen?");
                    String answer = scanner.next();
                    if (answer.equals("JA") || answer.equals("Ja") || answer.equals("ja")) {
                        liste[a][b][0] = "TBD";
                        aufgaben.setAnzahlTasksMINUS1();
                    }
                    Zugriff.cockpit();
                }
            }
        }
    }

    public static void showAllTasks(){
        for (int a = 0; a < 3; a++) {
            String prio = "TBD";
            switch (a) {
                case 0:
                    prio = "hoch";
                    break;
                case 1:
                    prio = "mittel";
                    break;
                case 2:
                    prio = "niedrig";
                    break;
            }
            System.out.println("\nFolgende Aufgaben wurden als 'Wichtigkeit: " + prio + "' eingestuft: ");
            int TBD_counter = 0;
            for (int b = 0; b < 5; b++) {
                if (!liste[a][b][0].equals("TBD")) {
                    System.out.println(liste[a][b][0] +  "; fällig am " + liste[a][b][1]);
                }
                else {
                    TBD_counter += 1;
                }
            }
            if (TBD_counter == 4) {
                System.out.println("Glückwunsch! Du hat alle Aufgaben mit dieser Wichtigkeit bereits erledigt!");
            }
        }
        System.out.println("\nEnter drücken, um zurück ins Cockpit zu gelangen!");
        String enter = scanner.nextLine();
        Zugriff.cockpit();
    }

    public static void exit() {
        String wahl;
        if (aufgaben.anzahlTasks != 0) {
            System.out.println("Sind Sie sich sicher, dass Sie BenDo verlassen wollen? " +
                    "Es warten immer noch " + aufgaben.anzahlTasks + " unbearbeitete Aufgaben auf Sie.");
            wahl = scanner.next();
        }
        else {
            wahl = "JA";
        }

        if (wahl.equals("JA") || wahl.equals("Ja") || wahl.equals("ja")) {
            System.out.println("Danke, dass Sie BenDo nutzen.");
            System.out.println("Erholen Sie sich gut und bis zum nächsten Mal!");
            System.out.println("\n\n\n---------------------");
            System.out.println("BenDo ist ein Produkt der BenTech SE");
            System.exit(2);
        }
    }

    public static void newTask(){
        boolean eintragungErledigt = false;
        String ePrio = "";
        System.out.println("Bitte geben Sie zunächst die Priorität der Aufgabe an (hoch/mittel/niedrig): ");
        ePrio = scanner.nextLine(); //Bug: Nach Fehler: Aufgabe löschen -> Aufgabe löschen -> lässt sich hier keine Angabe mehr machen
        int prio = 0;
        if (ePrio.equals("hoch")){
            prio = 0;
        }
        else if (ePrio.equals("mittel")){
            prio = 1;
        }
        else if (ePrio.equals("niedrig")) {
            prio = 2;
        }
        while (!eintragungErledigt) {
            for (int b = 0; b < 5; b++) {
                if (liste[prio][b][0].equals("TBD")) {
                    System.out.println("Bitte geben Sie die Beschreibung der Aufgabe an: ");
                    liste[prio][b][0] = scanner.nextLine();
                    System.out.println("Bitte geben Sie das Fälligkeitsdatum der Aufgabe an: ");
                    liste[prio][b][1] = scanner.nextLine();
                    eintragungErledigt = true;
                    aufgaben.setAnzahlTasksPLUS1();
                    break;
                }
            }
            // Wenn alle 5 Slots belegt sind und oberster frei, werden Aufgaben hochgeschrieben
            if (!eintragungErledigt && liste[prio][0][0].equals("TBD")) {
                for (int b = 1; b < 5; b++) {
                    liste[prio][b - 1][0] = liste[prio][b][0];
                    liste[prio][b - 1][1] = liste[prio][b][1];
                }
            }
            else if (!eintragungErledigt && !liste[prio][0][0].equals("TBD")) {
                System.out.println("Die verfügbaren Aufgabenslots sind leider alle bereits belegt. " +
                        "Sie müssen erst Aufgaben erledigen, bevor Sie neue erstellen können!");
                break;
            }
        }
        Zugriff.cockpit();
    }
}
