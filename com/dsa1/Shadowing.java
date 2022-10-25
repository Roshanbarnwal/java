package com.dsa1;

import java.sql.SQLOutput;

public class Shadowing {
    static int x = 90;  //we cannot use object-dependent variable or function inside object-independent method
    public static void main(String args[]){
        System.out.println(x); //90
        int x ; //the class variable at line 5 is shadowed by this. shadowing starts when variable is declared / initialized
//        System.out.println(x); since x is not initialized
        x = 40;
        System.out.println(x);
        fun();
        //shadowing effect does not take place in method variable rather it takes place in class variable.
        int y = 50;
        System.out.println("y is " + y);
//        int y = 55;   variable y is already declared in the scope
        fun1(y);


    }
    static void fun1(int y){
        System.out.println("the value of y in fun1() is " + y);
    }
    static void fun(){
        System.out.println(x);
    }
}
