public class test {
    public static void main(String[] args) {
        //Console console = System.console();

        System.out.println("Passwort eingeben: ");
        //char[] password = console.readPassword();
        char[] password = System.console().readPassword();
        System.out.println(password);

    }
}
