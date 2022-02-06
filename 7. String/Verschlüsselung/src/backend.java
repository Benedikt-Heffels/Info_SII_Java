import java.util.Random;
import java.util.Scanner;

public class backend {
    public static String zahlenInText_Kontrolle(int asciiINT) {
        String verschlüsselteZahlenKette = "";
        if (asciiINT < 10) {
            verschlüsselteZahlenKette = "00" + String.valueOf(asciiINT);
        }
        else if (asciiINT < 100) {
            verschlüsselteZahlenKette = "0" + String.valueOf(asciiINT);
        }
        else if (asciiINT < 1000) {
            verschlüsselteZahlenKette = String.valueOf(asciiINT);
        }
        return  verschlüsselteZahlenKette;
    }

    public static void main(String[] args) {
        verschlüsseln();
    }
    public static String verschlüsseln() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Nachrichten eingeben (1-Zeilig):");
        String nachricht = scanner.next();
        String verschlüsselteNachricht = "";
        String asciiSTR;
        // Verschlüsselungsstufe 1: In Zahlenkette umwandeln.
        for (int x = 0; x < nachricht.length(); x++) {
            int ascii = (int) nachricht.charAt(x); //Ascii Zahl wird erstellt, max. 3 Ziffern
            String verschlüsselteZahlenKette = zahlenInText_Kontrolle(ascii);
            verschlüsselteNachricht = verschlüsselteNachricht.concat(verschlüsselteZahlenKette);
        }
        //Verschlüsselungsstufe 2: Zahlen mit random Zahl addieren
        String verschlüsselteNachrichtStufe2 = "";
        boolean randomTest = true;
        Random random = new Random();
        int randomaddition = 0;
        while (randomTest) {
            randomaddition = random.nextInt(100); //Randomwert, mit dem später addiert wird
            int extrahierteKetteTest = Integer.valueOf(verschlüsselteNachricht.substring(0, 3)); //Important: IM 'int' wird die Null weggelassen!
            extrahierteKetteTest += randomaddition;
            if (extrahierteKetteTest < 1000) {
                randomTest = false;
                System.out.println(randomaddition);
            }
        }
        for (int x = 0; x < verschlüsselteNachricht.length(); x+=3) {
            if (x%3 == 0 && x > 0) {
                int extrahierteKette = Integer.valueOf(verschlüsselteNachricht.substring((x - 3), x)); //Important: IM 'int' wird die Null weggelassen!
                int verschlüsselteKette = extrahierteKette + randomaddition;
                String verschlüsselteZahlenKette = zahlenInText_Kontrolle(verschlüsselteKette);
                verschlüsselteNachrichtStufe2 = verschlüsselteNachrichtStufe2.concat(verschlüsselteZahlenKette);
            }
            System.out.println("\n" + verschlüsselteNachrichtStufe2);
        }
        int randomposition = random.nextInt(verschlüsselteNachricht.length());
        String pos0 = String.valueOf(verschlüsselteNachrichtStufe2.charAt(0));
        String pos1 = String.valueOf(verschlüsselteNachrichtStufe2.charAt(1));
        if(pos0.equals("0") && !pos1.equals("0")) {
            int verschlüsselteNachrichtStufe2INT = Integer.valueOf(verschlüsselteNachrichtStufe2);
            int angepassteRandomposition = randomposition - 2;
        }
        else if(pos1.equals("0") && pos0.equals("0")){

        }
        else {

        }
        //if zahl 1 = 0
        //if zahl 1+2 = 0

        return null;
    }
    public static String entschlüsseln(String verschlüsselteNachricht) {



        return null;
    }
}
