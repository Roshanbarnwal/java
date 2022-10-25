package com.sortAlgorithm;
//https://leetcode.com/problems/find-the-duplicate-number/
class FindDuplicate {
    public static void main(String[] args){
        int[] arr1 = {1,3,4,2,2};
        int[] arr2 = {3,1,3,4,2};
        System.out.println("From findDuplicate()");
        System.out.println(findDuplicate(arr1));
        System.out.println(findDuplicate(arr2));

        System.out.println("From findDuplicate1()");
        System.out.println(findDuplicate1(arr1));
        System.out.println(findDuplicate1(arr2));
    }
    static int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int tmp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = tmp;
            }else{
                i++;
            }
        }

        return nums[n-1];
    }

    static int findDuplicate1(int[] arr){
        int i = 0;
        while(i< arr.length){
            if(arr[i] != i+1){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    int tmp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = tmp;
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        //if there is no duplicate
        return -1;
    }
}