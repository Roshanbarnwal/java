package com.function;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }
//anything that u want to use in static *method* has to be static.main is static so method should also be static.
//non-static method sum() cannot be referenced from a static context.
     static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
