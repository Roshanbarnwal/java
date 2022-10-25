package com.bitWiseOperator;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args){
        System.out.println(magicNumber(6));
        System.out.println(magicNumber1(6));
    }

    static int magicNumber(int n){
        int ans=0;
        for(int i=0; i<32; i++){
            if(nthBit(n,i+1) == 1){
                ans += Math.pow(5,i+1);
            }
        }

        return ans;
    }
    static int magicNumber1(int n){
        int ans = 0;
        int base = 5;
        while(n > 0){   //this will run for the number of digits present. So, O(logN)
            //getting last bit and multiply with base
            ans += (n & 1) * base;    //'*' has higher precedence than '&'
            base *= 5;//increase base with every iteration as bits are shifting to the right
            n >>= 1;
        }
        return ans;
    }
    static int nthBit(int num,int n){
        if((num & 1<<n-1) == 0)
            return 0;
        else
            return 1;
    }

}
