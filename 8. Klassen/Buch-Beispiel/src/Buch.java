// Attribute, Methoden, ...
public class Buch { // Klassenname
    //Konstruktionsvorschrift für unsere Bücher
    // Attribute
    private int Seitenzahl;
    private String Titel, Autor;

    //Methoden
    //1. - wichtigste Methode - Konstruktor
    //zum erstellen - heißt wie Klasse

    public Buch(int seitenzahl, String titel, String autor) {
        Seitenzahl = seitenzahl;
        Titel = titel;
        Autor = autor;
    }

    // weitere typische Methoden - setter und getter


    public void setTitel(String titel) { //Setter Methode: Setzt das Attribut fest
        Titel = titel;
        //this.Titel = titel; Betonung des Bezuges auf das aktuelle Objekt (this)
    }

    public String getTitel() { //Getter Mehode: Liest das Attríbut aus
        return Titel;
    }
}
