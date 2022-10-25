package com.binarySearchAlgorithms;

public class InfiniteArray {
    public static void main(String[] args){
        int[] arr = {1,3,5,6,7,8,9,10,11,23,35,36,38,42,53,69,70,71};
        int target = 7;     //a lot of corner cases are there for last set of numbers in the array
        int ans = range(arr,target);
//        System.out.println(chunk(arr,target)[1]);
        System.out.println(ans);
    }
    //finding the chunks of memory
    static int range(int[] arr, int target){
        int start = 0, end = 1;
        while(arr[end] < target){
            int tmp = end + 1;
//           end *= 2;     //it is not exactly log(N)
            //new formula
            //end = previous end + 2 * size of box
            end = end + 2 * (end - start + 1);
            start = tmp;
        }
        return binarySearch(arr,target,start,end);
    }
    //binary search
    static int binarySearch(int[] arr, int target,int s,int e){
        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m] == target){
                return m;
            }
            else if(arr[m] < target)
                s = m + 1;
            else
                e = m - 1;
        }
        return -1;
    }
}
/*
infinite array means we don't know the size of array. We can't use the arr.length for finding the length of the array.
So we need to take chunks of space in array to search if the target is present or not. We can increase the value of
start and end exponentially. Then after we have found the chunk where our target is present, we can apply binary search.

 */
