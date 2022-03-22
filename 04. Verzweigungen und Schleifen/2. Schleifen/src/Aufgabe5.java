public class Aufgabe5 {
    public static void main(String[] args) {

        boolean primzahl = true;
        int anzahlprimzahlen = 0;
        for (int zahl = 2; zahl <= 100; zahl++) {
            for(int division = 2; division < zahl; division++) {
                int modulozahl = zahl % division;
                if (modulozahl == 0) {
                    primzahl = false;
                    break;
                }
            }
            if (primzahl == true) {
                System.out.println(zahl);
                anzahlprimzahlen += 1;
            }
            primzahl = true;
        }
        System.out.println("\nEs gibt " + anzahlprimzahlen + " Primzahlen!");
    }
}
