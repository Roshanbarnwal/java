package com.function;
import java.util.Scanner;
public class Shadowing {
    static int x = 90;// this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //90
        int x = 40;
        System.out.println(x); //40
        fun();
    }//end of main

    static void fun(){
        System.out.println(x);
    }
}//end of class Shadowing
