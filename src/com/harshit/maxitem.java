package com.harshit;

public class maxitem {
    public static void main(String[] args) {
        int[] arr = {14, 45, 52, 42, 56 };
        System.out.println(max(arr));

    }
    static int max(int[]arr){
        int maxVal = arr[0];
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;

    }
}
