public class Selectionsort {
    private int[] array;

    private void selectionSort() {
        for (int i = 0; i < array.length; i++) {
            int minpos = minimumPosition(i);
            swap(minpos, i);
        }
    }

    private int minimumPosition (int from) {
        int minpos = from;
        for (int i = from+1; i < array.length; i++) {
            if(array[i] < array[minpos]) minpos = i;
        }
        return minpos;
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

//Der Array wird der länge nach durchgangen. Dabei wird die aktuelle Position mit dem Rest des Arrays verglichen.
// In der Methode minimumPosition wird nun geschaut, wo die kleinste Zahl im Array ist, indem der Array komplett
//      durchgangen wird und jede Zahl veglichen wird, ob sie kleiner als minpos ist. Sobald dies geschehen ist,
//      wird die Position übergeben.
// In der Methode Swap werden dann beide Zahlen getauscht.

