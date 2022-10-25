package com.recursion;

public class FiboFormula {
    public static void main(String[] args){
        for(int i=0; i<11; i++){
            System.out.print(fiboFormula(i));
            System.out.println("  " + fibo(i));
        }
        System.out.println("50th fibo: " + fiboFormula(50) + "  " + fibo(50));    //Ans: 12586269025
    }

    static int fiboFormula(int n){
        //just for demo, use long instead
        double gRatio = (1 + Math.sqrt(5)) / 2;
        double a = (1- Math.sqrt(5)) / 2;
        return (int) (1/Math.sqrt(5) * ( Math.pow(gRatio,n) - Math.pow(a,n)));
        //we can't remove the less dominating term as we are not  calculating the time complexity here but
        //the actual nth fibo number and we need total formula.
//        return (int) (1/Math.sqrt(5) * Math.pow(gRatio, n));  //less dominating term is removed.
    }

    static int fibo(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        return fibo(n-1) + fibo(n-2);
    }
}
