public class Aufgabe4 {
    public static void main(String[] args) {

        for (int zahl = 1; zahl <= 100; zahl++) {
            //int durch3 = zahl/3;
            //int durch5 = zahl/5;
            if (zahl % 3 == 0 && zahl % 5 == 0) {
                System.out.println("foobar");
            } else if (zahl % 3 == 0) {
                System.out.println("foo");
            } else if (zahl % 5 == 0) {
                System.out.println("bar");
            } else {
                System.out.println(zahl);
            }
        }
    }
}
