package pushpak42;

import java.util.Arrays;

public class InsertionSort {
    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        System.out.println("Original Integer Array:");
        System.out.println(Arrays.toString(intArray));

        insertionSort(intArray);
        System.out.println("Sorted Integer Array:");
        System.out.println(Arrays.toString(intArray));

        String[] strArray = {"banana", "apple", "orange", "grape"};
        System.out.println("Original String Array:");
        System.out.println(Arrays.toString(strArray));

        insertionSort(strArray);
        System.out.println("Sorted String Array:");
        System.out.println(Arrays.toString(strArray));
    }
}

