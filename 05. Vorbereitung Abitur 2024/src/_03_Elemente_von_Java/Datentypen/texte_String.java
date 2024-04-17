package _03_Elemente_von_Java.Datentypen;

public class texte_String {
    public static void main(String[] args) {
        String superTollerString = "Hello planet earth, you are a great planet.";
        int laenge = superTollerString.length();
        int position = superTollerString.indexOf("planet");

        System.out.println("Länge: " + laenge);
        System.out.println("Substringed: " + superTollerString.substring(position, laenge));
        System.out.println("CharAt: " + superTollerString.charAt(position));
    }
}
