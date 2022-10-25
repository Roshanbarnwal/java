package com.stringStringBuilder;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Roshan Barnwal";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());//it doesn't change the original array but creates a new one.
        System.out.println(name);
        char[] arr = {'r','o','s','h','a','n'}; //char[] array doesn't call toString() method.
        int[] arr1 = {1,2,3,4,5,6};
        System.out.println(arr);
        System.out.println(arr1);
        System.out.println("  stripping  ".strip());

        String name1 = "Roshan Barnwal Hello World";
        //Returns:
        //the array of strings computed by splitting this string around matches of the given regular expression
        System.out.println(name1.split(" "));//it will cut the portion of name1 containing spaces & returns
        System.out.println(Arrays.toString(name1.split(" ")));      //array of String
    }
}
