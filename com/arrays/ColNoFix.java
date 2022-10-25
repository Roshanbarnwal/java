package com.arrays;

public class ColNoFix {
    public static void main(String[] args) {
//        int[][] arr = {   //this is java way of doing
        int arr[][] = {     //this is C way of doing
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        for (int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("");
        }

    }
}
