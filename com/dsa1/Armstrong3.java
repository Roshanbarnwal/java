package com.dsa1;
import java.util.Scanner;
public class Armstrong3 {
    // checking whether the given number is armstrong or not
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Give an armstrong number: ");
        int num =  in.nextInt();

        int num1 = num;
        int newN = 0;
        while(num > 0){
            int rem = num%10;
            newN += rem*rem*rem;
            num /= 10;
        }
        if(num1 == newN){
            System.out.println(num1 + " is an armstrong number");
        }else{
            System.out.println("Sorry! " + num1 + " is not an armstrong number");
        }
    }

}
