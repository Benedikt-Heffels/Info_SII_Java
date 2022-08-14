public class Bubblesort {
    public int[] sort (int[] array) {
        for (int i = 0; i < array.length - 1; i++) { //Der Prozess wird sooft durchlaufen, wie der Array lang ist -1
            for (int j = 0; j < array.length; j++) { //j ist die Position, die verglichen wird
                if (array[j-1] > array[j]) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
//Bubblesort vergleicht immer eine Zahl mit der Zahl davor, dann kommt die nächste Zahl mit der eben verglichenen Zahl...
//Im Anschluss wird diese Prozedur sooft, wie der Array lang ist -1 durchlaufen.
