package ImportAusTXT;//https://www.youtube.com/watch?v=PmJcd9ZyBf4
//import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Path path = Path.of("D:/JavaProjects/Info_SII_Java/ImportAusTXT.test/src/txtdatei.txt");
        FileWriter writer;
        //File datei = new File("C: \Daten\1. Schule\10. EF\11. Informatik\JavaProjects\Info_SII_Java\Z. Codeexperimente" +
                //"\Z.2 Aus txt importieren\src\textdatei.txt");
        File datei = new File("Z. Lernen/src/ImportAusTXT/textdatei.txt");
        /*try {
            writer = new FileWriter(datei);
            writer.write("Hallooooo");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
         */
        try {
            Scanner scan = new Scanner(datei);
            while (scan.hasNext()) { // Exception?!
                System.out.print(scan.next() + " ");
                scan.close();
            }
        }catch (IOException e) {
            System.out.println("ERROR");
        }
    }
}

