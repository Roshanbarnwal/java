package com.binarySearch2D;
import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args){
        //both row & column wise sorted array
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 33;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr. length - 1;//since right now we are considering n x n matrix. // c = arr[0].length for m x n.

        while(r < arr.length && c >= 0){
            if(arr[r][c] == target){
                return new int[] {r,c};
            }
            else if(arr[r][c] < target){
                r++;        //since we are starting our search from last column, in this condition, target won't
                            //be in column greater than that of arr[r][c]
            }
            else{
                c--;    //
            }
        }
        return new int[] {-1,-1};
    }
}
/*
we can traverse through each element in the matrix but then time complexity will be O(n^2).
But with this method, time complexity = n + n = 2n => O(n)
Here, row is increasing & column is decreasing one by one and not simultaneously.
So, when row goes from 0 to n-1, time = n
And when col goes from n-1 to 0, time = n
Since both goes one after another, no one has any affect in increasing or decreasing the time of traversing of
 each other. So, n + n happens.
 */
