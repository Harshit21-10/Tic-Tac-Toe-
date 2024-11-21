package com.harshit;

import java.util.Arrays;

public class examplearray {
    public static void main(String[] args) {
        int[] arr = {5,40,75,5,78};
//        swap(arr, 0, 4);
        reverse(arr,0,5);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr, int start, int end){
        start = 0;
        end = arr.length -1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    static void swap(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2] = temp;

    }
}
