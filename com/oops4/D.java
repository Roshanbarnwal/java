package com.oops4;

import com.oops04.B;
public class D extends C {

    public static void main(String[] args) {


    A obj = new A();
        System.out.println(obj.aA);//remember: protected is different from default only when outside package
                                    //is to  be accessed/concerned .
    B obj1 = new B();
    C obj2 = new C();
        System.out.println(obj2.aA);
    D obj3 = new D();

    //can't access protected as they are not lowest subclasses of B.    //D->C->A->B
//    System.out.print("via primary instance of B: ");
//    obj.print1();
//        System.out.print("via own instance of B: ");
//    obj1.print1();
//        System.out.print("via secondary instance of B: ");
//    obj2.print1();
        System.out.print("via tertiary instance of B: ");
    obj3.print1();

    }
}

//it appears as if protected can only be accessed by lowest subclass only and not just any subclass of B as far as
//given class program/main program is running.
