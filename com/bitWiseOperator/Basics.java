package com.bitWiseOperator;

public class Basics {
    public static void main(String[] args){
        int num = 10;
        num = num ^ 1;
        System.out.println(num);
    }
}
/*
in bitwise operators, associativity doesn't matters often.
 */
/*
& => if any statement is false, result is false.
    observation: any number & 1 gives the last bit of the number.
                 any bit & 1 gives the same bit.

| => if any statement is true, result is true.

XOR (^) => If and only if one statement is true, result is true otherwise false.
    e.g. 1 ^ 1 = 0; 1 ^ 0 = 1; 0 ^ 0 = 0; 0 ^ 1 = 1;
    observation: any number ^ 1 gives complement of the number. e.g. a ^ 1 = a'
                 any number ^ 0 gives same number.              e.g. a ^ 0 = a
                 any number ^ same number gives 0.              e.g. a ^ a = 0

complement (~) => if a = 000,101,10 , then ~a = 111,010,01 => always performs on total bits of the system whether
                it is 8-bits or 32-bits

left shift operator (<<) => It shifts the bits to the left by given value and filled the new vacant space with
zero. If there is no space in the left to be shifted as if the number is occupying even the last bit of the space
in the machine, then the last bits will be truncated.
    observation: 1010 << 1 = 10100 => 10 << 1 = 20
          Hence, a << b = a * 2^b

Right shift operator (>>) => it shifts the bits to the right i.e. it truncates the bits on the right
    observation: 1010 >> 1 = 101 => 10 >> 1 = 5
            Hence, a >> b = a / 2^b
 */
/*
we get negative of a number when we subtract it from 0. Now say we have 8 bits of a number and we subtract
it from 0, it doesn't matter as nothing changes. But when we place '1' to the left of the MSB of 0 in a 8-bit
system, computer will ignore it but we can write it like this:
                e.g. 16 = 10000 = 111 + 1
Similarly, 1,000,000,00 = 111,111,11 + 1
So, 0 - 10010110 = (111,111,11 + 1) - 10010110 = (111,111,11 - 10010110) + 1 = 2's complement of the number

Range for signed n-bits => 2^(n-1) to 2^(n-1)-1
 */
