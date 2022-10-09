package Practical1;

public class sort {
    public static <T extends Comparable<? super T>>
    void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; ++j) {
                if (arr[j].compareTo(arr[minIndex])<0) {
                    minIndex = j;
                }
            }
            T temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
