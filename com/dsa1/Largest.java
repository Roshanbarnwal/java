package com.dsa1;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        System.out.print("Give 3 numbers: ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if(b>max){
//            max = b;
//        }else if(c>max){
//            max = c;
//        }
        //another method
//        int max = 0;
//        if(a>b){
//            max = a;
//        }else{
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
