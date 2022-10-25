package com.bitWiseOperator;

public class RangeXOR {
    public static void main(String[] args){
        //finding xor from a to b
        int a = 3,b=9;
        int ans = xor(a-1) ^ xor(b);
        System.out.println(ans);
        //this is only for check, will give time limit exceed for large number
        int ans1=0;
        for(int i=a; i <= b; i++){
            ans1 = ans1 ^ i;
        }
        System.out.println(ans1);
    }

    //this will give XOR of 'a' from 0 to a
    static int xor(int a){
        if(a % 4 == 0)
            return a;
        if(a % 4 == 1)
            return 1;
        if(a % 4 == 2)
            return a+1;
        else            //~= if(a % 4 == 3)
            return 0;
    }
}
