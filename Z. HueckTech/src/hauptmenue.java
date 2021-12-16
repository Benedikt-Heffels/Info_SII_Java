import java.io.File;
import java.util.Scanner;

public class hauptmenue {
    public static void main(String[] args) {
        boolean go = true;
        File kontopath = new File("Z. HueckTech/users/NE-NichtEingeloggt.txt");
        String strkontopath = "Nicht Eingeloogt!";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Herzlich Willkommen bei den Programmen der HueckTech!");
        boolean aOrK = true;
        do {
            System.out.println("Bitte melden Sie sich an oder erstellen Sie ein Konto! (A/K)");
            String anmeldenorerstellen = scanner.next();
            if (anmeldenorerstellen.equals("A")) {
                String strkontopathungueltig = (String) allg_funktionen.LogIn();
                if (!(strkontopathungueltig.equals("Nicht angemeldet!"))) {
                    strkontopath = strkontopathungueltig;
                    kontopath = new File(strkontopath);
                    go = true;
                    aOrK = true;
                }
            }
            else if (anmeldenorerstellen.equals("K")) {
                System.out.println("UPDATE REQUIRED!");
            }
            else {
                aOrK = false;
            }
        } while (!aOrK);
        System.out.println("In der aktuellen Version können Sie auf folgende Programme zugreifen: ");
        while (go) {
            System.out.println("\t(1) Bank\n" +
                    "\t(2) Lotto\n" +
                    "\t(3) Programm verlassen");
            int wahl = Integer.valueOf(scanner.next());
            switch (wahl) {
                case 1:
                    Bank.bankMain(null, strkontopath, false, true);
                    go = true;
                    break;
                case 2:
                    Lotto.lottoMain(null, strkontopath,false, true);
                    go = true;
                    break;
                case 3:
                    go = false;
            }
        }
        System.out.println("\n\nVielen Dank, dass Sie HueckTech-Software verwendet haben!\n" +
                "Wir hoffen, Sie bald wieder beehren zu dürfen!");
        System.out.println("\n\nImpressum:\n" +
                "HueckTech GmbH\n" +
                "HueckPlaza 1\n" +
                "41836-Hückelhoven\n" +
                "Deutschland\n" +
                "#betterforyou");
    }
}
