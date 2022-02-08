public class Schule {
    private String Fach, Lehrer, Raum, Hausaufgaben, Aufgaben, Inhalte_gelerntes, Materialien, Termine, Sprache, Mitschüler;
    private String [][][] ArraySTR = {
            //Montag
            {{"1", "Biologie", "Herr Latour", "NW2"}, {"2", "Mathe", "Frau Wegner", "C0.47"},
                    {"3", "Informatik", "Herr Matias", "C00.49"}, {"4", "Englisch", "Frau Derichs", "C0.47"},
                    {"Mittagspause"}, {"6", "Deutsch", "Frau Herpers", "Homeschooling"}},
            //Dienstag
            {{"1", "Religion", "Frau Dahlmanns-Kranz", "C0.46"}, {"2", "Sport", "Herr Parnow", "Sporthalle"},
                    {"3", "Latein", "Frau Claßen", "C0.47"}, {"4", "Englisch", "Frau Derichs", "C0.47"},
                    {"Mittagspause"}, {"6", "Biologie", "Herr Latour", "BiÜ"}},
            //Mittwoch
            {{"1", "Informatik", "Herr Matias", "C00.49"}}
    };

    public Schule() {
        Fach = "";
        Lehrer = "";
        Raum = "";

    }

    public static Integer aktuelleStunde (double uhrzeit, int zielWert) {
        int aktuelleStunde = 0;
        int aktuellerArrayWert = 0;
        if (uhrzeit <= 09.05) {
            aktuelleStunde = 1;
            aktuellerArrayWert = 0;
        }
        else if (uhrzeit <= 10.25) {
            aktuelleStunde = 2;
            aktuellerArrayWert = 1;
        }
        else if (uhrzeit <= 11.55) {
            aktuelleStunde = 3;
            aktuellerArrayWert = 2;
        }
        else if (uhrzeit <= 13.20) {
            aktuelleStunde = 4;
            aktuellerArrayWert = 3;
        }
        else if (uhrzeit <= 14.20) {
            aktuelleStunde = 5;
            aktuellerArrayWert = 4;
        }
        else if (uhrzeit <= 15.30) {
            aktuelleStunde = 6;
            aktuellerArrayWert = 5;
        }
        if (zielWert == 1) {
            return aktuelleStunde;
        }
        else if (zielWert == 2) {
            return aktuellerArrayWert;
        }
        else {
            return null;
        }
    }
    public static void getAktuelleStundenDaten(int aktuelleArrayWert, String aktuellerTag) {
        int aktuellerArrayTag;
        if (aktuellerTag.equals("Montag")) {
            aktuellerArrayTag = 0;
        }
        else if (aktuellerTag.equals("Dienstag")) {
            aktuellerArrayTag = 1;
        }
        else if (aktuellerTag.equals("Mittwoch")) {
            aktuellerArrayTag = 2;
        }
        //String stundenNR = ArraySTR [0];
        String fach;
        String lehrer;
        String raum;
    }
}
