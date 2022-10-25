package com.polymorphism;

public class ObjectPrint {      //By default, every other class in java extends Object.java class.
    int num;
    public ObjectPrint(int num){
        this.num = num;
    }


    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5);
        System.out.println(obj);//I haven't told java what to print here explicitly.
    }
}

/*
//System.out.println(obj);//I haven't told java what to print here explicitly. So java will go through the definition
of println() to determine what to print as 'obj'.The procedures are as follows:

Step -> (1) -> PrintStream.java
public void println(Object x) {
        String s = String.valueOf(x);
        ...
    }

Step -> (2) -> Stream.java
public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();     //ternary operator. here it says to invoke toString() of
                                                           //obj but do we have toString() in our class? No.But we know
                                                         //every class is inherited from superclass Object.java. So
                                                       //java will call it just as given below.
    }

Step -> (3) -> Object.java
public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 */
