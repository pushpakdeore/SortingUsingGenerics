package pushpak42;

import java.util.Arrays;
import java.util.LinkedList;

public class SelectionSort {
    public static <T extends Comparable<T>> void sort(T[] arr){
        int minindex;
        for(int i =0;i< arr.length-1;i++){
            minindex =i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[minindex].compareTo(arr[j])>0) {
                    minindex=j;

                }

            }
            T temp =arr[minindex];
            arr[minindex]=arr[i];
            arr[i] =temp;
        }

    }
    public static void main(String[] args) {
        Integer [] arr1 ={1,2,5,2,8,2,57,2};
        sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String [] arr2 = {"xsdkb","oib","aaue","uells"};
        sort(arr2);
        System.out.println(Arrays.toString(arr2));



    }
}
