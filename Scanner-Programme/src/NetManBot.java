import java.util.Scanner;

public class NetManBot {
    public static void main(String[] args) {
        System.out.println("Willkommen beim NetMan-Service!\n" +
                "Wie können wir ihnen helfen?");
        Scanner antwort = new Scanner(System.in);
        String answer_howhelp = antwort.nextLine();
            if(answer_howhelp == "Ich habe ein Problem"){
                System.out.println("Das Tut uns Leid. Wer sind Sie denn?");
                String answer_whoyouare = antwort.nextLine();
                if(answer_whoyouare == "Schüler"){
                    System.out.println("Es freut uns, dass du NetMan nutzt!\n" +
                            "Aber bitte überlasse die Informatik doch den Erwachsenen!\n" +
                            "Was sollten uns deine Interessen interessieren, du zahlst ja immerhin nicht?\n" +
                            "Verpiss dich!");
                    System.exit(1);
            }
        }
    }
}
