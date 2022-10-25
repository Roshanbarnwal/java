package com.binarySearchAlgorithms;

import java.util.Arrays;

//https://leetcode.com/problems/split-array-largest-sum/
//this code is only for m = 2 and not in anyway that it is dynamic.
public class SplitArray {
    public static void main(String[] args){
        int[] nums = {7,2,5,10,8};
        int m = 2;//number of non-empty continuous sub-arrays
        System.out.println(splitArray(nums,m));
    }

    //finding the minimum sum possible
    static int splitArray(int[] arr,int m){
        int[] sumArr = new int[arr.length - 1];
        subArrays(arr,sumArr);
        System.out.println("Sum of each sub-arrays:- " + Arrays.toString(sumArr));
        int index = minIndex(sumArr);
        //printing the sub arrays
        System.out.print("[ ");
        for(int i=0; i<= index; i++){
            System.out.print( arr[i] + ", ");
        }
        System.out.println("]");
        System.out.print("[");
        for(int i = index + 1; i < arr.length; i++){
            System.out.print( arr[i] + ", ");
        }
        System.out.println("]");

        return sumArr[minIndex(sumArr)];
    }
    //finding the sum of an array
    static int sum(int[] arr){
        int sum = 0;
        for(int i : arr)
            sum += i;
        return sum;
    }

    //creating 2 subArrays and putting the sum of each subArray into a new array
    static void subArrays(int[] arr,int[] sumArr){
        int size = arr.length;
        for(int i = 0; i< size - 1; i++){
            int[] nums1 = new int[i+1];
            int[] nums2 = new int[size - i-1];
            int size1 = nums1.length , size2 = nums2.length;
            for(int j = 0; j<size1; j++){
                nums1[j] = arr[j];
            }
            for(int j = 0 ; j < size - size1 ; j++){
                nums2[j] = arr[j + size1];
            }
            //finding out the sum of nums1 & nums2, putting into the sumArr
            int s1 = sum(nums1), s2 = sum(nums2);
            sumArr[i] = Math.max(s1,s2);
        }
    }

    static int minIndex(int[] arr){
        int min = arr[0];
        int index = 0;
        int size = arr.length;
        for(int i=0; i< size; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
