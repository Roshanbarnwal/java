package com.dsa1;
import java.util.Scanner;
public class ReverseOfNum2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Give the number: ");
        long num = in.nextLong();

        long revNum = 0;
        while(num > 0){
            long rem = num % 10;
            revNum = rem + revNum * 10;
            num /= 10;
        }
        System.out.println(revNum);
    }
}
