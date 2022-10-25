package com.mathForDSA;

public class GCD_LCM {
    public static void main(String[] args){
        System.out.println(gcd(4 ,8));
        System.out.println(lcm(4,8));
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd( b%a, a);
    }

    static int lcm (int a, int b){
        return a * b / gcd(a,b);
    }
}
/*
Euclid's Algorithm => HCF(a,b) = HCF (b%a,a)
Also, The HCF of 0 and 6 is max the number that divides both 0 and 6 exactly without leaving any remainder which is 6.
The HCF of 1 & 6 is 1 as it divides both number exactly.
0 has infinite factors.
HCF(a,b) is the multiplication of all the common factors of a & b
e.g. HCF(6,18) :- factors of 6 are: 1,2,3
                 factors of 18 are: 1,2,3,3
     Hence, HCF(6,18) = 1*2*3 = 6 which is the highest common factor possible between a & b
 */
/*
LCM(a,b) is the lowest common multiple which can be divided by both a & b. NOw, (a*b) will definitely be divided
by both a & b but it may be the highest common multiple (HCM). Now to convert HCM -> LCM, we need to remove the
duplicates of common factors of a & b present in (a*b) and make sure only single copy of common factors are present
in (a*b).

e.g. LCM(6,18) :- factors of 6 are: 1,2,3
                 factors of 18 are: 1,2,3,3
                 HCM(6,18) = (1*2*3) * (1*2*3*3) contains duplicates of 3 common factors i.e. 1,2,3
                 Hence, remove 1 copies of 1,2,3
     Hence, LCM(6,18) = 6 * 18 / HCF(6,18)
 */
