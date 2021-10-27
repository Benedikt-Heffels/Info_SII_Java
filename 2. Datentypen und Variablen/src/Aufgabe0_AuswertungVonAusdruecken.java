public class Aufgabe0_AuswertungVonAusdruecken {
    public static void main(String[] args) {
        System.out.println(30 - 5 + " <- 30 - 5 Dies gibt einen Error");
        System.out.println((10/3) + 0.5 + " <- (10/3) + 0.5 gibt keinen Error. Die ersten zwei Zeichen sind bytes, dass " +
                "Ergebnis (3,Periode3) wird also als 3 gespeichert und mit 0,5 addiert");
        System.out.println(1/3 * 1234566789);
    }
}
