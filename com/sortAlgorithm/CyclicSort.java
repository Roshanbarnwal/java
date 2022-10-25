package com.sortAlgorithm;
import java.util.Arrays;
/*
What does cyclic sort does?
=> Firstly, If a number inside an array is in the range = [0,arr.length-1] || [1,arr.length] then it will place the
number in its right index inside the array.
Of course, if the arr[i] is in the range [0,arr.length-1] || [1,arr.length] then cyclic sort can also sort the array.
*/
public class CyclicSort {
    public static void main(String[] args){
        int[] arr = {7,6,5,4,3,2,1};
        int[] arr1 = {9,5,2,7,8,10,122,13,53,10,3,1,88,10};
        System.out.println("Before: " + Arrays.toString(arr));
        cyclic(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            int tmp = arr[i];
            arr[i] = arr[tmp - 1];
            arr[tmp - 1] = tmp;
        }
    }

    static void cyclic1(int[] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            while( i != arr[i]-1 ){
                int tmp = arr[i];
                arr[i] = arr[tmp - 1];
                arr[tmp - 1]  = tmp;
            }
        }
    }

    static void cyclic2(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] !=  arr[correct]){    //checking if swap is needed
                //swapping
                int tmp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = tmp;
            }
            else{
                i++;    //increment the value of i only if arr[i] == i+1 || 0 < arr[i] > arr.length
            }
        }
    }
}
/*
cyclic sort works & should be used whenever numbers are from 1-N consecutive range & each one should be present.
e.g. 7,3,5,2,1,4,6
Here, all numbers from 1 - 7 are present. In this case, we already know the index of each element & we just need to
put them in their respective index.
index of element = value of element - 1;

worst case: (N-1) swaps + N comparisons = O(N)
 */
