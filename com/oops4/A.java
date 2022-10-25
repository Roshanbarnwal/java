package com.oops4;

import com.oops04.B;

public class A extends B {
    private static int e = 23;
    protected int aA = 9;
    int bA = 2;
    public int cA = 8;
    private int dA = 4;

    public static void main(String[] args){
        System.out.println(f);//static public & protected can be accessed
        System.out.println(e);
        B obj = new B();
        System.out.println(obj.cB ); //u can only access public member of B. What about protected? Well, u can access
                                        //it but only via instance of A which is inheriting B and not by B itself.
                                    //Also, if protected member is static, it can be accessed.
        A obj1 = new A();   //instance of subclass of B
        System.out.println(obj1.aB + " " + obj1.cB);//only protected and public of B
        obj1.print();
    }
}
/*
remember this about subclass. java will always check first if the given member is present in the subclass or not.
only when it is not present in the subclass, it will check in parent class. Accordingly, it will give the value.
 */
