package Practical1;

public class Main {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {7, 2, 5, 1, 6};
        sort.selectionSort(intArray);
        System.out.println("Array integerArray contains:");
        printArray(intArray);

        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");
    }
}



