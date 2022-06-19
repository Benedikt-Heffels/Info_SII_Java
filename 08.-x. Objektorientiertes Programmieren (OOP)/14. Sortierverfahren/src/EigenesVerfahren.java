import java.util.Scanner;

public class EigenesVerfahren {
    public static void main(String[] args) {
        System.out.println("Willkommen beim SortOMat der BenTech GmbH!");
        System.out.println("Nun folgt die Eingabe der zu sortierenden Liste. Sie können dabei eine Zeile eingeben.");
        Scanner scanner = new Scanner(System.in);
        String unsortiert = scanner.nextLine();
        int [] unsortiertINT = new int[unsortiert.length()];
        // Der Satz wird in Ascii_Integer umgewandelt: So können alle Zeichen gleichermaßen beachtet werden
        for (int i = 0; i < unsortiert.length(); i++) {
            unsortiertINT[i] = unsortiert.charAt(i);
            //System.out.print(unsortiertINT[i] +  ",");
        }


        // ------------------------ sortiertINT wird mit unsortiertINT gefüllt, mit Rauswurf der 32 --------------------
        int [] sortiertINT = new int[unsortiert.length()];
        for (int i = 0; i < unsortiertINT.length; i++) {
            int internal_i = i;
            while (unsortiertINT[internal_i] == 32) {
                internal_i+=1;
            }
            sortiertINT[i] = unsortiertINT[internal_i];
            if (sortiertINT[0] != 0 && sortiertINT[1] != 0) {
                if ((sortiertINT[i] == sortiertINT[(i - 1)] && unsortiertINT[internal_i] != unsortiertINT[internal_i-1])
                        || (sortiertINT[i] == sortiertINT[(i - 1)] && unsortiertINT[i] != unsortiertINT[internal_i-1])) {
                    if (internal_i < unsortiertINT.length ) {
                        sortiertINT[i] = unsortiertINT[internal_i];
                    }
                    else {
                        sortiertINT[i] = 182;
                    }
                }
            }
        }


        // ---------------------------- Sortierverfahren -------------------------------------------
        for (int posSortierteZahl = 0; posSortierteZahl < sortiertINT.length; posSortierteZahl++) {
            int sortierteZahl = sortiertINT[posSortierteZahl]; // "sortierteZahl" hat den Wert der Zahl, die einsortiert werden muss
            int posNeu = posSortierteZahl;
            while (posNeu > 0 && sortiertINT[posNeu-1] > sortierteZahl) { // Geht von Position posSortierteZahl an zum Beginn des Arrays
                sortiertINT[posNeu] = sortiertINT[posNeu-1];
                posNeu--;
            }
            sortiertINT[posNeu] = sortierteZahl;
        }


        // -------------------------- Ausgabe ----------------------------------------
        System.out.println("\nIhre sortierte Eingabe:");

        // Als Ascii-Zahlen
        ///*
        for (int i = 0; i < sortiertINT.length; i++) {
            if (i == sortiertINT.length-1)
                System.out.print(sortiertINT[i]);
            else
                System.out.print(sortiertINT[i] + " | ");
        }
        System.out.println(" ");
        //*/

        // Als Buchstaben
        for (int i = 0; i < sortiertINT.length; i++) {
            if (i == sortiertINT.length-1)
                System.out.print((char) sortiertINT[i]);
            else
                System.out.print((char) sortiertINT[i] + " | ");
        }

    }
}


//        for (int i = 0; i < (lengthUnsortiert - 1); i++) { //Füllt den gesamten Array mit dem Wert 200 (außerhalb Ascii-Spektrum)
//            sortiertINT[i] = 200;
//        }

//        for (int i = 0; i <= (lengthUnsortiert -1); i++) { //Abfrage der Positionen im unsortierten Array
//            if (unsortiertINT[i] != 32) { //32 ist der Ascii-Code der Leerstelle. Um nicht  Leerstelle, , , ... zu erhalten, wird diese beim Sortieren ignoriert.
//                sortiertINT[(lengthUnsortiert-1)] = unsortiertINT[i];
//                System.out.println("FOR2");
//                System.out.println(i + ":" + unsortiertINT[i]);
//                for (int posSorted = (lengthUnsortiert - 1); posSorted > 2; posSorted--) {
//                    if (sortiertINT[posSorted] <= sortiertINT[posSorted-1]){
//                        int zwischenspeicherung = sortiertINT[posSorted]; // unsortiert
//                        sortiertINT[posSorted] = sortiertINT[posSorted-1]; // tausch klein gegen groß
//                        sortiertINT[posSorted-1] = zwischenspeicherung; //a n nun freie Position in einsetzen
//                    }
//                }
//            }
//        }
