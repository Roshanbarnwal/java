package com.dsa1;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("give me a float: ");
//        float num = input.nextFloat();
//        System.out.print("give me an int: ");
//        int num1 = input.nextInt();
//        System.out.println(num);

        //type casting
//        int num2 = (int)(67.56f);
//        System.out.println(num2);

        //automatic type promotion in expressoins
//        int a = 257;
//        byte b = (byte)(a);//257%256=1

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int  f = (c*d)/e;   //while doing byte operations , java converts all byte data into compatible form which is int in this case.
        System.out.println(f);

//        byte g = 50;
//        g = g*2;          #g*2 is converted into int but it can't be assigned to a byte.

        int number = 'A';
        System.out.println(number);
        System.out.println("hello in chinese: 你好 'ni hao'");

        byte u = 42;
        char v = 'a';
        short w = 1024;
        int x = 50000;
        float y = 5.67f;
        double z = 0.1234;
        double result = (y*u) + (x/v) - (z - w);
        //output is: float + int - double = double
        System.out.println(y*u + " " + x/v + " " + (z-w));
        System.out.println(result);
    }
}
