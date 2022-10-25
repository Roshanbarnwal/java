package com.stringStringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args){
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        //"a" + "b" = "ab" , a new object "ab" is created but of course taken by garbage as they are not stored.
        System.out.println("a" + "b");//operator overloading but not exactly.
//        System.out.println("a" - "b");
        System.out.println('a'+ 3);
        System.out.println((char) ('a' + 3));//typecasting

        System.out.println("a" + 1);
        //this is same as after a few steps: "a" + "1"
        //integer will be converted to Integer that will call toString();

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
        System.out.println(new Integer(56) + "" + new ArrayList<>());//toString() method of both Integer &
        //ArrayList is called.
//        System.out.println(new Integer(56) + new ArrayList<>());
    }
}

/*
'+' operator will only work in 2 conditions. If the operands are primitives.
Secondly, in more than 2 operands including even objects, atleast 1 operand should be string.
So, everything is converted to String implicitly if possible. Plus, println() only prints Strings.

Unlike c++ & python, operator overloading is not allowed in java. Though java itself has given some option like '+'
can be used as adding primitives as well as concatenation. But in c++ & python, we can define '+' to do anything.
 */
