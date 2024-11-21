package com.harshit;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        pattern7(4);

    }
    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print(" *");
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 1; i <= 2*n; i++) {
            int col = i > n ? 2*n-i: i;
            for (int j = 1; j <=col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = 1; i <= 2*n; i++) {
            int col = i > n ? 2*n-i: i;
            int space = n - col;
            for (int s = 0; s < space ; s++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = 1; i <= n; i++) {
            int space = n - i;
            for (int s = 0; s < space ; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
