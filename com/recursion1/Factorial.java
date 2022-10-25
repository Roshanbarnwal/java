package com.recursion1;

public class Factorial {
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println(ans);
        System.out.println(sumDigits(12345));
        fun(5);
    }
    static int factorial(int n){
        if(n == 1)
            return 1;
        return n * factorial(n-1);
    }
    static int sumDigits(int n){
        //n/10 == 0 or n%10 == n
        if(n/10 == 0)   //1 step is decreased so that we can make only 1 change for finding the product of digits
            return n;
        return n%10 + sumDigits(n/10);
    }
    static void fun(int n){
        if(n == 1) {
            System.out.println();
            return; //do remember to return which I forgot at first
        }
        System.out.println(n);
        fun(--n);   //fun(n--) will only print 5 & it will be infinite recursive call: n-- vs --n
    }
}
