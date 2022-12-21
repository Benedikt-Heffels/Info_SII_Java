package _03_Weitere_Uebungen;

import java.util.Scanner;

public class WeitereUebungen {
    public static int[] arrayInt = {1,2,3, 4};
    public static void main(String[] args) {
        System.out.println("Eine Übung aus der folgenden Liste können Sie durch Eingabe der jeweiligen Zahl wählen!");
        System.out.println("Herzlich Willkommen im Übungsmenü!");
        while (true) {
            System.out.println("");
            System.out.println("\t(1) Spiegel-Wort"); //check
            System.out.println("\t(2) Palindrom-Tester"); //check
            System.out.println("\t(3) Größter Gemeinsamer Teiler");
            System.out.println("\t(4) Lineare Suche (in Array)"); //check
            System.out.println("\t(5) Summe Bis (von Array)"); //check
            System.out.println("\t(6) Quersumme"); //check
            System.out.println("\t(7) Fakultät"); //1*2*3*... //check
            System.out.println("\t(8) Fibonacci-Zahlen");
            System.out.println("\t(0) Verlassen");
            System.out.println("Wahl: ");
            Scanner scanner = new Scanner(System.in);
            int wahl = scanner.nextInt();
            //wahl = 1;
            switch (wahl) {
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.println(spiegelWortIterativ("123"));
                    System.out.println("R: " + spiegelWortRekursiv("123", "", 3)); //length muss bei definierter Eingabe definiert sein!
                }
                case 2 -> {
                    if (palindromTesterIterativ("123")) {
                        System.out.println("Bei '123' handelt es sich um ein Palindrom");
                    }
                    else {
                        System.out.println("Bei '123' handelt es sich um kein Palindrom");
                    }
                    System.out.println("Die Rekursive Funktion liefert ebenfalls: " + palindromTesterRekursiv("123"));
                }
                case 4 -> {
                    int [] arrayInt = {1,2,3,4};
                    System.out.println("Der Array ist " + java.util.Arrays.toString(arrayInt));
                    if (linSearchIterativ(2) != 0){
                        System.out.println("Anzahl benötigter Versuche zum Finden der Eingabe: " + linSearchIterativ(0));
                        System.out.println("Rekursive Anzahl Versuche: " + linSearchRekursiv(4, 0));
                    }
                }
                case 5 -> {
                    System.out.println("Der Array ist " + java.util.Arrays.toString(arrayInt));
                    if (summeBisIterativ(4) != 0){
                        System.out.println("Die Summe bis einschließlich zur Zahl 4 ist: " + summeBisIterativ(4));
                        System.out.println("Die Rekursive Funktion liefert: " + summeBisRekursiv(0, 4, 0));
                    }
                }
                case 6 -> {
                    System.out.println("Die Quersumme von '123' ist: " + quersummeIterativ("123"));
                    System.out.println("Die Rekursive Funktion liefert: " + quersummeRekursiv("123"));
                }
                case 7 -> {
                    System.out.println("Die Fakultät von '123' ist: " + fakultaetIterativ("123"));
                    System.out.println("Die Rekursive Funktion liefert: " + fakultaetRekursiv("123"));
                }
            }
        }
    }


    public static String spiegelWortIterativ(String wort) {
        String gespiegelt = "";
        for (int i = wort.length() - 1; i >= 0; i--) {
            gespiegelt = gespiegelt.concat(String.valueOf(wort.charAt(i)));
            //wort = wort.substring(0, i) + wort.substring(i, wort.length() - 1);
        }
        return gespiegelt;
    }
    public static String spiegelWortRekursiv(String wort, String gespiegelt, int length){
        if (length == 1){
            return gespiegelt.concat(String.valueOf(wort.charAt(0)));
        }
        else {
            gespiegelt = gespiegelt.concat(String.valueOf(wort.charAt(length - 1)));
            wort = wort.substring(0, length);
            return spiegelWortRekursiv(wort, gespiegelt, length - 1);
        }
    }

    public static boolean palindromTesterIterativ(String wort){ //Anna =gedreht= Anna
        if (wort == spiegelWortIterativ(wort)) return true;
        else return false;
    }
    public static boolean palindromTesterRekursiv(String wort){
        if (wort == spiegelWortRekursiv(wort, "", 3)) return true;
        else return false;
    }

    public static int linSearchIterativ(int gesuchteZahl){
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == gesuchteZahl){
                return i + 1;
            }
        }
        return 0;
    }
    public static int linSearchRekursiv(int gesuchteZahl, int position){
        if (arrayInt[position] == gesuchteZahl){
            return position += 1;
        }
        else if (position == arrayInt.length - 1){
            return 0;
        }
        else {
            return linSearchRekursiv(gesuchteZahl, position + 1);
        }
    }

    public static int summeBisIterativ(int bis){
        int summe = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            summe += arrayInt[i];
            if (arrayInt[i] == bis){
                return summe;
            }
        }
        return 0;
    }
    public static int summeBisRekursiv(int summe, int bis, int position){
        if (arrayInt[position] == bis){
            return summe + arrayInt[position];
        }
        else if (position == arrayInt.length - 1){
            return 0;
        }
        else {
            return summeBisRekursiv(summe + arrayInt[position], bis, position + 1);
        }
    }

    public static int quersummeIterativ(String wort){
        int quersumme = 0;
        for (int i = 0; i < wort.length(); i++) {
            //Verwendung von parseInt, da Integer.valueOf auf Ascii-Code zurückgreift
            quersumme = quersumme + Integer.parseInt(String.valueOf(wort.charAt(i)));
        }
        return quersumme;
    }
    public static int quersummeRekursiv(String wort){
        if (wort.length() == 1)
            return Integer.parseInt(String.valueOf(wort.charAt(0)));
        else
            return Integer.parseInt(String.valueOf(wort.charAt(wort.length()-1))) +
                    quersummeRekursiv(wort.substring(0, wort.length() - 1));

    }

    public static int fakultaetIterativ(String wort){
        if (wort != null) {
            int fakultaet = 1;
            for (int i = 0; i < wort.length(); i++) {
                //Verwendung von parseInt, da Integer.valueOf auf Ascii-Code zurückgreift
                fakultaet = fakultaet * Integer.parseInt(String.valueOf(wort.charAt(i)));
            }
            return fakultaet;
        }
        return 0;
    }
    public static int fakultaetRekursiv(String wort){
        if (wort.length() == 1)
            return Integer.parseInt(String.valueOf(wort.charAt(0)));
        else
            return Integer.parseInt(String.valueOf(wort.charAt(wort.length()-1))) *
                    fakultaetRekursiv(wort.substring(0, wort.length() - 1));

    }
}

