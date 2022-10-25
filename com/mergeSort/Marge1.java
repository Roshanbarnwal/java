package com.mergeSort;

import java.util.Arrays;

public class Marge1 {
    public static void main(String[] args){
        int[] arr = {7,6,5,4,3,2,1};    //{4,5,6,7,1,2,3}
        int[] arr1 = {9,5,2,7,8,10,122,13,53,10,3,1,88,10};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        mergeSort(arr1,0,arr.length-1);
        System.out.println(Arrays.toString(arr1));
    }

    static void mergeSort(int[] arr,int s,int e){
        if(s == e)
             return;
        int m = s+ (e-s)/2;
        mergeSort(arr,s,m);
        mergeSort(arr,m+1,e);
        merge(arr,s,m,e);
    }
    static void merge(int[] arr,int s,int m,int e){
        int i=s,j=m+1;
        while(i <=m && j <= e){
            if(arr[i] > arr[j]){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }else{
                i++;
            }
            if(i>m){
                i=s;
                j++;
            }
        }
    }
    static void merge1(int[] arr,int s, int m, int e){
        int i=s,j = e;
        int mix[] = new int[e-s+1];
        while(i<=m && j <=e){

        }
    }
}
