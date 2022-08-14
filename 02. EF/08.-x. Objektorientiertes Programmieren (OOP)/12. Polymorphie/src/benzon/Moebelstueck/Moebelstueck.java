package benzon.Moebelstueck;


import benzon.Ware;

public class Moebelstueck extends Ware {

    protected int Breite;
    protected int Hoehe;
    protected int Tiefe;
    protected boolean ZSMGBaut;

    public Moebelstueck() {
        Produktkategorie = "Moebelstueck";
    }


    public void Lieferart(){
        System.out.println("Wie möchten Sie ihr Möbelstück geliefert bekommen?");
        System.out.println("\t(1) Zusammengebaut");
        System.out.println("\t(2) Als Bausatz");
        System.out.println("Eingabe:");
        int wahl = scanner.nextInt();
        if (wahl == 1) {
            ZSMGBaut = true;
        }
        else{
            ZSMGBaut = false;
        }
    }



    @Override
    public void SelectProdukt(Ware ware) {
        System.out.println("Was für ein Möbelstück wollen Sie kaufen?");
        System.out.println("\t(1) Bett");
        System.out.println("\t(2) Schrank");
        System.out.println("\t(3) Tisch");
        System.out.println("Eingabe: ");
        int wahl = scanner.nextInt();
        if (wahl == 1 ) {
            ware = new Bett();
        }
        else if (wahl == 2) {
            ware = new Schrank();
        }
        else if (wahl == 3) {
            ware = new Tisch();
        }
    }

    @Override
    public void WarenkorbDetailsAusgeben(Ware ware) {
        System.out.println("Der " + this.Produkt + " hat Maße von " + this.Breite + " (Breite) mal " + this.Hoehe + " (Hoehe) mal" + this.Tiefe + " (Tiefe).");
        if (this.ZSMGBaut) {
            System.out.println("Der " + this.Produkt + " wird zusammengebaut geliefert.");
        }
        else {
            System.out.println("Der " + this.Produkt + " wird als Bausatz geliefert");
        }
    }
}
