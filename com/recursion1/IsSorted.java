package com.recursion1;

public class IsSorted {
    public static void main(String[] args){
//        System.out.println(isSorted(new int[]{2,3,8,9,11},0));
//        System.out.println(isSorted(new int[]{0},0));

        System.out.println(isSorted1(new int[]{2,3,1,8,9,11},0));
//        System.out.println(isSorted1(new int[]{0},0));
    }

    static boolean isSorted(int[] arr,int index){
        if(index == arr.length-1)
            return true;
        if(arr[index] > arr[index+1])
            return false;
        return isSorted(arr,++index);
    }
    static boolean isSorted1(int[] arr, int index){
        if(index == arr.length -1)
            return true;
        return arr[index] < arr[index+1] && isSorted1(arr,++index);
        //here, it should not be mistaken that recursion calls lasts till the end even we found that array is
        //not sorted at index 1-2 because as soon as the first operand turns 'false', && operator won't execute
        //its second operator & the recursion stops right there without even reaching its base case in here.
    }
}
