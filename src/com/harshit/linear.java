package com.harshit;

public class linear {
    public static void main(String[] args) {
        int [] arr = {5, 10,55, 60, 85,4};
        int target = 555;
        int ans = linearsearch(arr, target);
        System.out.println(ans);

    }
    static int linearsearch(int[]arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {

            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return  -1;
    }
}
