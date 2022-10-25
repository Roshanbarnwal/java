package com.bitWiseOperator;

public class PowerOf2 {
    public static void main(String[] args){
        int num = 1024; //note: fix for n = 0 as it gives true but it should be false.
        System.out.println((num & num-1) == 0);
        System.out.println((0 & 0-1) == 0);
    }

}
/*
a number is a power of 2 when it contains only one '1'-bit in its binary form.
10000 is a power of 2 but not 10010.
Also, 10000 = 1111 + 1
Also, 10000 & 1111 = 0      => 10000 & (10000 - 1) = 0
So,   number & (number - 1 ) = 0 then the number is power of 2
 */
