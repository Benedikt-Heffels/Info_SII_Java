package huecktechunivers;


import java.util.Scanner;

public class hauptmenue {
    public static void main(String[] args) {
        System.out.println("Willkommen im Hauptmen� des HTU!");
        System.out.println("Bitte loggen Sie sich mit ein, um fortfahren zu k�nnen. Alternativ geben sie 'KK' f�r" +
                " 'Kein Konto' ein, um eines zu erstellen");

        System.out.println("Hallo Nutzer, worauf wollen Sie nun zugreifen?");
        System.out.println("\t(1) Die HueckTechBank");
        System.out.println("\t(2) Das HueckTechLotto");
        System.out.println("\t(3) Den Mercedes-Benz Vertragsh�ndler HueckTech");
        System.out.println("Eingabe: ");
        Scanner scanner = new Scanner(System.in);
        int wahl = scanner.nextInt();
        if (wahl == 3) {
            huecktechunivers.auto.AutoH�ndlerZugriff.main(null);
        }
        System.out.println("Willkommen zur�ck!");
    }
}
