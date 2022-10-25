package com.dsa1;

public class FunctOverloading {
    //creating multiple function with same name and return type but either with different number of arguments or with different types of arguments
    public static void main(String  args[]){
        arg1(4374);
        arg1("roshan");
        arg1(2 ,3, 5);
        System.out.println(arg1(2,3,4,5));
        System.out.println(arg1(2,3,4,"kunal"));//void type function is not allowed in println**
    }
    //function overloading means having many function with same name and return type. They are differentiated at compile time on the basis of arguments.
    static void arg1(int a){
        System.out.println(a);
    }
    static void arg1(String a){
        System.out.println(a + " for argument type string.");
    }
    static void arg1(int a, int b ,int c){
        System.out.println(a+b+c);
    }

    //In function overloading return type can be  same or different but compilier differentiate two functions with same name on the basis of arguments mostly.
    static int arg1(int a, int b ,int c ,String t){
        return a + b+ c;
    }
    static int arg1(int a, int b, int c, int d){
        return a+ b+ c+ d;
    }
}
