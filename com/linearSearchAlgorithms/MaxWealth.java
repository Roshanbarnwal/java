package com.linearSearchAlgorithms;

public class MaxWealth {
    public static void main(String[] args){
        int[][] accounts = {
            {1,2,3},
            {4,5,6}
        };
        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for(int[] row : accounts){
            int sum = 0;
            for(int col : row){
                sum += col;
            }
            if(sum > max)
                max = sum;
        }
        return max;
    }

}
