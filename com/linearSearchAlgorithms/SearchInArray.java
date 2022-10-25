package com.linearSearchAlgorithms;

public class SearchInArray {
    public static void main(String[] args){
        int[] arr = {1,3,4, 5,34,98,100,34};
        System.out.println("Boolean: "+linearSearch1(arr,9));
        System.out.println("Element: "+linearSearch2(arr,9));
        System.out.println("Index: "+ linearSearch3(arr,9));
    }
    //returning boolean confirming if the target is present in the array
    static boolean linearSearch1(int[] arr,int target){
        for(int element: arr){
            if(element == target)
                return true;
        }
        return false;
    }
    //return the target element if found
    static int linearSearch2(int[] arr, int target){
        for(int element : arr){
            if(element == target)
                return element;
        }
        return Integer.MAX_VALUE;//A constant holding the maximum value an int can have, 2^31-1.
    }
    //return the index of the target element if present in the array
    static int linearSearch3(int[] arr, int target){
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == target)
                return index;
        }
        return -1;  //index can't be negative so returning -1.
    }
}
/*
arr.length
here, length is a variable.
str.length()
here, length() is a method which eventually uses length variable.
 */


