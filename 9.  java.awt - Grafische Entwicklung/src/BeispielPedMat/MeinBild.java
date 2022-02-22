package BeispielPedMat;

public class MeinBild {
    private Kreis kreis1;
    private Quadrat quadrat1;

    public MeinBild() {
    }

    public void zeichne() {
        kreis1 = new Kreis();
        kreis1.sichtbarMachen();
        quadrat1 = new Quadrat();
        quadrat1.sichtbarMachen();
    }
}
   