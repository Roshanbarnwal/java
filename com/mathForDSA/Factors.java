package com.mathForDSA;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args){
        int num = 20;
        factors1(num);
        factors2(num);
        factors3(num);
    }

    static void factors1(int num){          //O(N)
        for(int i=1; i<=num; i++){
            if(num % i == 0)
                System.out.print(i + " ");
        }
        System.out.println("");
    }

    static void factors2(int num){              //O(sqrt(N))
        for(int i=1; i<= Math.sqrt(num); i++){  //2 * 10 = 20. So, 2 & 10 both are factors of 20. So, when we found
            if( num % i == 0){                  // one factor, the other factor is 20 / factor.
                if( i == num / i)       //removing the duplicates like 5 * 5 = 25 for factors of 25.
                    System.out.print(i + " ");
                else
                    System.out.print(i + " "  + num/i + " ");
            }
        }
        System.out.println("");
    }   //But we are not getting sorted numbers in this method

    static void factors3( int num){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                if(i == num / i)
                    System.out.print(i + " ");
                else{
                    System.out.print(i + " ");
                    list.add(num/i);    //list contains factors in descending order
                }
            }
        }
        //printing list in ascending order
        for(int i= list.size() - 1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");

    }
}
