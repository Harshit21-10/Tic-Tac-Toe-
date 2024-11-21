package com.harshit;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {5,4,8,2,5,1};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0, last);
            swap(arr,maxIndex, last);

        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end ; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void  swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    static  void  bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length ; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j] < arr[j-1]){
                   swap(arr, j,j-1);
                    swapped = true;
                }
            }
            // if we do not run for a particular value of i it means the array is sorted, hence stop the program
            if (!swapped){
                break;
            }
        }
    }
}
