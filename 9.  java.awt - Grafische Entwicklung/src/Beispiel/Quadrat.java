package Beispiel;

import java.awt.*;

/**
 * Ein Original.Quadrat, das manipuliert werden kann und sich selbst auf einer Original.Leinwand
 * zeichnet.
 *
 * @author Michael Kölling und David J. Barnes
 * @version 31.07.2011
 */

public class Quadrat {
    private int groesse;

    private int xPosition;

    private int yPosition;

    private String farbe;

    private boolean istSichtbar;

    /**
     * Erzeuge ein neues Original.Quadrat mit einer Standardfarbe an einer
     * Standardposition.
     */
    public Quadrat() {
        groesse = 60;
        xPosition = 310;
        yPosition = 120;
        farbe = "rot";
        istSichtbar = false;
    }

    /**
     * Mache dieses Original.Quadrat sichtbar. Wenn es bereits sichtbar ist, tue nichts.
     */
    public void sichtbarMachen() {
        istSichtbar = true;
        zeichnen();
    }

    /**
     * Mache dieses Original.Quadrat unsichtbar. Wenn es bereits unsichtbar ist, tue
     * nichts.
     */
    public void unsichtbarMachen() {
        loeschen();
        istSichtbar = false;
    }

    /**
     * Bewege dieses Original.Quadrat einige Bildschirmpunkte nach rechts.
     */
    public void nachRechtsBewegen() {
        horizontalBewegen(20);
    }

    /**
     * Bewege dieses Original.Quadrat einige Bildschirmpunkte nach links.
     */
    public void nachLinksBewegen() {
        horizontalBewegen(-20);
    }

    /**
     * Bewege dieses Original.Quadrat einige Bildschirmpunkte nach oben.
     */
    public void nachObenBewegen() {
        vertikalBewegen(-20);
    }

    /**
     * Bewege dieses Original.Quadrat einige Bildschirmpunkte nach unten.
     */
    public void nachUntenBewegen() {
        vertikalBewegen(20);
    }

    /**
     * Bewege dieses Original.Quadrat horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void horizontalBewegen(int distance) {
        loeschen();
        xPosition += distance;
        zeichnen();
    }

    /**
     * Bewege dieses Original.Quadrat vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void vertikalBewegen(int entfernung) {
        loeschen();
        yPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege dieses Original.Quadrat langsam horizontal um 'entfernung'
     * Bildschirmpunkte.
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
     * Bewege dieses Original.Quadrat langsam vertikal um 'entfernung' Bildschirmpunkte.
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
     * Ändere die Größe dieses Quadrates in 'neueGroesse'. 'neueGroesse' muss
     * groesser gleich Null sein.
     */
    public void groesseAendern(int neueGroesse) {
        loeschen();
        groesse = neueGroesse;
        zeichnen();
    }

    /**
     * Ändere die Farbe dieses Quadrates in 'neueFarbe'. Gültige Angaben sind
     * "rot", "gelb", "blau", "gruen", "lila" und "schwarz".
     */
    public void farbeAendern(String neueFarbe) {
        farbe = neueFarbe;
        zeichnen();
    }

    /**
     * Zeichne dieses Original.Quadrat mit seinen aktuellen Werten auf den Bildschirm.
     */
    private void zeichnen() {
        if (istSichtbar) {
            BeisielPedMat.Leinwand leinwand = BeisielPedMat.Leinwand.gibLeinwand();
            leinwand.zeichne(this, farbe, new Rectangle(xPosition, yPosition,
                    groesse, groesse));
            leinwand.warte(10);
        }
    }

    /**
     * Lösche dieses Original.Quadrat vom Bildschirm.
     */
    private void loeschen() {
        if (istSichtbar) {
            BeisielPedMat.Leinwand leinwand = BeisielPedMat.Leinwand.gibLeinwand();
            leinwand.entferne(this);
        }
    }
}