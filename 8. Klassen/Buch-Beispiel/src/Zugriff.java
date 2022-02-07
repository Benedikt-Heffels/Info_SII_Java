// Auf die Klasse zugreifen
public class Zugriff {
    public static void main(String[] args) {
        Buch Test = new Buch(300, "BASF with Ben", "Heffels, Benedikt");
        System.out.println(Test.getTitel());
        Test.setTitel("Ben bei der BASF");
        System.out.println("Das Buch wurde umbennant: " + Test.getTitel());

    }

}
