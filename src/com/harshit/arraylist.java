package com.harshit;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
//        list.add(10);
//        list.add(45);
//        list.add(107);
//        list.add(65);
//        list.add(880);
//        list.add(35);
//        System.out.println(list);
//        list.set(0,56);
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());

        }
        System.out.println(list);
    }
}
