package com.oops;

public class FinalWrapper {
        int a=11,b=12;
        public static void main(String[] args) {
                int a = 2, b = 3;
                final int C = 4;        //By convention, final variable are in CAPITAL letters
//                C = 5;        //can't assign value to final variable
                Integer num1 = a, num2 = b;
                swap(a, b);
                swap1(num1, num2);

                System.out.println("a is "+a+" & b is "+ b);
                System.out.println("num1 is "+num1 + " & num2 is "+num2);
//when a non-primitive is final, we cannot reassign it.
                final A ref = new A("roshan barnwal");
                System.out.println(ref.name);
                ref.name = "Roshan Barnwal";
                System.out.println(ref.name);
//                ref = new A("new object");    //Cannot assign a value to final variable 'ref'
                //swapping instance variables
                FinalWrapper obj1 = new FinalWrapper();
                System.out.println("Before swap2, the instance variables a= "+obj1.a+" b= "+obj1.b);
                swap2(obj1);
                System.out.println("After swap2, the instance variables a= "+obj1.a+" b= "+obj1.b);

                A obj;
                for (long i = 0; i < 1000000L; i++) {
                        obj = new A("Random object");
                }
        }
/*
even though Integer is an object and num1 and num2 are reference variable, the value are not swapped because Integer
is a final class whose value can't be changed.
Since final variable can't be modified, it needs to be initialized while declaring it simultaneously.
Always initialize while declaring.

final also works for reference variable other than primitives but it is to be noted that reference variable cannot
point to another new object but the object can change its states.

Also, if a method is final, it can't be overridden.***
 */
        static void swap(int a, int b){
                int tmp = a;
                a = b;
                b = tmp;
                System.out.println("inside swap: a is "+a + " & b is "+b);
        }
        static void swap1(Integer a, Integer b) {
                Integer tmp = a;
                a = b;
                b = tmp;
                System.out.println("inside swap1: num1 is "+a + " & num2 is "+b);
        }

        static void swap2(FinalWrapper obj){
                int tmp = obj.a;
                obj.a = obj.b;
                obj.b = tmp;
        }
}

class A{
        final int num = 10;
        String name;

        A(String a){
                this.name = a;
        }

        //this will happen when garbage collection hits. By default something else happens and we don't get to know but when A
        //gets destroyed, the below method executes.
        @Override       //it is overriding some method of Object.java superclass which handles garbage collection.
        protected void finalize() throws Throwable {
                System.out.println("Object is destroyed");
        }
}
