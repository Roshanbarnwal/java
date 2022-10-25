package com.linearSearchAlgorithms;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args){
        int[][] arr = {         //~ int[][] arr = new int[][]{  //it is also valid but since we have declaration of
                {1,3,4,5},                                      //variable for 2D array, we don't need it.
                {6,7,8},
                {9,10,11,12,13},
                {2}
        };
        int target = 101;
        System.out.println(search(arr,target));
        int[] ans = search1(arr,7);
        System.out.println("7 is present in Index: "+ Arrays.toString(ans));
        System.out.println("Maximum element in the 2D array is "+ max(arr));
    }

    static int search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
//            for(int j=0; j<arr[i].length; j++){
            for(int element : arr[i]){
                if(target == element)
                    return element;
            }
        }
        return Integer.MIN_VALUE;
    }
    //returning index of element in the format {row,column}
    static int[] search1 (int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row : arr){
            for(int col : row){
                if(max < col){
                    max = col;
                }
            }
        }
        return max;
    }
}
