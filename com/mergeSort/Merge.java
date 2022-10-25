package com.mergeSort;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args){
        int[] arr = {7,6,5,4,3,2,1};
        int[] arr1 = {9,5,2,7,8,10,122,13,53,10,3,1,88,10};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(mergeSort(arr1)));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    static int[] merge(int[] left, int[] right) {
        int l=0,r=0;
        int[] arr = new int[left.length + right.length];
        int i=0;
        while(l < left.length && r < right.length){
            if(left[l] < right[r]){
                arr[i] = left[l];
                l++;
            }else{
                arr[i] = right[r];
                r++;
            }
            i++;
        }
//        for( ; i<arr.length; i++){
//            if(i < left.length)
//                arr[i] = left[i];     //it can go out of bound as i = elements from both left[] & right[]
//            else                      //but l < i || r < i.
//                arr[i] = right[i];
//        }

        while(l < left.length){
            arr[i] = left[l];
            i++;
            l++;
        }
        while(r < right.length){
            arr[i] = right[r];
            i++;
            r++;
        }
        return arr;
    }

    static int[] merge1(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
/*
1. Divide array into 2 parts
2. Get both parts sorted via recursion.
3. merge the sorted parts

 */
