package benzon;


import java.util.Scanner;

public abstract class Ware { //extends benzon.ALT.Warenkorb {
    protected static Scanner scanner = new Scanner(System.in);

    protected String Produktkategorie;
    protected String Produkt;
    protected double Preis;
    protected int Anzahl;
    protected static int AnzahlProdukteBeiBenzon = 1;

    public Ware() {
    }




    public static int getAnzahlProdukteBeiBenzon() {
        return AnzahlProdukteBeiBenzon;
    }

    public void SelectProdukt(Ware ware) { //Nur bei Produkten mit mehreren Untermöglichkeiten
        Produkt = "UNDEFINED";
        Produktkategorie = "UNDEFINED";
    }

    public void defineAnzahl(){
        System.out.println("Wie of wollen Sie den " + Produkt + " geliefert bekommen?");
        Anzahl = scanner.nextInt();
    }

    public static void WarenkorbAusgeben(Ware ware){//Ware [] wares){
        System.out.println("Produkte in Ihrem Warenkorb: ");
        int varAnzahl = ware.Anzahl;
        for (int i = 0; i < AnzahlProdukteBeiBenzon; i++) {
            System.out.println(varAnzahl+ " mal der " + ware.Produkt + " für " + ware.Preis + " €.");
            //System.out.println(wares[i].Anzahl + " mal der " + wares[i].Produkt + " für " + wares[i].Preis + "€.");
            if (ware.Produktkategorie.equals("Möbelstück")){
                ware.WarenkorbDetailsAusgeben(ware);
            }
            else{

            }
        }
    }
    public void WarenkorbDetailsAusgeben(Ware ware){
        System.out.println("Error 100");
        System.out.println("Für nähere Definition, Produkt auswählen!");
    }
}
