package com.binarySearchAlgorithms;

import java.util.Arrays;
/*
remember one thing for binary search :-> even when the target is found, there is a very good possibility that the
loop is still running because the loop break condition is "start <= end".So 'start' and 'end' will either end up
being just after and before the target value. U just need to know how to manipulate the searching spaces.
 */
public class SearchRange3 {
    public static void main(String[] args){
        int[] nums = {},nums1 = {5,7,7,8,8,10},nums2 = {1};
        int target = 1,target1 = 6,target2 = 0;
        int[] ans = searchRange3(nums,target);
        System.out.println(Arrays.toString(ans));
        int[] ans1 = searchRange3(nums1,target1);
        System.out.println(Arrays.toString(ans1));
        int[] ans2 = searchRange3(nums2,target2);
        System.out.println(Arrays.toString(ans2));
    }

    static int[] searchRange3(int[] nums, int target){
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    /*
    the whole point of two pointer method i.e. taking start and end for BS is that we go on decreasing the space to be
    searched. Now when we find the 1st occurence of target, there might be other occurances. Now for the first index
    , we bring value of 'end' to the left of 'mid' value. Now at this new space between start and end, we need to find
    if there is any more target or not.
     */
    static int search(int[] nums,int target, boolean StartIndex){
        int start = 0, end = nums. length - 1 , ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                //assuming start is still <= end and also there are other occurences of target besides this
                if(StartIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return ans;
    }
}
