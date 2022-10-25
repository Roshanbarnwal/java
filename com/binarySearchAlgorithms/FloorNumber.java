package com.binarySearchAlgorithms;

public class FloorNumber {
    public static void main(String[] args){
        int[] arr = {2,3,4,5, 11, 12, 13,15,23,25,27,33,39,41,43};
        int target = 32;
        System.out.println("the floor number of " + target + " is at index "+ floor(arr,target));
    }

    public static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        //corner case: if the target no is not present in the array
        if(target < arr[0] || target > arr[end]){
            return -1;
        }
        boolean isAsc = arr[0] < arr[end];
        //if target number is present in the array then while loop will be sufficient.
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            //order Agnostics binary search
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
        //If target is not in the array, then at a point, end=start=mid.
        //if mid < target => start = mid + 1 . So, this start will be just greater than target.
        //Also, start > end & this end will be just smaller than target.
        //Also, start = end + 1 .
        return end;
    }
}
