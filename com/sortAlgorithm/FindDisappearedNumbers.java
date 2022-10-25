package com.sortAlgorithm;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
//        findDisappearedNumbers(arr);
        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i < n){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int tmp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = tmp;
            }else{
                i++;
            }
        }
        i = 0;
        List<Integer> ans = new ArrayList<>();
        while(i<n){
            if(arr[i] != i + 1){
                ans.add(i+1);
            }
            i++;
        }
        return ans;
    }
}
/*
if range = [0,N] => every element will be at index = value
if range = [1,N] => every element will be at index = value - 1
 */
