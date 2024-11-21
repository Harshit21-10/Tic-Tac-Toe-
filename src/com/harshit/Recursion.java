package com.harshit;
/*
 recursion is function calling itself.
 why recursion?
 >> it helps us in solving bigger and complex problem in easy way
 >> we can convert recursion solution into iteration and visa-versa.
 >> space complexity is not constant because of recursive call
 */
public class Recursion {
    public static void main(String[] args) {
//        print(1);
//        System.out.println(fibo(6));
//        int []arr = {1,5,75,80,88,90,100};
//        int target = 88;
//        System.out.println(search(arr,0,target,arr.length-1));
//        System.out.println(factorial(5  ));
        int [] arr = {1,2,5,7 ,10,15,18};
//        System.out.println(sorted(arr, 0));
        int target = 5;
        System.out.println(find(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));

    }
    static void print(int n){
        if (n == 5) {        //base condition : Here our recursion will stop making new call.
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // if we are calling a function again and again, we can treat it as a separate call in the stack.
        print(n +1); // this is called tail recursion, this is the last function call.
    }

    // Fibonacci number
    static int fibo(int n){
        // Base condition
        if(n<2){
            return n;
        }
        
        return fibo(n-1) + fibo(n-2);

    }

    static int search(int []arr, int s, int target, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e - s)/2;
        if(arr[m] == target){
            return m;
        }
        if (target < arr[m]){
            return search(arr, s, target, m-1);
        }
        return search(arr, m+1, target, e);

    }
    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    static  boolean sorted(int[]arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }

    static boolean find(int [] arr, int target, int index){
        if(index == arr.length-1){
            return false;
        }
        return arr[index] == target || find(arr, target,index +1);
    }
    static int findIndex(int [] arr, int target, int index){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndex(arr, target,index +1);
        }
    }
}
