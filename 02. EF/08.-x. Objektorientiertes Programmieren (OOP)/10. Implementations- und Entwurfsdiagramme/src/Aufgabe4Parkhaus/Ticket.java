package Aufgabe4Parkhaus;

public class Ticket {

    public Ticket(){
        IsBezahlt = false;
    }
    private String AnkunftsZeit;
    private boolean IsBezahlt;

    public void setAnkunftsZeit(String ankunftsZeit) {
        AnkunftsZeit = ankunftsZeit;
    }
    public void alsBezahltMarkieren(){
        IsBezahlt = true;
    }

    public boolean getStatus(Ticket ticket) {
        if(ticket.IsBezahlt == true) {
            return true;
        }
        else {
            return false;
        }
    }

}
