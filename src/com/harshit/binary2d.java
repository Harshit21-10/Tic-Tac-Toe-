package com.harshit;

import java.util.Arrays;

public class binary2d {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        int[] ans = search(matrix, 25);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;

        while (r < matrix.length && c >=0){
            if(matrix[r][c] == target){
                return new int[] {r, c};
            }
            if(matrix[r][c] < target){
                r++;
            }else {
                c--;
            }
        }
        return new int[] {-1, -1};
    }
}
