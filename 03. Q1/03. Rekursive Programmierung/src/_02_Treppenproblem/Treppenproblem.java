package _02_Treppenproblem;

import java.util.Scanner;

public class Treppenproblem {

    public static void main(String[] args) {
        System.out.println("Bitte geben Sie die Anzahl der Stufen an, die mit dem Treppenproblem gelöst werden sollen:");
        Scanner scanner = new Scanner(System.in);
        int anzahlStufen = scanner.nextInt();
        System.out.println("Es gibt " + anzahlMoeglichkeiten(anzahlStufen) + " verschiedene Möglichkeiten, " + anzahlStufen + " Stufen hochzugehen!");
        System.out.println("Die Möglichkeiten in der Übersicht (E = Einzelschritt, D = Doppelschritt)");
        System.out.println(anzahlMoeglichkeitenSTR(anzahlStufen, ""));
    }

    public static int anzahlMoeglichkeiten(int pAnzahlStufen){
        if (pAnzahlStufen == 1){
            return 1;
        }
        else if (pAnzahlStufen == 2){
            return 2;
        }
        else {
            return anzahlMoeglichkeiten(pAnzahlStufen - 1) + anzahlMoeglichkeiten(pAnzahlStufen - 2);
        }
    }
    /*
    Ansatz aus der Lösung: Lediglich Abfragen, ob die Anzahl der Stufen (pAnzahlStufen) kleiner oder gleich 1 ist. Nur dann wird eine Möglichkeit hinzugefügt.
    Vorteil: pAnzahlStufen = 2 Minus 2 = Nulll => 1 Möglichkeit (+ 1 Möglichkeit aus 2-1) ==> insg. 2 Möglichkeiten

    Nachteil: 0 Stufen lassen sich dann auch per Einzelschritt hochgehen.
     */


    //Vermutlich nicht Klausurrelevant
    //Entwurf nach Herr Matias

    public static String anzahlMoeglichkeitenSTR(int pAnzahlStufen, String pSTRMoeglichkeiten) {
        if (pAnzahlStufen==0) {
            return pSTRMoeglichkeiten + "\n";
        }
        else if (pAnzahlStufen==1) {
            return "E" + pSTRMoeglichkeiten + "\n";
        }
        else {
            return anzahlMoeglichkeitenSTR(pAnzahlStufen-1, "E" + pSTRMoeglichkeiten) +
                    anzahlMoeglichkeitenSTR(pAnzahlStufen-2, "D" + pSTRMoeglichkeiten);
        }
    }
}

/*
Konzeptplanung:
public int anzahlMöglichkeiten = 0;

String-Klasse "gehe Treppe hoch" (Anzahl Stufen) //Soll Anzahl Möglichkeiten + deren Art zurückgeben
    if Anzahl Stufen == 1
        anzahlMöglichkeiten +=;
        return "schrittgröße1 -> "
    if Anzahl Stufen == 2
        anzahlMöglichkeiten +=;
        return "schrittgröße2 -> "
    else if Anzahl Stufen >= 3
        return "gehe Treppe hoch(Stufen-1)" + "gehe Treppe hoch (Stufen-1) //Alle miteinander im String ergänzen

 */