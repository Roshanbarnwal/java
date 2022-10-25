package com.dsa1;
import java.util.Scanner;
public class While {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Give numbers: ");
        while(in.next().trim().charAt(0) != 'x'){
            System.out.println(in.nextInt());
        }
    }
}
