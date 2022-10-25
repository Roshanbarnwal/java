package com.binarySearchAlgorithms;
//https://leetcode.com/problems/split-array-largest-sum/
//this is the correct done by Kunal Kushwaha.
public class SplitArray2 {
    public static void main(String[] args){
        int[] nums = {7,2,5,10,8};  //For m = 1 :- [7,2,5,10,8]    => Ans: 7+2+5+10+8 = 32
        //For m = nums.length :- [7],[2],[5],[10],[8]   => Ans: 10
        //so the answer must be in btw 10 & 32. Here, values btw 10 & 32 are sorted. SO binary search.
        int m = 2;//number of non-empty continuous sub-arrays
        int ans = splitArray(nums,m);
        System.out.println(ans);

        int[] arr = {1,4,4};
        System.out.println(splitArray(arr,3)); //Ans: 4

        int[] arr1 = {2,3,1,2,4,3};
        System.out.println(splitArray(arr1,5));//Ans: 4

        int[] arr2 = {10,5,13,4,8,4,5,11,14,9,16,10,20,8};
        System.out.println(splitArray(arr2,8));//Ans: 25
    }

    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        //binary Search
        while(start < end){
            //try for the middle as potential ans
            int mid = start + (end - start)/2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    //you cannot add this in this  subarray, make new one
                    //say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }

        return end; //here start == end
    }
}
