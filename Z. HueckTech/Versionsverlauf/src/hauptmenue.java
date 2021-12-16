import java.util.Scanner;

public class hauptmenue {
    public static void main(String[] args) {
        System.out.println("Herzlich Willkommen bei den Programmen der HueckTech!");
        System.out.println("In der aktuellen Version können Sie auf folgende Programme zugreifen: ");
        boolean go = true;
        Scanner scanner = new Scanner(System.in);
        while (go) {
            System.out.println("\t(1) Bank\n" +
                    "\t(2) Lotto");
            int wahl = Integer.valueOf(scanner.next());
            switch (wahl) {
                case 1:
                    Bank.main(); //ERROR
                    break;
                case 2:
                    Lotto.main(); //ERROR
                    break;
            }
            go = false;
        }
    }
}
