package com.oops;

import java.util.Arrays;

class Test{
    static String name;
    int A;
    static int B;
    Test(String name){
        this.name = name;
        this.A += 4;
        B += 4;
//        Test.B += 4;

    }
//each class is a file itself. Only the class containing main() runs. Cursor is choosing which file or class to run.
    public static void main(String[] args) {
        System.out.println("main in both classes");
    }
}
public class InnerClasses1 {

    public static void main(String[] args) {
        System.out.println(Test.name);
        Test a = new Test("kunal");//constructor is called
        System.out.println(a.A + " " + a.B);
        Test b = new Test("Rahul");//constructor is again called. Both time A & B are initialised but B is
                                        //updated 2nd time.
        a.A +=3;
        a.B += 3;
        System.out.println(a.A + " " + a.B);
        a.A += 3;
        a.B += 3;
        System.out.println(a.A + " " + a.B);
        System.out.println(a.name + " " + a.A);
        System.out.println(b.name + " " + a.A);
        System.out.println(Arrays.toString(new int[]{3,4,5}));
    }
}
/*
//I guess the whole program is evaluated first then the final value are executed??
No, I'm wrong. This is true for static context as it is evaluated in compile time while execution happens at runtime.

 System.out.println()
 -> out is a reference variable to an object of class printstream which has method 'println()'.
 -> I guess System is upperclass for printstream.
 */
