package com.stringStringBuilder;

public class Palin {
    public static void main(String[] args){
        String str = "abccba";
        String str1 = "abcdcba";
        String str2 = "roshan";
        String str3 = "";
        String str4 = null;
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));
    }

    static boolean isPalindrome(String str){
        //Cannot invoke "String.length()" if "str" is null so that "str == null" is placed before "str.lenght() = 0".
        if(str == null || str.length() == 0){
            return true;
        }
        int n = str.length();
        str = str.toLowerCase();

        for(int i=0; i<= n/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(n-i-1);   //out of bound if string is empty
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
