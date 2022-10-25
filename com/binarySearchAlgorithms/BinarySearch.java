package com.binarySearchAlgorithms;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,3,4,5, 11, 12, 13,15,23,25,27,33,39,41,43};
        System.out.println("11 is present at index: "+ searchIndex(arr,11));
    }

    static int searchIndex(int[] arr,int target){
        int start = 0;
        int end = arr.length;
        while(start <= end){
//            int mid = (start + end) / 2;      //there might be the possibility that sum of 2 large numbers may exceed
            int mid = start + (end - start) / 2;//the range of int in java, this new formula is used.
            if(arr[mid] < target)
                start = mid + 1;
            else if(arr[mid] > target)
                end = mid - 1;
            else
                return mid;

        }
        return -1;
    }
}
