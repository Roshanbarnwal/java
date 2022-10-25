package com.oops4;

//C extends A in same package, A extends B in different package. So indirectly C also extends B.
public class C extends A{
    protected int aC = 898;
    int bC = 121;
    public int cC = 181;
    private int dC = 545;

    public static void main(String[] args){
//        System.out.println(e);    //static means independent of object, it doesn't mean independent of class.
                                //all class features applies to static as well like as private,public,etc. So it
                                //can only be accessed if it is not private.
        C obj1 = new C();
        System.out.println("via instance of C " + obj1.aA + " "+obj1.bA+" "+obj1.cA+" ");
        A obj = new A();
        System.out.println(obj.aA + " "+obj.bA+" "+obj.cA+" ");//can't access obj.dA only as it is private

        //no default,no private. protected of B can only be accessed by its lowest subclass only.
        System.out.println("via instances of subclasses of B: "+obj.cB+" "+obj1.cB+" "+obj1.aB);//no default,no private,no protected of B.
        obj.print();
        System.out.println("via secondary subclass: "+ obj1.print() );
//        obj.print1(); //'print1()' has protected access in 'com.oops04.B'
//it appears as if protected can only be accessed by lowest subclass only and not just any subclass of B as far as given
//class program/main program is running. SEE D.java
        obj1.print1();//protected of B but accessed via C->A->B

        System.out.println(obj1 instanceof A);
//        System.out.println(obj1 instanceof B);    //though C is instance of B but B is still not visible directly.
                                                    //we need to import it.
        System.out.println(obj1 instanceof Object);
    }
}
