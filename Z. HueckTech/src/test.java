import java.io.Console;

public class test {
    public static void main(String[] args) {
        Console console = System.console();

        if (console != null) {
            System.out.println("Passwort eingeben: ");
            char[] password = console.readPassword();
        }
    }
}
