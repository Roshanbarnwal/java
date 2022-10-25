package com.linearSearchAlgorithms;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args){
        String name = "Roshan";
        char target = 'o';
    //converting String to character array and printing
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name,target));

    }

    static boolean search(String str, char target){
        if(str.length() == 0)
            return false;

        int length = str.length();
//        for(int i=0; i<length; i++){
//            if(target == str.charAt(i))
//                return true;
//        }

        //foreach not applicable to type 'java.lang.String'. So we need to convert String to character array
        for(char ch : str.toCharArray()){
            if(ch == target)
                return true;
        }
        return false;
    }
}
/*
str.length():
step-1 -> String.java
        public int length() {
        return value.length >> coder();
    }
 */
