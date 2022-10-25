package com.bitWiseOperator;

public class PowerOfNumber {
    public static void main(String[] args){
        System.out.println(power(3,6));
    }

    static int power(int num,int pow){
        int base = num;
        int ans = 1;
        while(pow > 0){         //O(log(pow) to the base 2) instead of O(pow) that we get in simple for loop
            if((pow & 1) == 1)
                ans *= base;
            base *= base;   //unlike in magicNumber, here base is doubling up on each passing of bit.(3->3^2->3^4...)
            pow >>= 1;      //3^6 = 3^(2+4) = 3^2 * 3^4 = 3^4 * 3^2 * 3^0 = 3^(110)_base2
        }
        return ans;
    }
}
