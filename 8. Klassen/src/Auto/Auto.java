public class Auto {
    private String Farbe = "Nichts";
    private String Standort = "Heinsberg";
    private String [] Länder = {"Hier Länder"}; //{"Land" {"Stadt", "Strecke"}{"Stadt", "Strecke2"
    private int TankfüllungAktuell = 0;
    private int MöglicheTankfüllung;
    private double Verbrauch100KM = 0;

    public Auto(){

    }

    public void setMöglicheTankfüllung(int möglicheTankfüllung) { // IN LITER
        MöglicheTankfüllung = möglicheTankfüllung;
    }

    public void setVerbrauch100KM(double verbrauch100KM) { //IN LITER
        Verbrauch100KM = verbrauch100KM;
    }
}
