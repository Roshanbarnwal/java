package com.binarySearchAlgorithms;

import java.util.Arrays;
//a lot of corner cases in this code. So earlier one is sufficient for now for me.
public class SearchRange2 {
    public static void main(String[] args){
        int[] nums = {},nums1 = {5,7,7,8,8,10},nums2 = {1};
        int target = 1,target1 = 6,target2 = 0;
        int[] ans = searchRange2(nums,target);
        System.out.println(Arrays.toString(ans));
        int[] ans1 = searchRange2(nums1,target1);
        System.out.println(Arrays.toString(ans1));
        int[] ans2 = searchRange2(nums2,target2);
        System.out.println(Arrays.toString(ans2));

    }

    static int[] searchRange2(int[] nums,int target){
        int s=0,e=nums.length-1,index1=-1,index2 = -1;
        if(nums.length == 0)
            return new int[]{-1,-1};
        boolean flag = true;
        //applying ceiling algo but without = constraint for finding last index of occurence
        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m] == target){
                if(flag){
                    index1 = m;
                    flag = false;
                }
                s = m + 1;
            }
            else if(nums[m] < target)
                s = m + 1;
            else
                e = m - 1;
        }
        if( s!= 0 && nums.length != 0 && nums[s-1] != target)
            return new int[]{-1,-1};

        index2 = s - 1;
        while(index1 >=0 && nums[index1] == target){
            index1 --;
        }
        return new int[]{index1 + 1,index2 };
    }
}
