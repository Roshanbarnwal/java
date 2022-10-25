package com.function;
import java.util.Scanner;
public class PrimeQ {
    //determining whether the given number is prime or not
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Give the number: ");
        int n = in.nextInt();
//        boolean ans = isPrime(n);
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
//        int count 0;
        if(n<=1){
            return false;
        }
        int i = 2;
        while(i*i <= n){
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return i*i>n;

    }
}
