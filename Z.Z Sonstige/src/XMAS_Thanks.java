import java.net.URI;
import java.awt.*;
import java.time.*;


public class XMAS_Thanks {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Danke für das schöne Buch!");
        URI THANKGIFT = URI.create("https://image.jimcdn.com/app/cms/image/transf/none/path/s0f0279cd4e08afdb/image/i3bb371629cbb41b9/version/1463304797/image.jpg");
        try {
            Desktop.getDesktop().browse(THANKGIFT);
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Sorry, technische Probleme!");
            System.out.println("Hier sollte eigentlich ein 'Herzlichen-Dank-Bild' erscheinen!");
            e.printStackTrace();
        }
        System.out.println("\nFrohe Weihnachten!");
        URI XMASPICTURE = URI.create("https://d28qw2az6gxiqv.cloudfront.net/catalog/product/cache/883b520798109ef01e9f3060a3f87fb7/6/1/61kgjwqemdl._sl1000__1_.jpg");
        try {
            Desktop.getDesktop().browse(XMASPICTURE);
            Thread.sleep(5000);
        } catch(Exception e) {
            System.out.println("Sorry, technisches Probleme!");
            System.out.println("Hier sollte eigentlich ein 'rotes-Frohe-Weihnachten-Bild' erscheinen!");
            e.printStackTrace();
        }
        String dateAsString = String.valueOf(date); //Form: JJJJ-MM-TT
        char YearPosition = dateAsString.charAt(3);
        int YearPositionInt = Integer.valueOf(String.valueOf(YearPosition));
        char Year2022 = 2;
        int Year2021 = 1;
        if (YearPositionInt == Year2022) {
            System.out.println("\n...Und ein frohes Neues Jahr!");
            try {
                URI FROHESNEUES = URI.create("https://guten-rutsch.com/images/easyblog_articles/85/sylvester-1103947_1920.jpg");
                Desktop.getDesktop().browse(FROHESNEUES);
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("Sorry, technische Probleme!");
                System.out.println("Hier sollte eigentlich ein 'Feuerwerk-und-Frohes-Neues-Jahr-Bild' erscheinen");
                e.printStackTrace();
            }
        }
        else if (YearPositionInt == Year2021){
            System.out.println("\n...Und einen guten Rutsch ins neue Jahr!");
            URI GUTENRUTSCH = URI.create("https://img.fotocommunity.com/einen-guten-rutsch-ins-neue-jahr-4e971a24-cb01-41e8-8665-076e14141aa2.jpg?height=1080");
            try{
                Desktop.getDesktop().browse(GUTENRUTSCH);
                Thread.sleep(5000);
            }catch (Exception e) {
                System.out.println("Sorry, technische Probleme!");
                System.out.println("Hier sollte eigentlich ein 'Schornsteinfeger-Figur-wünscht-guten-Rutsch-Bild' erscheinen!");
                e.printStackTrace();
            }
        }
        else {
            System.out.println("\nSorry, technische Probleme!");
            System.out.println("Anscheinend wurde das Programm nicht zwischen 2021 und 2022 abgerufen!");
        }
        System.out.println("\n\nLiebe Grüße");
        System.out.println("Euer Ben");
    }
}
