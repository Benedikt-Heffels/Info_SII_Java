package Verschlüsselung;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class date_test {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        String localDateSTR = String.valueOf(localDate.format(formatter));
        System.out.println(localDateSTR);
        int localDateINT = Integer.valueOf(localDateSTR);
        System.out.println(localDateINT);
    }
}
