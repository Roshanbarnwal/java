package com.bitWiseOperator;

public class NoOfSetBits {
    public static void main(String[] args){
        int num = 23453;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(noOfSetBits(num));
        System.out.println(noOfSetBits1(num));
    }

    static int noOfSetBits(int n){
        int count = 0;
        while(n > 0){
            count++;
            //rightmost setBit is removing from n while counting it i.e. "10010" becomes "10000"
            //In fact, we are changing the rightmost setBit to '0'.
            n = n - (n & -n);   //if n = a1b then -n = a'1b => (n & -n) removes 'a' part & leaves '1b'
//            n = n ^ (n & -n); //this also works
        }
        return count;
    }

    static int noOfSetBits1(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n & n-1;    //e.g. 8 => 8 & 7 => (8 & 7) & (8 & 7) -1 => so on while n > 0.
        }
        return count;
    }
}
/*
Fun Fact: 2's complement of a number doesn't change the position of the rightmost setBit of the number.

2's complement of N (= a1b) == -N (= a'1b)
After removing the rightmost bit from N, the next setBit becomes the rightmost bit.
 */
