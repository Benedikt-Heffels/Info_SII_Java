package Aufgabe2Fußball;

public class FC_Hückelhoven {
    public String[][] FC_Spieler = {
                {"Frank", "NONE"}, //0
                {"Johannes", "NONE"}, //1
                {"Fabian", "NONE"}, //2
                {"Benedikt", "NONE"}, //3
                {"Michael", "NONE"}, //4
                {"Jonas", "NONE"}, //5
                {"Ulrich", "NONE"}, //6
                {"David", "NONE"}, //7
                {"Franz", "NONE"}, //8
                {"Wolfgang", "NONE"}, //9
                {"Ralf", "NONE"}, //10
            };

    private static int ToreFC = 0;
    public FC_Hückelhoven(){}

    public static int getToreFC() {
        return ToreFC;
    }

    public static void setToreFC(int toreFC) {
        ToreFC += toreFC;
    }

    public static void FC_HückelhovenSpielverlauf (int arr_pos) {
        switch (arr_pos) {
            case 0:
                System.out.println("Da kommt wohl eine Schildkröte! Eine ganze römische Legion stellt sich vor das eigene Tor. Da haben die Gegner vom SV wohl keine Chance!");
                break;
            case 1:
                System.out.println("Johannes rennt zum Ball im Strafraum des SVs. Er bückt sich danach - und realisiert zum Glück, dass wir nicht im Basketball sind. Er wirft sich nach hinten - um keine rote Karte zu kassieren. Trotz dieses unschönen Weges trifft er trotzdem das Tor. Glückwunsch, Mr. Basketball-statt-Fußball.");
                ToreFC = ToreFC + 1;
                break;
            case 2:
                System.out.println("Der Ball fliegt unaufhaltsam auf das Tor des FCs zu, der Torwart ist mal wieder in die Komplett falsche Ecke gelaufen, doch was ist das? Fabian nimmt das Tor, reißt es aus dem Boden und der Ball fliegt einfach drunter durch, kein Tor für den SV. Glückwunsch zur Stärke, Fabian!");
                break;
            case 3:
                System.out.println("Da kommt der Ball! Unhaltbar! Aber was ist dass, da fliegt wohl ein NetMan-PC gegen den Ball! Der ist toll verteidigt von Benedikt.");
                break;
            case 4:
                System.out.println("Der Gegner wundert sich: Warum will der Ball einfach nicht in das Tor? Michael muss ihn wohl gehackt haben! Unglaublich, dieser FC Hückelhoven");
                break;
            case 5:
                System.out.println("Was ist denn das? Eine wunderschöne Passannahme mit einem perfekten Sprint und ein schönes Tor. Dafür kann er sich einfach nur eine 1 geben!");
                ToreFC = ToreFC + 1;
                break;
            case 6:
                System.out.println("Da ist ein Fahrrad. Auf dem Fußballplatz! Ein schöner Sprint wird damit zurückgelegt - und dann dieser Pass mit dem Frontreifen. Leider nicht angenommen durch den Angespielten, Schade. Trotzdem: Beim Laufsport hat das Fahrrad nichts zu suchen!");
                break;
            case 7:
                System.out.println("David vollzieht eine exotherme Redoxreaktion. Die dadurch entstandene Explosion stößt den Ball ins gegnerische Tor! Das ist natürlich auch ein Weg, Tore zu erziehlen - aber etwas zu gefährlich für dieses Fußballspiel.");
                ToreFC = ToreFC + 1;
                break;
            case 8:
                System.out.println("Franz berechnet die perfekte Flugbahn des Balles - obere rechte Ecke des Tores, dass kann der gegnerische Torwart nicht mehr halten!");
                ToreFC = ToreFC + 1;
                break;
            case 9:
                System.out.println("Good game from Wolfgang! He just scored a nice English goal with his knee. Congratulation!");

                break;
            case 10:
                System.out.println("Ralf holt seinen Taschenrechner raus und rechnet. Mit der perfekten Kraftaufwendung berfördert er den Ball aus dem eigenen Strafraum ins gegnerische Tor!");
                ToreFC = ToreFC + 1;
                break;
        }
    }

}
