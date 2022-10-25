package com.dsa1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Primitives {
    public static void main(String[] args){
        int rollno = 64;
        char letter = 'r';
        float marks = 98.67f;
        double largeDecimalNumbers = 4567654.4567;
        long largeInteger = 23493750359335830L;
        boolean check = false;
//wrapper primitives for more functionalities e.g. Integer
        Integer rno = 64;
        rno.byteValue();//it stores value of rno upto 8 bits only. excess are overflowed.
        System.out.println( rollno + "" +letter + "" +rno.byteValue());

        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter some input: ");
//        int roll = input.nextInt();
//        System.out.println("Your roll number is " + roll);
//        System.out.println(input.nextLine());
//        System.out.println(input.next());
//        String wood = input.nextLine();
//        System.out.println(wood);
//
//        //creating another scanning class object.
//        Scanner input1 = new Scanner(System.in);
//        System.out.println(input1.next());
//        System.out.println(input1.nextInt());
//        System.out.println(input1.nextLine());

        float mark = input.nextFloat();
        System.out.println(mark);
    }
}
