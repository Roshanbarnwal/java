package com.sortAlgorithm;
import java.util.ArrayList;
public class Sum3 {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<> ();
        int index = 0;
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        list.add(new ArrayList<Integer>());
                        list.get(index).add(nums[i]);
                        list.get(index).add(nums[j]);
                        list.get(index).add(nums[k]);
                        index++;
                    }
                }
            }
        }

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(!list1.contains(list.get(i))){
                list1.add(list.get(i));
            }
        }

        return list1;
    }
}
