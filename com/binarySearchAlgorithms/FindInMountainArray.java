package com.binarySearchAlgorithms;
//https://leetcode.com/problems/find-in-mountain-array/
//if duplicates are present then find with lowest index
//first we will find peak index then apply binary search on first half and if not found then apply on 2nd half.
public class FindInMountainArray {
    public static void main(String[] args){
    int[] arr = {1,2,3,4,5,3,1},arr1 = {0,1,2,4,2,1};
    int target = 3,target1 = 3;
    int ans = findInMountainArray(arr,target);
        int ans1 = findInMountainArray(arr1,target1);
        System.out.println(ans);
        System.out.println(ans1);
    }

    static int findInMountainArray(int[] arr,int target) {
        //searching in the first half
        int s = 0 , e = peakIndex(arr);
        int fTry = orderAgnosticsBinarySearch(arr,target,s,e);
        if(fTry != -1)
            return fTry;
        else{
            s = e + 1;
            e = arr.length - 1;
            int sTry = orderAgnosticsBinarySearch(arr, target,s,e);
            return sTry;
        }
    }

    static int orderAgnosticsBinarySearch(int[] arr, int target,int s, int e){
        boolean isAsc = arr[0] < arr[e];
        while(s <= e){
            int m = s + (e-s)/2;
            if(arr[m] == target)
                return m;
            if(isAsc){
                if(arr[m] < target)
                    s = m + 1;
                else
                    e = m - 1;
            }
            else{
                if(arr[m] > target)
                    s = m + 1;
                else
                    e = m - 1;
            }
        }
        return -1;
    }

    static int peakIndex(int[] arr){
        int s = 0, e = arr.length - 1;
        while(s != e){
            int m = s + (e-s)/2;
            if(arr[m] < arr[m+1])
                s = m + 1;
            else
                e = m;
        }
        return e;//s = e; so either of them can be returned.
    }
}
