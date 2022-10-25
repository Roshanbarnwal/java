package com.dsa1;

public class ReverseOfNum {
    public static void main(String[] args) {
        int num = 9857302;
        while(num > 0){
            int rem = num % 10;
            System.out.print(rem);
            num = num/10;
        }
        System.out.println("");

        int Num = 9830285;
        int revNum = 0;
        while(Num > 0){
            int Rem = Num % 10;
            revNum = revNum * 10 + Rem;
            Num /= 10;
        }
        System.out.println(revNum);
    }
}
