package com.dsa1;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.println(num + " Hello world");
        }

        int num = 1;
        while(num <= n){
            System.out.println("variable initialized inside loop doesn't have scope outside it.");
            num ++;
        }
        int o;
        do{
            System.out.print("Give me negative int: ");
            o = in.nextInt();
        }while (o>=0);
        System.out.println(o);
    }//end of main
}
