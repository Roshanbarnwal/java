package com.dsa1;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give me fruit name: ");
        String fruit = in.next();
/*
'==' compares reference if two arguments are pointing to the same objects.
'equals method checks the value that the given references are pointing to.
 */
        System.out.println(fruit.substring(0,1).toUpperCase());
        System.out.println(fruit.substring(0).toUpperCase());
        System.out.println(fruit.substring(0,1).toUpperCase() + fruit.substring(1).toLowerCase());

        switch (fruit.toLowerCase()) {
            case "mango":   //this statement is equivalent to: if(fruit.equals("Mango"){}
                System.out.println("king of fruits.");
                break;
            case "apple":
                System.out.println("A sweet red fruit.");
                break;
            case "orange":
                System.out.println("Round fruit.");
                break;
            case "grapes":
                System.out.println("Small fruit.");
                break;
            default:
                System.out.println("Invalid fruit name!");
        }//end of switch(fruit)
    /*
    New syntax of switch statements in java removes break statement and use '->' sign.
     */
        System.out.print("Give me fruit name: ");
        String fruits = in.next();
        switch (fruits.substring(0,1).toUpperCase() + fruits.substring(1).toLowerCase()) {
            case "Mango" -> System.out.println("king of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            default -> System.out.println("please enter a valid fruit");
        }//end of switch(fruits)

        System.out.print("Give me day name: ");
        String days = in.next();
        switch(days.substring(0,1).toUpperCase()+days.substring(1)){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:                                        //dafault statement is at last so we have not used break otherwise it is also used for default.
                System.out.println("Invalid day name!");
        }//end of switch(days)
        /*
        switch(days) is new switch sysntax format of java
         */
        System.out.print("Give me number of day: ");
        int day = in.nextInt();
        switch(day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid number for representing a day!");
        }
    }
}
