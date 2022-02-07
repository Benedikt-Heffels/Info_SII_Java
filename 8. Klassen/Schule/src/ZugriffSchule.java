public class ZugriffSchule {
    public static void main(String[] args) {
        Unterricht unterricht = new Unterricht();
        unterricht.setLehrer("Herr Matias");
        unterricht.setFach("Informatik");
        unterricht.setRaum("C00.49");
        unterricht.getLesson();
    }
}
