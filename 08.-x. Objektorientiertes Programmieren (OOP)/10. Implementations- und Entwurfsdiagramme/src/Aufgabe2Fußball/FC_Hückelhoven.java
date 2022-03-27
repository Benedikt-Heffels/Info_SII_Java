package Aufgabe2Fu�ball;

public class FC_H�ckelhoven {
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
    public FC_H�ckelhoven(){}

    public static int getToreFC() {
        return ToreFC;
    }

    public static void setToreFC(int toreFC) {
        ToreFC += toreFC;
    }

    public static void FC_H�ckelhovenSpielverlauf (int arr_pos) {
        switch (arr_pos) {
            case 0:
                System.out.println("Da kommt wohl eine Schildkr�te! Eine ganze r�mische Legion stellt sich vor das eigene Tor. Da haben die Gegner vom SV wohl keine Chance!");
                break;
            case 1:
                System.out.println("Johannes rennt zum Ball im Strafraum des SVs. Er b�ckt sich danach - und realisiert zum Gl�ck, dass wir nicht im Basketball sind. Er wirft sich nach hinten - um keine rote Karte zu kassieren. Trotz dieses unsch�nen Weges trifft er trotzdem das Tor. Gl�ckwunsch, Mr. Basketball-statt-Fu�ball.");
                ToreFC = ToreFC + 1;
                break;
            case 2:
                System.out.println("Der Ball fliegt unaufhaltsam auf das Tor des FCs zu, der Torwart ist mal wieder in die Komplett falsche Ecke gelaufen, doch was ist das? Fabian nimmt das Tor, rei�t es aus dem Boden und der Ball fliegt einfach drunter durch, kein Tor f�r den SV. Gl�ckwunsch zur St�rke, Fabian!");
                break;
            case 3:
                System.out.println("Da kommt der Ball! Unhaltbar! Aber was ist dass, da fliegt wohl ein NetMan-PC gegen den Ball! Der ist toll verteidigt von Benedikt.");
                break;
            case 4:
                System.out.println("Der Gegner wundert sich: Warum will der Ball einfach nicht in das Tor? Michael muss ihn wohl gehackt haben! Unglaublich, dieser FC H�ckelhoven");
                break;
            case 5:
                System.out.println("Was ist denn das? Eine wundersch�ne Passannahme mit einem perfekten Sprint und ein sch�nes Tor. Daf�r kann er sich einfach nur eine 1 geben!");
                ToreFC = ToreFC + 1;
                break;
            case 6:
                System.out.println("Da ist ein Fahrrad. Auf dem Fu�ballplatz! Ein sch�ner Sprint wird damit zur�ckgelegt - und dann dieser Pass mit dem Frontreifen. Leider nicht angenommen durch den Angespielten, Schade. Trotzdem: Beim Laufsport hat das Fahrrad nichts zu suchen!");
                break;
            case 7:
                System.out.println("David vollzieht eine exotherme Redoxreaktion. Die dadurch entstandene Explosion st��t den Ball ins gegnerische Tor! Das ist nat�rlich auch ein Weg, Tore zu erziehlen - aber etwas zu gef�hrlich f�r dieses Fu�ballspiel.");
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
                System.out.println("Ralf holt seinen Taschenrechner raus und rechnet. Mit der perfekten Kraftaufwendung berf�rdert er den Ball aus dem eigenen Strafraum ins gegnerische Tor!");
                ToreFC = ToreFC + 1;
                break;
        }
    }

}
