public class Unterricht {
    private String Fach, Lehrer, Raum, Hausaufgaben, Aufgaben, Inhalte_gelerntes, Materialien, Termine, Sprache, Mitschüler;

    public Unterricht () {
        Fach = "";
        Lehrer = "";
        Raum = "";
    }

    public void setFach(String fach) {
        Fach = fach;
    }

    public void setLehrer(String lehrer) {
        Lehrer = lehrer;
    }

    public void setRaum(String raum) {
        Raum = raum;
    }

    public void getLesson() {
        System.out.println("Du hast aktuell " + Fach + " mit " + Lehrer + " in Raum " + Raum + ".");
    }
}
