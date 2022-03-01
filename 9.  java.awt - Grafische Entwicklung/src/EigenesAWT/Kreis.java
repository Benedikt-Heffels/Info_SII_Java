package EigenesAWT;

import java.awt.geom.Ellipse2D;

/**
 * Ein Original.Kreis, der manipuliert werden kann und sich selbst auf einer Original.Leinwand
 * zeichnet.
 *
 * @author Michael Kölling und David J. Barnes
 * @version 31.07.2011
 */

public class Kreis {
    private int durchmesser;

    private int xPosition;

    private int yPosition;

    private String farbe;

    private boolean istSichtbar;

    /**
     * Erzeuge einen neuen Original.Kreis an einer Standardposition mit einer
     * Standardfarbe.
     */
    public Kreis() {
        durchmesser = 68;
        //xPosition = 230;
        //yPosition = 90;
        farbe = "blau";
    }

    public void setxPosition(int xPosition) {this.xPosition = xPosition;}

    public void setyPosition(int yPosition) {this.yPosition = yPosition;}

    /**
     * Mache diesen Original.Kreis sichtbar. Wenn es bereits sichtbar ist, tue nichts.
     */
    public void sichtbarMachen() {
        istSichtbar = true;
        zeichnen();
    }

    /**
     * Mache diesen Original.Kreis unsichtbar. Wenn es bereits unsichtbar ist, tue
     * nichts.
     */
    public void unsichtbarMachen() {
        loeschen();
        istSichtbar = false;
    }

    /**
     * Bewege diesen Original.Kreis einige Bildschirmpunkte nach rechts.
     */
    public void nachRechtsBewegen() {
        horizontalBewegen(20);
    }

    /**
     * Bewege diesen Original.Kreis einige Bildschirmpunkte nach links.
     */
    public void nachLinksBewegen() {
        horizontalBewegen(-20);
    }

    /**
     * Bewege diesen Original.Kreis einige Bildschirmpunkte nach oben.
     */
    public void nachObenBewegen() {
        vertikalBewegen(-20);
    }

    /**
     * Bewege diesen Original.Kreis einige Bildschirmpunkte nach unten.
     */
    public void nachUntenBewegen() {
        vertikalBewegen(20);
    }

    /**
     * Bewege diesen Original.Kreis horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void horizontalBewegen(int entfernung) {
        loeschen();
        xPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege diesen Original.Kreis vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void vertikalBewegen(int entfernung) {
        loeschen();
        yPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege diesen Original.Kreis langsam horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void langsamHorizontalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            xPosition += delta;
            zeichnen();
        }
    }

    /**
     * Bewege diesen Original.Kreis langsam vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void langsamVertikalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            yPosition += delta;
            zeichnen();
        }
    }

    /**
     * Ändere den Durchmesser dieses Kreises in 'neuerDurchmesser' (Angabe in
     * Bildschirmpunkten). 'neuerDurchmesser' muss größer gleich Null sein.
     */
    public void groesseAendern(int neuerDurchmesser) {
        loeschen();
        durchmesser = neuerDurchmesser;
        zeichnen();
    }

    /**
     * Ändere die Farbe dieses Kreises in 'neueFarbe'. Gültige Angaben sind
     * "rot", "gelb", "blau", "gruen", "lila" und "schwarz".
     */
    public void farbeAendern(String neueFarbe) {
        farbe = neueFarbe;
        zeichnen();
    }

    /**
     * Zeichne diesen Original.Kreis mit seinen aktuellen Werten auf den Bildschirm.
     */
    private void zeichnen() {
        if (istSichtbar) {
            EigenesAWT.Leinwand leinwand = EigenesAWT.Leinwand.gibLeinwand();
            leinwand.zeichne(this, farbe, new Ellipse2D.Double(xPosition,
                    yPosition, durchmesser, durchmesser));
            leinwand.warte(10);
        }
    }

    /**
     * Lösche diesen Original.Kreis vom Bildschirm.
     */
    private void loeschen() {
        if (istSichtbar) {
            EigenesAWT.Leinwand leinwand = EigenesAWT.Leinwand.gibLeinwand();
            leinwand.entferne(this);
        }
    }

}