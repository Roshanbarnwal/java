package com.bitWiseOperator;

public class EvenOdd {
    public static void main(String[] args){
        System.out.println(isOdd(5));
        System.out.println(isOdd(4));
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
