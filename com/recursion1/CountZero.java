package com.recursion1;

public class CountZero {
    public static void main(String[] args){
        System.out.println(count0(2050103300,0));
        System.out.println(count0(0,0));
    }

    static int count0(int n,int count){
        if(n%10 == n){
            if(n == 0)
                return count+1; //we are returning a different value then in the base function call than in
            return count;       //other recursive calls. Now, this same value will be returned in every calls.
        }
        if(n%10 == 0)
            return count0(n/10,++count);
        else
            return count0(n/10,count);
    }
}
