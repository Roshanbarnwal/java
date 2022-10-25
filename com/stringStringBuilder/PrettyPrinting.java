package com.stringStringBuilder;
//https://stackabuse.com/how-to-format-a-string-in-java-with-examples/
public class PrettyPrinting {
    public static void main(String[] args){
        float a = 12.3472f;
        System.out.printf("Formatted output is %.2f %n",a);
        System.out.printf("Pie is : %.3f %n",Math.PI);
        System.out.printf("I am %s & I'm from %s %n","Roshan" , "Nepal");

    }
}
/*
it appears as if just like C, printf & placeholder also works in java. Internally, java uses java.util.Formatter.
 */
