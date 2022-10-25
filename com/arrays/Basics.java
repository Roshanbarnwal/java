package com.arrays;

import org.w3c.dom.ls.LSOutput;

public class Basics {
    public static void main(String[] args) {
        //syntax
        //datatype[] variable_name = new datatype[size];
        //store 5 roll numbers:
        //int[] rnos = new int[5];
        //or directly
        //int[] rnos = {23,43,53,5,6};

//    int[] ros; //declaration of array. ros is getting defined in the stack
        int[] ros = new int[5]; //intitialization: actually here object is being created in the heap.
//declaration happens at compile time while initialization happens at runtime(dynamic memory allocation)
        System.out.println(ros[0]);
        String[] str = new String[5];
        System.out.println(str[4]);
        //for primitive, the default value is 0 while for object, it is null.
    }
}

