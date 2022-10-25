package com.dsa1;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*
        int a = 0;
        int b = 1;
        System.out.print("which fibonacci no.: ");
        int n = in.nextInt();
        int c = 0;
        for(int i = 0; i<=n; i++){
            if(i == 0){
                c = ;
            }
            else if(i == 1){
                c = b;
            }else{
                c =  + b;
                 = b;
                b = c;
            }//end of else
        }//end of for
        System.out.println(c);

         */
//above for loop is not efficient because we are iterating through all n steps when it is possible only through n-2 steps.
        int p = 0;
        int i = 1;
        int count = 2;
        System.out.print("which fibonacci: ");
        int n = in.nextInt();
        while(count <= n){
            int tmp = i;
            i = p + i;
            p = tmp;
            count ++;
        }
        if(n == 0){
            System.out.println(p);
        }else{
            System.out.println(i);
        }
    }
}
