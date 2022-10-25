package com.binarySearchAlgorithms;
//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArray1 {
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

    static int splitArray(int[] nums,int m){
        int min=0,max=0,  size = nums.length;
        for(int i : nums){
            if(min < i)
                min = i;    //largest sum of subArray for m = 1.
            max += i;       //largest sum of subArray for m = nums.length
        }
        System.out.println("min & max " + min + " " + max);
        while(min < max){
            int mid = min + (max-min)/2; int sum = 0; int count = 0, ans = 0;
            for(int i = 0; i < size; i++){
                sum += nums[i];
                if(sum > mid || i == size - 1){
                    count++;
                    if(ans < sum - nums[i]){
                        ans = sum - nums[i];
                    }
                    if(i == size - 1){
                        if(ans < sum)
                            ans = sum;
                    }
                    sum = 0;
                    if(i != size - 1)
                        i--;

                }
            }
            if(count < m){
                max = mid ; //we're checking sum > mid. So, 'mid' can also be the value
            }
            else if(count > m){
                min = mid ;
            }
            else{
                 return ans;
            }
        }
        return max; //max = min = mid
    }
}
