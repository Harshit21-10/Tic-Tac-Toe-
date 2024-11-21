package com.harshit;

import java.util.Scanner;
public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 1;
        System.out.print(a );
        System.out.print(b );


        while ( count < n){
            int nextNumber = a+b;
            a = b;
            b = nextNumber;
            System.out.print( nextNumber);
            count++;
        }
    }
}
