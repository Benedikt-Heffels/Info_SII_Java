import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;


public class allg_funktionen {
    public static Scanner scanner = new Scanner(System.in);
    public static File folderusers = new File ("Z. HueckTech/users");
    public static Object LogIn() {
        String strkontopath = "Nicht angemeldet!";
        System.out.println("Bitte loggen Sie sich ein:");
        boolean go = true;
        do {
            String true_pw = "";
            System.out.println("Ihr Benutzername:");
            String e_bn = scanner.next(); //Lesen des Benutzernamens
            System.out.println("Ihr Passwort:");
            String e_pw = scanner.next();
            String userfile = "Z. HueckTech/users/" + e_bn + ".txt";
            File filelogedinuser = new File(userfile);
            if (filelogedinuser.exists()) {
                try {
                    Scanner filescannerFilelogedinuser = new Scanner(filelogedinuser);
                    while (filescannerFilelogedinuser.hasNextLine()) {
                        true_pw = filescannerFilelogedinuser.next();
                        break;
                    }
                    if (e_pw.equals(true_pw)) {
                        System.out.println("LogIn succesfully!");
                        strkontopath = "Z. HueckTech/kstd/" + e_bn + "-kstd.txt";
                        go = true;
                    }
                    else {
                        System.out.println("LogIn Fehlgeschlagen!");
                        go = false;
                    }
                }
                catch (IOException e) {
                    System.out.println("Scan-Fehler!");
                    System.out.println("Fehlercode: S-aF-SC-0001");
                    System.exit(1);
                }
            }
            else {
                System.out.println("LogIn Fehlgeschlagen!");
                go = false;
            }
        } while(!go);
        return strkontopath;
    }

    public static Object kstd_lesen(String varstrkontopath){
        String strkontostand;
        int kontostand = 0;
        File kontopath = new File(varstrkontopath);
        try {
            Scanner filescanner = new Scanner(kontopath);
            while (filescanner.hasNext()) {
                strkontostand = filescanner.next();
                kontostand = Integer.valueOf(strkontostand);
                break;
            }
            filescanner.close();

        }
        catch (IOException e) {
            System.out.println("Scan-Fehler!");
            System.out.println("Fehlercode: S-aF-SC-0002");
            System.exit(1);

        }
        return kontostand;
    }

    public static Object kstd_veraendern (String varstrkontopath, int kontostandaenderung, int funktion) {
        // funktion = 1 => addieren; funktion = 2 => subtrahieren
        String strkontostand;
        int kontostand = 0;
        File kontopath = new File(varstrkontopath);
        try {
            Scanner filescanner = new Scanner(kontopath);
            while (filescanner.hasNext()) {
                strkontostand = filescanner.next();
                kontostand = Integer.valueOf(strkontostand);
                break;
            }
            filescanner.close();

        }
        catch (IOException e) {
            System.out.println("Scan-Fehler!");
            System.out.println("Fehlercode: S-aF-SC-0002");
            System.exit(1);
        }
        switch (funktion) {
            case 1:
                kontostand += kontostandaenderung;
                break;
            case 2:
                kontostand -= kontostandaenderung;
                break;
            default:
                System.out.println("Error!");
        }
        try {
            OutputStream stream = new FileOutputStream(kontopath);
            String ausgabe = String.valueOf(kontostand);
            stream.write(ausgabe.getBytes(StandardCharsets.UTF_8));
            stream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
