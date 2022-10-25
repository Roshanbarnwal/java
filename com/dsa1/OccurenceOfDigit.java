package com.dsa1;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class OccurenceOfDigit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("give number: ");
        long num = in.nextLong();
        System.out.print("which number: ");
        int numb = in.nextInt();
        int count = 0;

        while(num > 0){
            if((num % 10) == numb){
                count ++;
            }
            num = num / 10;
        }

        System.out.println(count);

    }
}
