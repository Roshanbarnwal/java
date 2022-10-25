package com.recursion1;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberOfSteps {
    public static void main(String[] args){
        System.out.println(numberOfSteps(8));
    }

    static int numberOfSteps(int n){
        return helper(n,0); //creating a helper function 'cuz we expect user to give 1 argument only but
    }                           //we need to argument for recursive calls in our program.
    static int helper(int n,int count){
        if(n == 0)
            return count;
        if(n%2 == 0)
            return helper(n/2,++count);
        return helper(n-1,++count);
    }
}
