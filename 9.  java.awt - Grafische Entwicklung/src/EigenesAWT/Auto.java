package EigenesAWT;

public class Auto {
    public void Auto () {

    }
    public void zeichne(){
        // ----------------------------------- Reifen ------------------------------------------------------------------
        Kreis radV = new Kreis();
        radV.sichtbarMachen();
        radV.farbeAendern("schwarz");
        radV.groesseAendern(25);
        radV.setxPosition(55);
        radV.setyPosition(115);
        radV.sichtbarMachen();
        Kreis radH = new Kreis();
        //radH.sichtbarMachen();
        radH.farbeAendern("schwarz");
        radH.groesseAendern(25);
        radH.setxPosition(170);
        radH.setyPosition(115);
        radH.sichtbarMachen();

        // ----------------------------------- Karosserie --------------------------------------------------------------
        Rechteck karosserieU = new Rechteck();
        karosserieU.sichtbarMachen();
        karosserieU.groesseAendernx(150);
        karosserieU.setxPosition(50);
        karosserieU.groesseAenderny(30);
        karosserieU.setyPosition(100);
        karosserieU.farbeAendern("blau");
        Rechteck karosserieO = new Rechteck();
        karosserieO.sichtbarMachen();
        karosserieO.groesseAendernx(100);
        karosserieO.setxPosition(75);
        karosserieO.setyPosition(70);
        karosserieO.farbeAendern("blau");
        // ---------------------------------- Fenster ------------------------------------------------------------------
        Quadrat fensterV = new Quadrat();
        fensterV.sichtbarMachen();
        fensterV.groesseAendern(20);
        fensterV.farbeAendern("glas");
        fensterV.sichtbarMachen();
        fensterV.setxPosition(80);
        fensterV.setyPosition(80);
        fensterV.sichtbarMachen();
        Quadrat fensterH = new Quadrat();
        fensterH.sichtbarMachen();
        fensterH.groesseAendern(20);
        fensterH.farbeAendern("glas");
        fensterH.setxPosition(125);
        fensterH.setyPosition(80);
        fensterH.sichtbarMachen();
    }
}
