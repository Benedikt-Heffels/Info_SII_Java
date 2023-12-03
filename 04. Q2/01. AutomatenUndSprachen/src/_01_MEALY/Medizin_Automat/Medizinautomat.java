package _01_MEALY.Medizin_Automat;

public class Medizinautomat {
    // enum in if mit .equals
    public enum tEingabe {btFach, btRezept, btWahl, btWeitereWahl, code, freiRezept, zahlRezept, wahl, karteZahlung}
    public enum tAusgabe {medikament, nichts}
    public enum tZustand {q0, q1, q2, q3, q4}


    private tZustand zustand;


    // --------------- Startfunktion ---------------
    public Medizinautomat() {
        zustand = tZustand.q0;
    }


    // --------------- Getter/Setter ---------------


    // --------------- Automatenfunktionen ---------------
    tZustand Übergangsfunktion(tZustand pZustand, tEingabe pEingabe){
        switch (pZustand) {
            case q0 -> {
                switch (pEingabe) {
                    case btFach -> zustand = tZustand.q1; //Neue Schreibweise: Ohne "break" Funktionsfähig!
                    case btRezept -> zustand = tZustand.q2;
                    case btWahl -> zustand = tZustand.q3;
                    default -> zustand = tZustand.q0;
                }
            }
            case q1 -> {
                if (pEingabe == tEingabe.code) {
                    zustand = tZustand.q0;
                } else {
                    zustand = tZustand.q1;
                }
            }
            case q2 -> {
                switch (pEingabe) {
                    case zahlRezept -> zustand = tZustand.q4;
                    case freiRezept -> zustand = tZustand.q0;
                    default -> zustand = tZustand.q2;
                }
            }
            case q3 -> {
                if (pEingabe == tEingabe.wahl) {
                    zustand = tZustand.q4;
                } else {
                    zustand = tZustand.q3;
                }
            }
            case q4 -> {
                switch (pEingabe) {
                    case karteZahlung -> zustand = tZustand.q0;
                    case btWeitereWahl -> zustand = tZustand.q3;
                    default -> zustand = tZustand.q4;
                }
            }
        }
        return zustand;
    }

    tAusgabe Ausgabefunktion (tEingabe pEingabe){
        tAusgabe ausgabe = tAusgabe.nichts;
        if (pEingabe.equals(tEingabe.code) || pEingabe.equals(tEingabe.freiRezept) ||
                pEingabe.equals(tEingabe.karteZahlung)){ //Zustand hierbei immer q0!
            ausgabe = tAusgabe.medikament;
        }
        return ausgabe;
    }
}
