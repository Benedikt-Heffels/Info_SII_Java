package benzon.Moebelstueck;


public class Tisch extends Moebelstueck{
    public Tisch(){
        this.Breite = 200;
        this.Hoehe = 50;
        this.Tiefe = 100;
        this.Produkt = "Tisch";
        Lieferart();
        defineAnzahl();
    }

    @Override
    public void Lieferart() {
        this.ZSMGBaut = false;
    }
}
