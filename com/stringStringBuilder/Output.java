package com.stringStringBuilder;

import java.util.Arrays;

public class Output {
    //'toString()' in 'com.stringStringBuilder.StringMethods' clashes with 'toString()' in 'java.lang.Object';
    // attempting to assign weaker access privileges ('package-private'); was 'public'
    //private,static & final method can't be overridden
    @Override//it will override for objects of Output class.
    public String toString(){
        return "overriding the toString of OBJECT class.";
    }

    public static void main(String[] args){
        System.out.println(56);
        Integer num = new Integer(57);
        System.out.println(num.toString()); //Unnecessary 'toString()' call
        System.out.println(num);
        System.out.println("roshan");
        System.out.println(new int[] {2,3,4,5});//here, object can be of many type ,but it is not explicit what
        //object type this is. So default toString() is called from Object Class.
        System.out.println(Arrays.toString(new int[] {2,3,4,5})); //here it is saying to println() to use toString()
        //method of Arrays Class
//so if the object has its own toString() method , println() will use it otherwise defaults toString().
        String name = null;
        System.out.println(name);
    }
}
/*
System.out.println();
out is the variable of class PrintStream containing the method 'println'. println() prints the string value of
everything passed to it. println() always calls the toString() method of the object passed to it. If that object
doesn't have its own toString() method, default toString() will be called i.e. of Object superclass.

Even when integer is passed to println(), it will convert it into string for which it will call toString() method
of Integer wrapper class.

Basically, println() says you have the integer or string or object values but give me their string values only
then I'm going to print it.

 */
