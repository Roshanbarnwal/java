package com.bitWiseOperator;

public class NoOfDigits {
    public static void main(String[] args){
        int num = 345674;
        int base = 10;
        int digits = (int)(Math.log(num) / Math.log(base)) + 1;
        System.out.println(digits);
        System.out.println((int)(Math.log(num) / Math.log(2)) + 1);

        System.out.println(sumRowPascal(5));
    }

    static int sumRowPascal(int n){ //row starts from 1
        return 1 << n-1;    //2^(n-1) == 1 << n-1;

    }
}

/*
For pascal triangle,
            sum of nth row = nC0 + nC1 + nC2 ... + nCn = 2^n when row starts from 0
 */
/*
log(a) to the base 'b' = log(a) / log(b)

log(N) to the base 'b' = x (say)
So, (int)(x) + 1 gives the number of digits present in 'N' with base 'b'.
So, whenever we right shift a number in a loop until n>0, the time complexity of the loop will be O(log(n)).
 */
