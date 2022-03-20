package Aufgabe4Parkhaus;

public class Parker {
    public Parker(){}
    private static Aufgabe4Parkhaus.Ticket Ticket;
    private static Aufgabe4Parkhaus.Automat Automat = new Aufgabe4Parkhaus.Automat();
    private double kstd = 100;

    public static void ticketNehmen(){

    }
    public static void ticketEinschieben(){

    }

    public static boolean isBezahlt() {
        if (Ticket.getStatus(Ticket) == true){
            return true;
        }
        else {
            return false;
        }
    }
    public static Aufgabe4Parkhaus.Ticket ticketAusgeben(){
        return Ticket;
    }

    public static void gebuehrBezahlen(){
        double gebühr = Automat.gebuehrBerechnen(1, false);
        double parkzeit = Automat.gebuehrBerechnen(2, false);
        System.out.println("Für Ihre Parkzeit in Höhe von " + parkzeit + " Stunden müssen Sie " + gebühr + " Euro bezahlen. Die Gebühr wird von Ihrem Konto abgezogen.");
        Ticket.alsBezahltMarkieren();
    }

    public static void neuesTicketNehmen() {
        Ticket = Automat.newTicket(false);
        System.out.println("Viel Spaß beim Parken!");
    }

    public static void neuesTicketNehmenONLYFORPEDMAT() {
        Ticket = Automat.newTicket(true);
        System.out.println("Viel Spaß beim Parken, Herr Mat***!");
    }
    public static void gebuehrBezahlenONLYFORPEDMAT(){
        double gebühr = Automat.gebuehrBerechnen(1, true);
        double parkzeit = Automat.gebuehrBerechnen(2, true);
        System.out.println("Für Ihre Parkzeit in Höhe von " + parkzeit + " Stunden müssen Sie " + gebühr + " Euro bezahlen. Die Gebühr wird von Ihrem Konto abgezogen.");
        Ticket.alsBezahltMarkieren();
    }

}
