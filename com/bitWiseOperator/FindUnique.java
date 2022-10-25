package com.bitWiseOperator;

public class FindUnique {
    public static void main(String[] args){
        int[] arr = {2,4,3,5,2,3,4};
        System.out.println(unique(arr));
    }

    static int unique(int[] arr){
        int unique = 0;
        for(int i: arr){
            unique ^= i;
        }
        return unique;
    }
}
