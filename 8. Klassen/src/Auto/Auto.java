public class Auto {
    private String Farbe = "Nichts";
    private String Standort = "Heinsberg";
    private String [] L�nder = {"Hier L�nder"}; //{"Land" {"Stadt", "Strecke"}{"Stadt", "Strecke2"
    private int Tankf�llungAktuell = 0;
    private int M�glicheTankf�llung;
    private double Verbrauch100KM = 0;

    public Auto(){

    }

    public void setM�glicheTankf�llung(int m�glicheTankf�llung) { // IN LITER
        M�glicheTankf�llung = m�glicheTankf�llung;
    }

    public void setVerbrauch100KM(double verbrauch100KM) { //IN LITER
        Verbrauch100KM = verbrauch100KM;
    }
}
