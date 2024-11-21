package com.harshit;

public class Maxwealth {
    public int maximumWealth(int[][] accounts) {
        int maxValue =Integer.MIN_VALUE;
        for(int row=0; row<accounts.length; row++){
            int rowSum = 0;
            for(int col=0; col<accounts[row].length; col++){
                rowSum += accounts[row][col];

            }
            if(rowSum>maxValue){
                maxValue = rowSum;
            }
        }
        return maxValue;
    }
}
