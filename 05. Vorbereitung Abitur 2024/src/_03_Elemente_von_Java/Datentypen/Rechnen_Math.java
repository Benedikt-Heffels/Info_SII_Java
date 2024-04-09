package _03_Elemente_von_Java.Datentypen;

public class Rechnen_Math {
    public static void main(String[] args) {
        // Generate random number between 5 to 30
        double a = 0;
        double b = 0;
        boolean bool = true;
        while (bool) {
            a = 5 + (Math.random() * 25);
            b = 5 + (Math.random() * 25);
            if (a == 30 || b == 30) bool = false;
            System.out.println("A: " + a + " B: " + b);
        }
        // Output is different every time this code is executed
        System.out.println(a);
        System.out.println(b);
    }
}
