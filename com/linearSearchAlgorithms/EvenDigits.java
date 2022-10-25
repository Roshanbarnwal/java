package com.linearSearchAlgorithms;

//given an array nums of integers, return how many of them contain an even number of digits.
public class EvenDigits {
    public static void main(String[] args) {
    int[] arr = {12,345,2,6,7896};
        System.out.println("There are "+ noOfEvenDigits(arr) + " numbers in the array with even number of digits.");
        System.out.println("no of digits in 123456 is "+ countDigits2(123456));
        System.out.println("no of digits in 123456 is " + countDigits3(123456));
    }

    static int countDigits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }

    static int countDigits2(int num){
        if(num < 0){
            num *= -1;
        }
//it is very fast and efficient but we will learn in number system about this.
        return (int) (Math.log10(num)) + 1;
    }

    //converting integer into strings and taking its length.
    static int countDigits3(int num){
        Integer no = num;
        return no.toString().length();
    }
    static int noOfEvenDigits(int[] arr){
        int count = 0;
        for(int num : arr){
            if(countDigits(num) % 2 == 0)
                count++;
        }
        return count;
    }
}
