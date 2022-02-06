import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.*;

public class date_test_2 {
    public static void main(String[] args) {
//        try {
            LocalDate date = LocalDate.now();
            LocalDate date5 = LocalDate.now();

            System.out.println(date5);
            String date5Str = String.valueOf(date5);
            System.out.println(date5Str);

            if (date5.equals("2021-12-25")) {
                System.out.println("Gleich");
            }
//
//            SimpleDateFormat sdformat = new
//                    SimpleDateFormat("dd-MM-yyyy");
//            Date date1 = sdformat.parse("2020-01-25");
//            Date date2 = sdformat.parse("2020-01-25");
//            System.out.println("Date-1: " +
//                    sdformat.format(date1));
//            System.out.println("Date-2: " +
//                    sdformat.format(date2));
//            if (date1.equals(date2)) {
//                System.out.println(
//                        "Date-1 is same as Date-2");
//            }
//        } catch (ParseException ex) {
//        }
    }
}