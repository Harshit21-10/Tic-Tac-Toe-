package com.harshit;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        String b = greeting();
        System.out.println("Hello, "+ b + " How are you?");


    }
    static String greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String a= sc.next();

        return a;

    }
}
