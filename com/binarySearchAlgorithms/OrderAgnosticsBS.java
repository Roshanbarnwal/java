package com.binarySearchAlgorithms;

import com.arrays.SwapReverse;

import java.util.Arrays;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5, 11, 12, 13,15,23,25,27,33,39,41,43};
        int target = 11;
        System.out.println(Arrays.toString(arr));
        System.out.println(target + " is found at index " + orderAgnosticsBS(arr,target));
        //importing reverse function from SwapReverse class in arrays.
//        SwapReverse obj = new SwapReverse();
//        obj.reverse(arr);
        //since reverse() is static, we don't need to create the object
        SwapReverse.reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(target + " is found at index " + orderAgnosticsBS(arr,target));
    }

    static int orderAgnosticsBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        //checking if the arr is ascending or descending
        boolean isAsc = arr[0] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            //writng for both ascending and descending
            if(isAsc){
                if(arr[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            else{
                if(arr[mid] < target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
/*
even when we are given sorted array, we still don't  know if it is ascending or descending. Binary Search for both
cases has different code. So we need to modify our code accordingly. Order Agnostics Binary Search is all about that.

Now, there might be cases when a number of consecutive elements are same. So the best scenario to check the nature
of sorting is to check the first and last element.
 */
