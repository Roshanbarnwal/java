package com.function;
import java.util.Scanner;
public class Armstrong {
    //checking if the given number is armstrong or not
    public static void main(String args[]){
        System.out.print("Give the armstrong number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        Armstrong a = new Armstrong();
//        System.out.println(a.isArmstrong(n));       //this also works if you want to create an object
        System.out.println(isArmstrong(n));
     //printing all 3 digit armstrong numbers
        for(int i=100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum  = 0;
        while(n>0){
            int rem = n%10;
            sum += rem*rem*rem;
            n /= 10;
        }
        return sum == original;

    }
}
