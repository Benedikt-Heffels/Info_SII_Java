package JavaForumAlgorithmus;

import java.util.Random;

public class JavaForumQuizZufallszahl {
    public static void main(String[] args) {
        System.out.println("Aus dem Java-Forum!");
                //https://www.java-forum.org/thema/zeichenraetsel-loesen.194538/#post-1279643
        /* System.out.println("Sinn der Programmes: \n" +
                "\n" +
                "Die folgende Art von Zahlenrätsel ist aus Zeitschriften bekannt. Jede Ziffer ist durch ein Symbol ersetzt worden, dabei stehen gleiche Symbole immer fur gleiche Ziffern:\n" +
                "\n" +
                "stern rampe raute + herz rampe dreieck = dreieck quadrat quadrat\n" +
                "- - -\n" +
                "herz dreieck auge + quadrat quadrat stern = kleeblatt quadrat sonnenrad\n" +
                "= = =\n" +
                "raute rampe sonnenrad + quadrat dreieck herz = herz dreick kreis\n" +
                "\n" +
                "Ihre Aufgabe ist, herauszufinden, welches Symbol welche Ziffer repräsentiert."); */

        //  stern rampe raute       +   herz rampe dreieck      =   dreieck quadrat quadrat
        //          -                           -                               -
        //  herz dreieck auge       +   quadrat quadrat stern   =   kleeblatt quadrat Sonnenrand
        //          =                           =                               =
        // raute rampe sonnenrand   +   quadrat dreieck herz    =   herz dreieck kreis

        int stern = 0;          //0 -- 1
        int rampe = 0;          //1 -- 2
        int raute = 0;          //2 -- 3
        int herz = 0;           //3 -- 4
        int dreieck = 0;        //4 -- 5
        int quadrat = 0;        //5 -- 6
        int auge = 0;           //6 -- 7
        int kleeblatt = 0;      //7 -- 8
        int sonnenrand = 0;     //8 -- 9
        int kreis = 0;          //9 -- 10

        int[] zahlen = new int[10]; // Definition eines Arrays mit einer Länge von 10
        zahlen[0] = stern;
        zahlen[1] = rampe;
        zahlen[2] = raute;
        zahlen[3] = herz;
        zahlen[4] = dreieck;
        zahlen[5] = quadrat;
        zahlen[6] = auge;
        zahlen[7] = kleeblatt;
        zahlen[8] = sonnenrand;
        zahlen[9] = kreis;


        //                  Definierung der Gurppen, um global-Variablen zu erhalten
        // Strings
        String gruppeAString = "" + stern + rampe + raute;
        String gruppeBString = "" + herz + rampe + dreieck;
        String gruppeCString = "" + dreieck + quadrat + quadrat;
        String gruppeDString = "" + herz + dreieck + auge;
        String gruppeEString = "" + quadrat + quadrat + stern;
        String gruppeFString = "" + kleeblatt + quadrat + sonnenrand;
        String gruppeGString = "" + raute + rampe + sonnenrand;
        String gruppeHString = "" + quadrat + dreieck + herz;
        String gruppeIString = "" + herz + dreieck + kreis;
        // Integer
        int gruppeAInt = Integer.valueOf(gruppeAString);
        int gruppeBInt = Integer.valueOf(gruppeBString);
        int gruppeCInt = Integer.valueOf(gruppeCString);
        int gruppeDInt = Integer.valueOf(gruppeDString);
        int gruppeEInt = Integer.valueOf(gruppeEString);
        int gruppeFInt = Integer.valueOf(gruppeFString);
        int gruppeGInt = Integer.valueOf(gruppeGString);
        int gruppeHInt = Integer.valueOf(gruppeHString);
        int gruppeIInt = Integer.valueOf(gruppeIString);


        boolean gueltigeWerte = true;

        Random moeglichkeit = new Random();
        boolean ausprobieren = true;
        long proben = 1; // Mit dieser Variable soll festgestellt werden, wieviele Versuche unternommen werden!


        //                  Beginn der While-Schleife
        while (ausprobieren == true) {
            System.out.println("Arbeite noch, Versuch " + proben + "!");
            //                  Zuweisung der Werte
            stern = moeglichkeit.nextInt(10);
            rampe = moeglichkeit.nextInt(10);
            raute = moeglichkeit.nextInt(10);
            herz = moeglichkeit.nextInt(10);
            dreieck = moeglichkeit.nextInt(10);
            quadrat = moeglichkeit.nextInt(10);
            auge = moeglichkeit.nextInt(10);
            kleeblatt = moeglichkeit.nextInt(10);
            sonnenrand = moeglichkeit.nextInt(10);
            kreis = moeglichkeit.nextInt(10);

            //                  Kontrolle, ob ein wert doppelt ist
            for (int position = 0; position < 9; position++) { // 9 Länge des Arrays
                for (int position2 = 0; position2 < 9; position2++) {
                    if (position != position2) { // Wären sie gleich, gäbe es einen Fehler
                        if (zahlen[position] == zahlen [position2]){
                                gueltigeWerte = false;
                                break;
                        }
                    }

                }
            }

            //                  Überprüfen, ob die Werte die gesuchten Werte sind! (5 Einrückungen)
            if (gueltigeWerte == true){

                // Alle Reihen werden nun als Strings definiert und anschließend in Integer umgewandelt!
                // Reihen als Strings!
                gruppeAString = "" + stern + rampe + raute;
                gruppeBString = "" + herz + rampe + dreieck;
                gruppeCString = "" + dreieck + quadrat + quadrat;
                gruppeDString = "" + herz + dreieck + auge;
                gruppeEString = "" + quadrat + quadrat + stern;
                gruppeFString = "" + kleeblatt + quadrat + sonnenrand;
                gruppeGString = "" + raute + rampe + sonnenrand;
                gruppeHString = "" + quadrat + dreieck + herz;
                gruppeIString = "" + herz + dreieck + kreis;
                // Reihen als Integer!
                gruppeAInt = Integer.valueOf(gruppeAString);
                gruppeBInt = Integer.valueOf(gruppeBString);
                gruppeCInt = Integer.valueOf(gruppeCString);
                gruppeDInt = Integer.valueOf(gruppeDString);
                gruppeEInt = Integer.valueOf(gruppeEString);
                gruppeFInt = Integer.valueOf(gruppeFString);
                gruppeGInt = Integer.valueOf(gruppeGString);
                gruppeHInt = Integer.valueOf(gruppeHString);
                gruppeIInt = Integer.valueOf(gruppeIString);

                //Abfrage, ob Werte richtige Ergebnisse ergeben
                if (gruppeAInt + gruppeBInt == gruppeCInt && // Abfrage über die Zeilen!
                gruppeDInt + gruppeEInt == gruppeFInt &&
                gruppeGInt + gruppeHInt == gruppeIInt) {
                    if (gruppeAInt - gruppeDInt == gruppeGInt &&
                    gruppeDInt - gruppeEInt == gruppeHInt &&
                    gruppeCInt - gruppeFInt == gruppeIInt) {
                        System.out.println("Algorithmus läuft, Baby!");
                        ausprobieren = false;
                        break;
                    }
                }
            }

            proben += 1;
        }

        System.out.println("\n\nDer Computer hat " + proben + "Versuche gebraucht, um das Ergebnis zu berechnen!\n");
        //                  Ausgabe der Ergebnisse
        System.out.println("Stern entspricht " + stern);
        System.out.println("Rampe entspricht " + rampe);
        System.out.println("Raute entspricht " + raute);
        System.out.println("Herz entspricht " + herz);
        System.out.println("Dreieck entspricht " + dreieck);
        System.out.println("Quadrat entspricht " + quadrat);
        System.out.println("Auge entspricht " + auge);
        System.out.println("Kleeblatt entspricht" + kleeblatt);
        System.out.println("Sonnenrand entspricht " + sonnenrand);
        System.out.println("Kreis entspricht " + kreis);

        System.out.print("\nDas Ergebnis insgesamt:\n" +
                gruppeAInt + " + " + gruppeBInt + " = " + gruppeCInt + "\n" +
                gruppeDInt + " + " + gruppeEInt + " = " + gruppeFInt + "\n" +
                gruppeGInt + " + " + gruppeHInt + " = " + gruppeIInt);

        /*
        int stern = 0;          //0 -- 1
        int rampe = 0;          //1 -- 2
        int raute = 0;          //2 -- 3
        int herz = 0;           //3 -- 4
        int dreieck = 0;        //4 -- 5
        int quadrat = 0;        //5 -- 6
        int auge = 0;           //6 -- 7
        int kleeblatt = 0;      //7 -- 8
        int sonnenrand = 0;     //8 -- 9
        int kreis = 0;          //9 -- 10
        */
    }
}
