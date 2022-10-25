package com.recursion1;

public class RotatedBS {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,1,1,1,2,4,4};
        int target = 4;
        System.out.println(rotatedBS(arr,target,0,arr.length-1));
        System.out.println(rotatedBS1(arr,target,0,arr.length-1));
    }
    static int rotatedBS(int[] arr,int target,int s,int e){
        int m = s + (e-s)/2;
        if(s > e)
            return -1;
        if(arr[s] < arr[m]){    //checking if s-m is 1st part of rotated array or not
            if(target >= arr[s] && target <= arr[m]){   //checking if target is present in the 1st part
                return rotatedBS(arr,target,s,m);
            }else{
                return rotatedBS(arr,target,m+1,e);
            }
        }
        //if above doesn't hold true, then our search space is in 2nd part
        if(arr[m] > target){
            return rotatedBS(arr,target,s,m-1);
        }else if(arr[m] < target){
            return rotatedBS(arr,target,m+1,e);
        }else
            return m;

    }

    static int rotatedBS1(int[] arr,int target,int s,int e){
        int m = s + (e-s)/2;
        if(s > e)
            return -1;
        if(arr[m] == target){
            return m;
        }
        if(arr[s] < arr[m]){    //checking if s-m is 1st part of rotated array or not
            if(target >= arr[s] && target <= arr[m]){   //checking if target is present in the 1st part
                return rotatedBS1(arr,target,s,m);
            }else{
                return rotatedBS1(arr,target,m+1,e);
            }
        }
        //if above doesn't hold true, then our search space is in 2nd part
        if(target >= arr[m] && target <= arr[e]){ //can't take = otherwise it will go in infinite recursive calls
                                    //if == case were not used.But as it is taken above,it shouldn't have mattered.
                    //But it is giving target from 2nd part in duplicates.
            return rotatedBS1(arr,target,m,e);  //moreover above case will handle = for us.
        }else{
            return rotatedBS1(arr,target,s,m-1);
        }

    }
}
