package com.harshit;

public class Binary {
    public static void main(String[] args) {
        int[]arr ={ 3,5,1};
        int target = 3;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid =  start + (end - start)/2 ;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
