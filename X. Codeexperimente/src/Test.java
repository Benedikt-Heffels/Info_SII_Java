public class Test {
    public static void main(String[] args) {
//        int zahl1 = 1;
//        int zahl2 = 2;
//        int zahl3 = 3;
//        System.out.println("" + (zahl1 + zahl2 + zahl3));
//        System.exit(200);
//        String ausgabe = "" + zahl1 + zahl2 + zahl3;
//        int ausgabeInt = Integer.valueOf(ausgabe);
//        System.out.println(ausgabeInt);
        for (int anzahlVersuche = 0; anzahlVersuche < 10; anzahlVersuche++) {
            if (anzahlVersuche%2 == 0) {
                System.out.println("Scanning...  (" + anzahlVersuche + ")");
            }
            else if (anzahlVersuche % 2 != 0) {
                System.out.println("Scanning.... (" + anzahlVersuche + ")");
            }

        }

    }
}
