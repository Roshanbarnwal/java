package com.dsa1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(in.next());
        System.out.println(ch);

        String str = in.next();
        System.out.println(str.charAt(2));
        System.out.println(str);            //in.next() is only taking a single word.

        //For input a line
        in.nextLine(); //For using to get the input string that was skipped of the Scanner object.
        // (Use it when scan a string after scanning different type of  variables.) kind of flushing the buffer.
        System.out.println(in.nextLine().charAt(10));
    }
}
