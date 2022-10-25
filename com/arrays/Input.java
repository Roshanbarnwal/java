package com.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 53;
        arr[1] = 5353;
        arr[2] = 534;
        arr[3] = 9898;
        arr[4] = 875;
        //[53,5353,534,9898,875]
        System.out.println(arr[3]);

        //input using for loops
        System.out.println("Give "+arr.length+" numbers: ");
        for(int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
/*
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i] + " ");
        }*/
    //enhanced for loop
        for(int num : arr){ //for every element in array, print the element
            System.out.print(num + " ");// here num represents element of the array
        }
//        System.out.println(arr[5]);//index out of bound

        //array of objects
        String[] str = new String[4];
        System.out.println("Give "+ str.length + " strings: ");
        for(int i = 0; i<str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
        //modify
        str[2] = "qwerty";
        for(String r : str){
            System.out.print(r + " ");
        }
        System.out.println("");
    }
}
