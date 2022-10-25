package com.binarySearchAlgorithms;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args){
        int[] nums = {};
        int target = 1;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] searchRange(int[] nums, int target) {
        int s = 0,e = nums.length - 1;
        int index1 = -1, index2 = -1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(nums[m] == target){
                s = m;
                while(s>=0 && nums[s] == target){
                    index1 = s;
                    s--;
                }
                e = m;
                while(e<= nums.length-1 && nums[e] == target){
                    index2 = e;
                    e++;
                }
                break;
            }
            else if(nums[m] < target){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }

        return new int[] {index1,index2};
    }
}
/*
corner cases: empty array, target not present in the array, singleton array
 */
