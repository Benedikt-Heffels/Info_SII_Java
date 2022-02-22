package EigenesAWT;

import java.awt.*;

import static EigenesAWT.LeinwandEIgenesAWT.gibLeinwand;

public class Erlenmeyerkolben {

    // ------------------------------------------ Variablen ------------------------------------------------------------


//@!ANPASSUNG: Der Deckel wird noch nicht gezeichnet.
    public void zeichneDeckel () { //Der Deckel ist ein Quadrat!
        int breite = 500;
        int hoehe = 500;
        int xPosition = 100;
        int yPosition = 500;
        String farbe = "blau";
        LeinwandEIgenesAWT leinwand = gibLeinwand();
        leinwand.zeichne(this, farbe, new Rectangle(xPosition, yPosition, breite, hoehe));
        leinwand.warte(10);
    }
    public void zeichneBottom () {
        int hoehe = 200;
        int breite = 400;
        int xPosition = 500;
        int yPosition = 400;

        String farbe = "blau";
                LeinwandEIgenesAWT leinwand = gibLeinwand();
                int[] xpoints = { xPosition, xPosition + (breite / 2),
                        xPosition - (breite / 2) };
                int[] ypoints = { yPosition, yPosition + hoehe, yPosition + hoehe };
                leinwand.zeichne(this, farbe, new Polygon(xpoints, ypoints, 3));
                leinwand.warte(10);
            }



    // ------------------------------------------ Klasseninitialisierung -----------------------------------------------
    public Erlenmeyerkolben() {
        zeichneDeckel();

    }
}
