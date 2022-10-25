package com.recursion;

public class Nto1 {
    public static void main(String[] args){
        numBoth(5);
    }
    static void numBoth(int n){
        if(n == 0)
            return ;
        System.out.print(n+ " ");
        numBoth(n-1);
        System.out.print(n+ " ");
        System.out.println();

    }
}
