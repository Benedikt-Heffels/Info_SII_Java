package Aufgabe2Fu�ball;

public class SV_HueckHaupt {
    public String[][] SV_Spieler = {
            {"Pedro", "NONE"},//0
            {"Irene", "NONE"},//1
            {"Mateo", "NONE"},//2
            {"Dorina", "NONE"},//3
            {"Franziska", "NONE"},//4
            {"Karolin", "NONE"},//5
            {"Angelika", "NONE"},//6
            {"Guido", "NONE"},//7
            {"Rebecca", "NONE"},//8
            {"Frank D.", "NONE"},//9
            {"Rita", "NONE"}//10
    };
    private static int toreSV = 0;

    public SV_HueckHaupt() {
    }

    public static int getToreSV() {
        return toreSV;
    }

    public static void SV_HueckHaupt(int arr_pos) {
        switch (arr_pos) {
            case 0:
                System.out.println();
                break;
            case 1:
                System.out.println("Der SV st�rmt auf das Tor zu, der FC ist in der  mit den Verteidigern in der Unterzahl, " +
                        "doch was passiert da? Auf einmal bei 30 Grad im Schatten, beginnt der Boden zu gefrieren, " +
                        "GLATEIS und die Gegner Purzeln nur so da hin, gute Defensivverteidigung des FCs.");
                break;
            case 2:
                System.out.println("Mateo, de SV, realiza un r�pido sprint con el bal�n, desafortunadamente, Jonas es m�s r�pido y le roba el bal�n."); //Mateo vom SV liefert einen schnellen Sprint mit dem Ball. Aber leider ist Jonas schneller und luchst ihm den Ball ab.
                break;
            case 3:
                System.out.println("Warte hat nicht unser Offense Spieler bei Dorina Unterricht? Oh nein was ist das sie droht mit neunen 5 Tonnen Hausaufgaben, er gibt ihr den Ball freiwillig und der SV hat den Ball.");
                break;
            case 4:
                System.out.println("Der Ball kommt! Er fliegt von links! Aber was ist das - rechts daneben? Da kommt eine Gitarre! Eine Gitarre! Sie fliegt und trifft den Ball! Die Gittare ist jetzt zwar kaputt, aber daf�r wurde der Ball gut abgewehrt durch Franziska Schepers vom SV!");
                break;
            case 5:
                System.out.println("Was ist denn dass? Eine gro�e Statur von Goethe! Die im Tor, ist wohl perfekt." +
                        "Und da liegt er, denkt �ber seine Naturlyrik nach. Aber wie auch schon Newton ignoriert er alles um sich herum. Tor f�r den FC - der w�re jedoch haltbar gewesen.");
                break;
            case 6:
                System.out.println("Angelika, nicht malen! Das ist zwar ein wundersch�nes Bild, aber wir spielen Fu�ball!" +
                        "Warte, was ist dass? Sie nimmt den Leinwandst�nder und wirft ihn auf den Ball! Sch�n verteidigt. Und das beste: genau dass zeigt auch ihr Bild! Wow.");
                break;
            case 7:
                System.out.println("Der Ball Fliegt mit voller Wucht auf das Tor des FCs zu, der Torwart hat keine Chance, doch was ist das? Der Ball bleibt einfach in der Luft stehen, wegen derTr�gheit der Masse. Das war eine gute Praxisdemonstration, Guido! Leider hat jedoch jetzt der FC den Ball...");
                break;
            case 8:
                System.out.println("Da w�chst ein Baum! Ein Baum! Im Tor! Gut abgewehrt durch diese Fagus sylvatica und ihre Bl�tter. Gute Idee, Rebecca"); //Fagus sylvatica = Rotbuche
                break;
            case 9:
                System.out.println("Eigentor durch Frank D. und den SV! Ihr Business l�uft wohl nicht...");
                FC_H�ckelhoven fc_h�ckelhoven = new FC_H�ckelhoven();
                fc_h�ckelhoven.setToreFC(1);
                break;
            case 10:
                System.out.println("Mitten im Spiel unterh�lt sie sich einfach mit dem Torwart des FCs, der Trainer vom SV HueckHaupt bekommt fast einen Nervenzusammenbruch, aber auf einmal knickt der FCsche Torwart ein und schl�ft ein, sofort ist ihre Offensive zur stelle und TOOOORRRR f�r den SV HueckHaupt!!");
                toreSV += 1;
                break;
        }
    }


}
