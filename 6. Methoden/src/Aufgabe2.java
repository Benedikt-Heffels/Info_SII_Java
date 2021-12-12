// 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 min
public class Aufgabe2 {
    public static double array [][] = new double[3][10];
    public static double tarif1() {
        //11,75 / Month; 50 ct. / Min
        double monthcoasts1 = 11.75;
        double min1 = 0.5;
        double coasts = 0;
        for (double i = 1; i <= 100; i++) {
            coasts += min1;
            if (i%10 == 0) {
                array[0][(int) (i/10-1)] = coasts;
            }
        }
        return monthcoasts1;
    }

    public static double tarif2 () {
        // 19,25 / Month;  25 ct. / min
        double monthcoasts2 = 19.25;
        double min2 = 0.25;
        double coasts = 0;
        for (double i = 1; i <= 100; i++) {
            coasts += min2;
            if (i % 10 == 0) {
                array[1][(int) (i / 10 - 1)] = coasts;
            }
        }
        return monthcoasts2;
    }

    public static double tarif3 () {
        // 22,75 / Month; 30 min frei, danach 0,375 ct/min
        double monthcoasts3 = 22.75;
        double min3 = 0.375;
        double freeminutes3 = 30;
        double coasts = 0;
        for (double i = 1; i <= 100; i++) {
            if (i > freeminutes3) {
                coasts += min3;
            }
            if (i % 10 == 0) {
                array[2][(int) (i / 10 - 1)] = coasts;
            }
        }
        return monthcoasts3;
    }
    public static void drucken (double coasts1, double coasts2, double coasts3 ) {
        System.out.println("Tarif\tMonatskosten\t\t\t\t\t\t\t\t\t\tKosten pro Minute");
        System.out.println("\t\t\t\t\t\t10.0\t20.0\t30.0\t40.0\t50.0\t60.0\t70.0\t80.0\t90.0\t100.0\tMinuten");
        for (int h = 0; h < 3; h++) {
            switch (h) {
                case 0 -> System.out.print("\n" + (h + 1) + "\t\t" + coasts1 + "\t\t\t");
                case 1 -> System.out.print("\n" + (h + 1) + "\t\t" + coasts2 + "\t\t\t");
                case 2 -> System.out.print("\n" + (h + 1) + "\t\t" + coasts3 + "\t\t\t");
            }
            for (int i = 0; i < 10; i++) {
                String string = String.valueOf(array[h][i]);
                int length = string.length();
                if (length <= 3) {
                    System.out.print(array[h][i] + "\t\t");
                }
                else {
                    System.out.print(array[h][i] + "\t");

                }

            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Tarifaufstellung:\n");
        double monthcoasts1 = tarif1();
        double monthcoasts2 = tarif2();
        double monthcoasts3 = tarif3();
        drucken(monthcoasts1, monthcoasts2, monthcoasts3);
        System.out.println("\n\nIhre Telekom");

    }
}
