package com.oops;

//this is a demo to show initialisation of static variables
 class StaticBlock {
    static int a = 4;
    static int b;
   //static block will be executed only once exactly when class is loaded for the first time.
    //class loading and creation of first object are 2 different things as it appears in this program.
    static{
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args){
        System.out.println(a + " "+b);
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(a + " " + StaticBlock.b);

    }
}
