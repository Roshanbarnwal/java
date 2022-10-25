package com.dsa1;
import  java.util.Arrays;

public class VarArgs {
    public static void main(String args[]){
        display(2,3,54,6,3,6);//giving variable length of arguments i.e. the length of arguments is not fixed.
        display1(2,3,"kunal","roshan","dhiraj");
        display(); //it will print an empty array list
    }
    //creating function which takes two integer and an array of strings. variable  arguments should be kept at last in the last otherwise computer won't know where to start the next argument
    static void display1(int a, int b, String ...r){
        System.out.println(a + " " + b + " " + Arrays.toString(r));
    }

    //creating function which takes an array of integers as its arguments and printing them in the form of array
    static void display(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
