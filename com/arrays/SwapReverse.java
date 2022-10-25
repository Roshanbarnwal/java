package com.arrays;

import java.util.Arrays;

public class SwapReverse {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr,start, end);
            start++;
            end--;
        }
    }

    static void swap(int []arr,int index1,int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
