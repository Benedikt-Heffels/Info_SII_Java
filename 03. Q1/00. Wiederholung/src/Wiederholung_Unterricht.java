import java.util.Scanner;

public class Wiederholung_Unterricht {
    public static void main(String[] args) {
        //Variablen
        int x = 5;
        String y = "string";

        //Arrays
        String array [] = {"a", "b", "c", "d"};

        //Eingabe (Scanner)
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        //Entscheidungen mit Bedingungen / Verzweigungen
        if (x == 5) {
            System.out.println("5");
        }
        else if (x == 10) {
            System.out.println(10);
        }
        //Schleifen
            //for
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

        //Klassen (Vererbung)
            //Konstruktor, getter, setter, Attribute
            //Zugriff (weitere Klasse mit main-Methode)

        // String
            // Operationen: concat, substring, length...
            String string = "Hallo";
            string.concat(" Ben");
            String string2 = string.substring(0, 4);
            // equals zum Stringvergleich
            if (string.equals(string2)) {
                System.out.println("Gleich");
            }
            else {
                System.out.println("Nicht Gleich");
            }

        //Methodenaufruf
        int wertMethode = 10;
        wertMethode = methode(wertMethode);

    }
    //Methode
    public static int methode(int paraWertMethode){
        return (paraWertMethode+10);
    }
}