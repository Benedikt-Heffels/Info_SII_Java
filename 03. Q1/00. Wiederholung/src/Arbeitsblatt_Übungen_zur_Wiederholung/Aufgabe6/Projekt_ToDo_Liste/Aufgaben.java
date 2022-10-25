package Arbeitsblatt_Übungen_zur_Wiederholung.Aufgabe6.Projekt_ToDo_Liste;

public class Aufgaben extends ToDoListe{

    public Aufgaben() {}

    public static String[][][] urspruenglicheListe() {
        String listeUrsprung[][][] =
                {
                        {
                                {
                                        "Informatikaufgaben Wiederholung erledigen", "24.08.2022"
                                },
                                {
                                        "Aufgaben Mathematik LK erledigen", "23.08.2022"
                                },
                                {
                                        "Weltformel finden und Weltherrschaft übernehmen!", "05.09.2086"
                                },
                                {
                                        "TBD", "TBD"
                                },
                                {
                                        "TBD", "TBD"
                                }
                        },
                        {
                                {
                                        "Englischaufgaben zum Vereinigten Königreich", "23.08.2022"
                                },
                                {
                                        "Protokoll Experiment Chemie verfassen", "26.08.2022"
                                },
                                {
                                        "Herausfinden, wie IntelliJ funktioniert", "05.09.2008"
                                },
                                {
                                        "TBD", "TBD"
                                },
                                {
                                        "TBD", "TBD"
                                },
                        },
                        {
                                {
                                        "Hypothese zur Entstehung der Sprache aufstellen", "29.08.2022"
                                },
                                {
                                        "Linguistik studieren", "05.09.2086"
                                },
                                {
                                        "Gesamte Menschheit auslöschen", "01.01.2100"
                                },
                                {
                                        "TBD", "TBD"
                                },
                                {
                                        "TBD", "TBD"
                                }
                        }
                };
        return listeUrsprung;
    }
    public static int anzahlTasks = 9;
    public static void setAnzahlTasksPLUS1(){
        anzahlTasks += 1;
    }
    public static void setAnzahlTasksMINUS1() {
        anzahlTasks -= 1;
    }
}
