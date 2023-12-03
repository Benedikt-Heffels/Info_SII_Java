package _02_DEA._01_Programme._03_Terme;

public class Termautomat {

    public enum tEingabe {zahl, plus , minus, mal, geteilt, error}
    public enum tZustand {z0, z1, z2, z3, trap}
    public enum tAusgabe {nichts, error, gültig}

    private tZustand zustand = tZustand.z0;
    public Termautomat(){}



    tZustand überganzgfunktion (tZustand pZustand, tEingabe pEingabe) {
        zustand = pZustand;
        switch (zustand) {
            case z0 -> {
                if (pEingabe == tEingabe.zahl) {
                    zustand = tZustand.z1;
                }
                else zustand = tZustand.trap;
            }
            case z1, z3 -> {
                switch (pEingabe){
                    case plus -> zustand = tZustand.z2;
                    case minus -> zustand = tZustand.z2;
                    case mal -> zustand = tZustand.z2;
                    case geteilt -> zustand = tZustand.z2;
                    default -> zustand = tZustand.trap;
                }
            }
            case z2 -> {
                if (pEingabe == tEingabe.zahl) {
                    zustand = tZustand.z3;
                }
                else zustand = tZustand.trap;
            }
        }
        return zustand;
    }

    tAusgabe Ausgabefunktion (tZustand pZustand){
        tAusgabe ausgabe = tAusgabe.nichts;
        if (pZustand == tZustand.trap) {
            ausgabe = tAusgabe.error;
        }
        else if (pZustand == tZustand.z3){
            ausgabe = tAusgabe.gültig;
        }
        return ausgabe;
    }
}
