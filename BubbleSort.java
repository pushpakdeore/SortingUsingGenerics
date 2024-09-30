package pushpak42;

import java.util.Arrays;

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(T[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j =0;j< arr.length-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                     T temp  =arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer [] arr ={1,2,32,324,132,4522,2,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        String []  arr2 ={"Pushpak","Absdo","ojvi","onv","Aaditya"};
        sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}