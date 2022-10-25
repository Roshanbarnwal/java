package com.bitWiseOperator;

public class Bits {
    public static void main(String[] args){
        int num = 19;
        System.out.println(nthBit(num,4));  //num = 19
        num = setBit(num,4);
        System.out.println(nthBit(num,4) + " " + num);  //num = 27
        num = resetBit(num,4);
        System.out.println(nthBit(num,4) + " " + num);
        System.out.println(~10);
    }

    static int nthBit(int num,int n){
        //to find nth bit, we operate it with 1 through & as it will give the same bit. Also, we need to make all
        //other bits of the number 0 for which we create a number called 'mask' which contains only nth bit as 1.
        int mask = 1 << n-1;
        if((num & mask) == 0 ){
            return 0;
        }else {
            return 1;
        }
    }

    static int setBit(int num, int n){
        //set nth bit means if nth bit is 0 then convert it into 1. We operate the nth bit with 1 through | operator
        //also any bit | 0 gives the same bit
        int mask = 1 << n-1;
        return num | mask;
    }

    static int resetBit(int num, int n){
        //reset nth bit means make nth bit 0 if it is not 0. we can do: nth bit & 0 to set nth bit to 0. for that, we
        //need a mask number containing all bit 1 except nth bit. So we will find the compliment of number containing
        //all bit 0 except nth bit.
        int mask = ~(1 << n-1);
        return num & mask;
    }
}
