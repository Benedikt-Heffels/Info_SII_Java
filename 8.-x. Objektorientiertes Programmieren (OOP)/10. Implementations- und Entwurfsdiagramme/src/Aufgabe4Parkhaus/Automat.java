package Aufgabe4Parkhaus;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Automat {
    public Automat(){}
    private static String AktuelleZeit;
    private double ParkpreisPerHour = 1.50;
    private static String Startzeit = "xx:xx:xx";

    public static void setAktuelleZeit(String aktuelleZeit) {  //ONLYFORPEDMAT
        AktuelleZeit = aktuelleZeit;
    }

    public static void setStartzeit(String startzeit) { //ONLYFORPEDMAT
        Startzeit = startzeit;
    }

    public double getParkpreisPerHour() {
        return ParkpreisPerHour;
    }

    public static String setAktuelleUhrzeit() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        String zonedDateTimeSTR = String.valueOf(zonedDateTime);
        String aktuelleUhrzeit = zonedDateTimeSTR.substring(11,19);
        return aktuelleUhrzeit;
    }

    public static void refreshAktuelleZeit(){
        AktuelleZeit = setAktuelleUhrzeit();
    }

    public static int convertTimeSTRtoTimeINT(int timepos, String time) {
        int hrs = Integer.valueOf(time.substring(0,2));
        int mins = Integer.valueOf(time.substring(3,5));
        int seks = Integer.valueOf(time.substring(6,8));
        switch (timepos) {
            case 1:
                return hrs;
            case 2:
                return mins;
            case 3:
                return seks;
        }
        return hrs;
    }

    public static int zeitunterschied(int startzeithrs, int endzeithrs, int startzeitmins, int endzeitmins) {
        int stundenZuZahlen = 1;
        do {
            if(startzeithrs + stundenZuZahlen == endzeithrs){
                break;
            }
            stundenZuZahlen ++;
        } while(true);
        if(startzeitmins <= endzeitmins) {
            stundenZuZahlen += 1;
        }
        return stundenZuZahlen;
    }

    public double gebuehrBerechnen(int rückgabewert, boolean ONLYFORPEDMAT){
        if(!ONLYFORPEDMAT) {
            refreshAktuelleZeit();
        }
        int startzeithrs = convertTimeSTRtoTimeINT(1, Startzeit);
        int startzeitmins = convertTimeSTRtoTimeINT(2, Startzeit);
        int endzeithrs = convertTimeSTRtoTimeINT(1, AktuelleZeit);
        int endzeitmins = convertTimeSTRtoTimeINT(2, AktuelleZeit);
        int stundenzuzahlen = zeitunterschied(startzeithrs, endzeithrs, startzeitmins, endzeitmins);
        double preis = stundenzuzahlen * ParkpreisPerHour;
        switch (rückgabewert) {
            case 1:
                return preis;
            case 2:
                return (double) stundenzuzahlen;
        }
        return preis;
    }

    public static void ticketEinziehen(){

    }

    public static void ticketAusgeben(){}

    public static Aufgabe4Parkhaus.Ticket newTicket(boolean ONLYFORPEDMAT){
        Aufgabe4Parkhaus.Ticket ticket = new Aufgabe4Parkhaus.Ticket();
        if(!ONLYFORPEDMAT){ //IF ONLYFORPEDMAT == true, ist die Startzeit vordefiniert
            Startzeit = setAktuelleUhrzeit();
        }
        return ticket;
    }
}
