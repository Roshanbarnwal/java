package com.dsa1;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Take input from user till user does not press X or x
        float ans = 0;
        while(true){
            //take the operator as input
            System.out.print("Give me the operator: ");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '/' || op == '*' || op == '%'){
                //input two numbers
                System.out.print("Enter the two numbers: ");
                float num1 = in.nextFloat();
                float num2 = in.nextFloat();

                if(op == '+'){
                    ans = num1 + num2;
                }

                if(op == '-'){
                    ans = num1 - num2;
                }

                if(op == '*'){
                    ans = num1 * num2;
                }

                if(op == '/'){
                    if(num2 != 0){
                        ans = num1/num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid operation!!");
                continue;
            }
            System.out.println(ans);
        }

    }
}
