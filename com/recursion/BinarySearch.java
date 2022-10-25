package com.recursion;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,3,4,5, 11, 12, 13,15,23,25,27,33,39,41,43};
        System.out.println("11 is present at index: "+ binarySearch(arr,0,arr.length - 1,11));
    }

    static int  binarySearch(int[] arr, int start, int end,int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start )/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            return binarySearch(arr, mid + 1 , end, target);
        }
        else{
            return binarySearch(arr, start , mid -1 , target);
        }
    }
}
/*
Recurrence relation for binary search :-
        F(N) = O(1) + F(N/2)
        where, O(1) is constant time comparison that we do before calling the function itself
            & F(N/2) is the half of the array.
 */
/*
Types of recurrence relation:-
1) Linear recurrence relation -> fibonacci
2) Divide & conquer -> binary search (search space decreases exponentially)
 */
