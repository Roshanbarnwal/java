package com.oops;

public class Constructor {
//    ******int x = 4;
    public static void main(String[] args) {
//        com.oops.Student roshan = new com.oops.Student();
//        Student roshan = new Student();
//        ******System.out.println(this.x);
        Student1 roshan  = new Student1();
        System.out.println(roshan);
        System.out.println(roshan.rno + " " + roshan.name + " " + roshan.marks);
        roshan.rno = 21053314;
        roshan.marks = 84.43f;
        roshan.name = "roshan barnwal";
        System.out.println(roshan.rno + " " + roshan.name + " " + roshan.marks);
        roshan.greeting();

    }
}

class Student1 {
    int rno;
    String name;
    float marks = 90;

    //we need a way to add the values of the above properties object by object
    //we need one word to access every object which is 'this'.
    void greeting(){
        System.out.println("Hello " + name);
        System.out.println("hello this! " + this.name); //internally this is how it works. 'this' is always called.
    }
    Student1() {
//        roshan.rno = 13;  you can't use this as everytime new object will be there.
        this.rno = 13;//this is replaced with roshan when a 'roshan' reference variable for a object is created
        this.name = "roshan barnwal";
        this.marks = 88.5f;
    }
}
/*
 'this' keyword basically means when you are creating an object, constructor will initialize of instance variables
 for each new object with the value specified above. By default, null is for string and 0 for primitives.
 non-static variable 'this' cannot be referenced from a static context so not inside static method like main.
*/
/*
constructer is always called by default when 'new' keyword is used/called. Constructor is a special type of
function/method of a class which is used to give initial value to instance variable. It doesn't have return type.
It shares the same name as class and can take as many parameters as required.

you can't have the same class name in a package or folder...weird. Like Student() class in Basics.java and Constructor.jave
It turns out a class is accessible from Basics.java into Constructor.java within the same package.

constructor don't have the return type because the type of class is itself is the return type or something like that.
 */
