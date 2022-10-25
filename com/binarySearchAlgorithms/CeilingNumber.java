package com.binarySearchAlgorithms;
//ceiling of a number 'N' is the number equal to or just greater than 'N'.
//floor of a number 'x' is the number equal to or just smaller than 'x'.
public class CeilingNumber {
    public static void main(String[] args){
        int[] arr = {2,3,4,5, 11, 12, 13,15,23,25,27,33,39,41,43};
        int target = 44;
        System.out.println("the ceiling number of " + target + " is at index "+ ceiling(arr,target));
    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;

            if(start > end){
                for(; mid<arr.length; mid++){
                    if(arr[mid] > target)
                        return mid;
                }
            }
        }
        //it is possible that the target number will be the greatest of all inside the array.
        return -1;
    }
}
