package EigenesAWT.Verbesserung;
//@Autor: Benedikt Heffels
//@Version: Verbesserungen/Vereinfachungen (Profi-Version)
public class Auto {
    public void Auto () {

    }

    public void zeichne(){
        // ----------------------------------- Reifen als Kreis --------------------------------------------------------
        Kreis radV = new Kreis(25, 55, 115, "schwarz");
        Kreis radH = new Kreis(25, 170, 115, "schwarz");


        // ----------------------------------- Karosserie als Rechteck -------------------------------------------------
        Rechteck karosserieU = new Rechteck(150, 30, 50, 100, "blau");
        Rechteck karosserieO = new Rechteck(100, 30, 75, 70, "blau");


        // ---------------------------------- Fenster als Quadrat ------------------------------------------------------
        Quadrat fensterV = new Quadrat(20, 80, 80, "glas");
        Quadrat fensterH = new Quadrat(20, 125, 80, "glas");
    }
}
