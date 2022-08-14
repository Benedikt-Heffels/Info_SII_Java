public class Standardverfahren {
    public static int[] sort(int[] array) {
        int zusortieren = 0;
        for (int i = 0; i < array.length; i++) {
            zusortieren = array[i];
            int j = i;
            while (j > 0 && array[j-1] > zusortieren) {
                array[j] = array[j-1]; //Die Elemente, die Größer als die zusortierende Zahl sind, werden eine Position nach hinten verschoben
                j--;
            }
            array[j] = zusortieren; //Die freigewordene Position übernimmt die zusortierende Zahl
        }
        return array;
    }
}
