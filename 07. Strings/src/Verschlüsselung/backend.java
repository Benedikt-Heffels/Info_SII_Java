import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import java.time.*;

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
        //entschlüsseln();
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
                System.out.println("RandomAdiFaktor: " + randomaddition);
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
        int randomposition = 0;
        boolean trueRandomposition = false;
        String randompositionSTR = "";

        while (!trueRandomposition) {

            randomposition = random.nextInt(verschlüsselteNachricht.length());
            if (randomposition%3 == 0) {
                System.out.println("RandomPos" + randomposition);
                randompositionSTR = zahlenInText_Kontrolle(randomposition);
                trueRandomposition = true;
            }
        }
        String pos0 = String.valueOf(verschlüsselteNachrichtStufe2.charAt(0));
        String pos1 = String.valueOf(verschlüsselteNachrichtStufe2.charAt(1));
        String verschlüsselteNachrichtStufe3 = randompositionSTR + "-";
        if(pos0.equals("0") && !pos1.equals("0")) {
            int angepassteRandomposition = randomposition - 1;
            for (int element = 0; element < verschlüsselteNachrichtStufe2.length(); element++) {
                if (element == angepassteRandomposition) {
                    String randomAdditionCorrect = zahlenInText_Kontrolle(randomaddition);
                    verschlüsselteNachrichtStufe3 = verschlüsselteNachrichtStufe3.concat(randomAdditionCorrect);
                }
                verschlüsselteNachrichtStufe3 = verschlüsselteNachrichtStufe3.concat(String.valueOf(verschlüsselteNachrichtStufe2.charAt(element)));
            }
        }
        else if(pos1.equals("0") && pos0.equals("0")) {
            int angepassteRandomposition = randomposition - 2;
            for (int element = 0; element < verschlüsselteNachrichtStufe2.length(); element++) {
                if (element == angepassteRandomposition) {
                    String randomAdditionCorrect = zahlenInText_Kontrolle(randomaddition);
                    verschlüsselteNachrichtStufe3 = verschlüsselteNachrichtStufe3.concat(randomAdditionCorrect);
                }
                verschlüsselteNachrichtStufe3 = verschlüsselteNachrichtStufe3.concat(String.valueOf(verschlüsselteNachrichtStufe2.charAt(element)));
            }
        }
        else {
            int angepassteRandomposition = randomposition;
            for (int element = 0; element < verschlüsselteNachrichtStufe2.length(); element++) {
                if (element == angepassteRandomposition) {
                    String randomAdditionCorrect = zahlenInText_Kontrolle(randomaddition);
                    System.out.println("Random: " + randomAdditionCorrect);
                    verschlüsselteNachrichtStufe3 = verschlüsselteNachrichtStufe3.concat(randomAdditionCorrect);
                }
                verschlüsselteNachrichtStufe3 = verschlüsselteNachrichtStufe3.concat(String.valueOf(verschlüsselteNachrichtStufe2.charAt(element)));
            }
        }
        System.out.println("V3 " + verschlüsselteNachrichtStufe3);

        // Alles wird mit dem Datum der Verschlüsselung multipliziert!
        LocalDate localDate = LocalDate.now();
        System.out.println(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        System.out.println(2);
        String localDateSTR = String.valueOf(localDate.format(formatter));
        System.out.println(3);
        int localDateINT = Integer.valueOf(localDateSTR);
        System.out.println(4);
        String verschlüsselteNachrichtStufe4 = localDateSTR + "-";
        System.out.println(5);
        if (pos0.equals("0") && !pos1.equals("0")) {
            int mult1 = Integer.valueOf(verschlüsselteNachrichtStufe3.substring(0,3));
            mult1 = mult1 * localDateINT;
            verschlüsselteNachrichtStufe4 = verschlüsselteNachrichtStufe4 + String.valueOf(mult1) + "-";
            long mult2 = Long.valueOf(verschlüsselteNachrichtStufe3.substring(5,((verschlüsselteNachrichtStufe3.length())-1)));
            mult2 = mult2 * localDateINT;
            String mult2STR = "0" + String.valueOf(mult2);
            verschlüsselteNachrichtStufe4 = verschlüsselteNachrichtStufe4 + mult2STR;

        }
        else if (pos0.equals("0") && pos1.equals("0")) {
            int mult1 = Integer.valueOf(verschlüsselteNachrichtStufe3.substring(0,3));
            mult1 = mult1 * localDateINT;
            verschlüsselteNachrichtStufe4 = verschlüsselteNachrichtStufe4 + String.valueOf(mult1) + "-";
            long mult2 = Long.valueOf(verschlüsselteNachrichtStufe3.substring(5,((verschlüsselteNachrichtStufe3.length())-1)));
            mult2 = mult2 * localDateINT;
            String mult2STR = "00" + String.valueOf(mult2);
            verschlüsselteNachrichtStufe4 = verschlüsselteNachrichtStufe4 + mult2STR;
        }
        else {
            int mult1 = Integer.valueOf(verschlüsselteNachrichtStufe3.substring(0,3));
            mult1 = mult1 * localDateINT;
            verschlüsselteNachrichtStufe4 = verschlüsselteNachrichtStufe4 + String.valueOf(mult1) + "-";
            long mult2 = Long.valueOf((verschlüsselteNachrichtStufe3.substring(5,((verschlüsselteNachrichtStufe3.length())-1))));
            mult2 = mult2 * localDateINT;
            String mult2STR = String.valueOf(mult2);
            verschlüsselteNachrichtStufe4 = verschlüsselteNachrichtStufe4 + mult2STR;
        }
        System.out.println("V4 " + verschlüsselteNachrichtStufe4);


        return null;
    }
    public static String entschlüsseln() {
        System.out.println("Bitte zu entschlüsselnde Nachricht eingeben:");
        Scanner scanner = new Scanner(System.in);
        String entschlüsselteNachricht = scanner.next();
        String kompletteEntschlüsselteNachricht = "";
        int posStrich1 = 0;
        int posStrich2 = 0;
        //Bestimmen der späteren Substring-Positions
        for (int element1 = 0; element1 < entschlüsselteNachricht.length(); element1++) {
            String element1STR = String.valueOf(entschlüsselteNachricht.charAt(element1));
            if (element1STR.equals("-")) {
                System.out.println("YES");
                posStrich1 = element1;
                System.out.println("PS1.1 " + posStrich1);
                break;
            }
        }
        for (int element2 = (posStrich1 + 1); element2 < entschlüsselteNachricht.length(); element2++) {
            String element2STR = String.valueOf(entschlüsselteNachricht.charAt(element2));
            if (element2STR.equals("-")) {
                posStrich2 = element2;
                break;
            }
        }
        System.out.println("PS1 " + posStrich1);
        System.out.println("PS2 " + posStrich2);
        long entschlüsseltesDate = Long.valueOf(entschlüsselteNachricht.substring(0, (posStrich1 - 1)));
        long entschlüsseltePosition;
        if ((posStrich1 + 1) == (posStrich2 - 1)) {
            entschlüsseltePosition = Long.valueOf(entschlüsselteNachricht.charAt((posStrich1 + 1)));
        }
        else {
            entschlüsseltePosition = Long.valueOf(entschlüsselteNachricht.substring((posStrich1 + 1), (posStrich2 - 1)));
        }
        entschlüsseltePosition = entschlüsseltePosition / entschlüsseltesDate; //An dieser Position ist der Summand versteckt!
        String posNULL1 = String.valueOf(entschlüsselteNachricht.charAt((posStrich2 + 1)));
        String posNULL2 = String.valueOf(entschlüsselteNachricht.charAt(posStrich2 + 2));
        int anzahlNULLanfang = 0;
        String nachrichtenTextInZahl1STR = "";
        if (posNULL1.equals("0") && !posNULL2.equals("0")) {
            anzahlNULLanfang = 1;
            nachrichtenTextInZahl1STR = "0";
        }
        else if (posNULL1.equals("0") && posNULL2.equals("0")) {
            anzahlNULLanfang = 2;
            nachrichtenTextInZahl1STR = "00";
        }
        else {
            anzahlNULLanfang = 0;
        }
        long nachrtichtenTextInZahl1 = Long.valueOf(entschlüsselteNachricht.substring((posStrich2 + 1), entschlüsselteNachricht.length()));
        nachrtichtenTextInZahl1 = nachrtichtenTextInZahl1 / entschlüsseltesDate;
        nachrichtenTextInZahl1STR = nachrichtenTextInZahl1STR + String.valueOf(nachrtichtenTextInZahl1);
        long additionsfaktor = Long.valueOf(nachrichtenTextInZahl1STR.substring((int) entschlüsseltePosition, ((int) entschlüsseltePosition + 3)));
        System.out.println(additionsfaktor);




        return null;
    }
}