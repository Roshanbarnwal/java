package com.oops;

public class InnerClasses2 {
    class Test2{
        String name;
        static String str = "looks like we can access static attributes of non-static class inside static main" +
                " without creating an instance for the non-static class";
        Test2(String name){
            this.name = name;
        }

        static void print(){
            System.out.println("print function inside inner class to be accessed by its object.");
        }
    }

    public static void main(String[] args) {
        System.out.println(Test2.str);
        InnerClasses2 obj = new InnerClasses2();
        InnerClasses2.Test2 b = obj.new Test2("kunal ");//Test2 is non-static so object is needed.
//        InnerClasses2.Test2 b = new InnerClasses2.Test2("kunal ");    //com.oops.InnerClasses2.this' cannot be
                                                                      //referenced from a static context
        Test a = new Test("Rahul"); //InnerClasses1.Test a ;
        InnerClasses.Test c = new InnerClasses.Test("roshan");  //object of InnerClasses is not needed for Test.

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(c.name);
        InnerClasses2.Test2.print();//trying to replicate sout();
        Test2.print();
        b.print();
    }
}
/*
If the innerclasses have the same name as that of other main classes in the package, it doesn't matter.
To use innerclasses of some other class/package, we need to be explicit about it.
 */
