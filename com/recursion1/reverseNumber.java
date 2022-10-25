package com.recursion1;

public class reverseNumber {
    public static void main(String[] args){
        reverse(12345);
        System.out.println(sum);
        System.out.println(reverse2(12345));
        System.out.println(palindrome(1234321));
    }
        static int sum = 0;
    static void reverse(int n){
        if(n == 0)
            return ;
        int rem = n %10;
        sum = sum*10 + rem;
        reverse(n/10);
    }

    static int reverse2(int n){
        if(n == 0)
            return 0;
        int digits = (int)Math.log10(n);
        return n%10 * (int)Math.pow(10,digits) + reverse2(n/10);
    }

    static boolean palindrome(int n){
        return n == reverse2(n);
    }
}
