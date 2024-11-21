package com.harshit;

import java.util.Arrays;
import java.util.Scanner;


public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new  int[5];
//        arr[0] = sc.nextInt();
//        arr[1] = sc.nextInt();
//        arr[2] = sc.nextInt();
//        arr[3] = sc.nextInt();
//        arr[4] = sc.nextInt();
//        System.out.println(arr[0]);
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = sc.nextInt();
//        }
//       // System.out.print(Arrays.toString(arr));
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // 2d array
        int[][] rol = new int[3][3];

        for (int row = 0; row < rol.length ; row++) {
            for (int col = 0; col < rol[row].length ; col++) {
                rol[row][col] = sc.nextInt();
            }
        }
//        for (int row = 0; row < rol.length ; row++) {
//            for (int col = 0; col < rol[row].length ; col++) {
//                System.out.print(rol[row][col] + " ");
//            }
//            System.out.println();
//        }
        for (int row = 0; row < rol.length; row++) {
            System.out.println(Arrays.toString(rol[row]));
            
        }

    }
}
