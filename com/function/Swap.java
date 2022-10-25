package com.function;
import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap numbers code
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(a + " " + b);

        int x = 3;
        int y = 4;
        swaps(x,y);
        System.out.println(x + " " + y);

        String name = "Roshan";
        changeName(name);//a copy of reference variable is passed which will point to a new object created.
        System.out.println(name);

        int[] arr = {1,2,3,4,5};
        changeArr(arr);         //a copy of reference variable is passed but this function won't create any object. It is an array of primitives.
//        System.out.println(arr);      //you can't just put array variable to print all its content.
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
    }// end of main

    static void changeArr(int[] arr) {
        arr[0] = 99;
    }

    static void changeName(String xyz) {
        System.out.println(xyz + " is inside.");
        xyz = "kunal";//not changing the object rather creating a new object.
        System.out.println(xyz + " is inside.");
    }

    static void swaps(int x, int y){
        int tmp = x;
        x = y;
        y = tmp;
    }
}
