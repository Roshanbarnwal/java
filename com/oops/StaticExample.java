package com.oops;

import java.sql.SQLOutput;

public class StaticExample {
    public static void main(String args[]){
        Human kunal = new Human(22,"Kunal",10000,false);
        Human rahul = new Human(34,"Rahul",15000,true);
        Human arpit = new Human(34,"Arpit",15000,true);

        System.out.println(Human.population);   //System.out.println(kunal.population);
        System.out.println(Human.population);   //System.out.println(rahul.population);
        System.out.println(Human.population);   //System.out.println(arpit.population);
        fun();
        StaticExample obj = new StaticExample();
        obj.fun2();
        obj.fun();
        obj.greeting();
    }

    //this is not dependent on objects
    static void fun(){
//        greeting();//you can't use this because this requires an instance but the function you are using it in does
        //not depend on instances.

//you can't access non-static stuff without referencing their instances in a static context only.
        //hence, here I am referencing it
        StaticExample obj = new StaticExample();
        obj.greeting();
    }

    void fun2(){
        greeting(); //we know fun2() will be called inside main so its object will definitely be created which will also
        //acts as an object for greeting() unlike in fun() where no object is created. So here fun2() protects greeting().
    }
    //we know that something which is not static, belongs to an object
    void greeting(){
//        fun();    //it works because non-static doesn't limit itself.
        System.out.println("hello world");
    }
}

class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;//static acts similar to C where it initializes once but updates as long as program runs.
    //But also static is independent of an instance of a class.So in place of this, we can also use the class name.

    static void message(){
        System.out.println("hello message!");
//        System.out.println(this.age);   //' com.oops.Human.this' cannot be referenced from a static context
    }
    public Human(int age,String name,int salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
//        this.population += 1;      //this works but convention is to use class name.
        Human.population += 1;
    }
}
/*
static variable doesn't come with an object rather it comes with class. When we access it via object, java says it
doesn't come with object ,but it is present in the class. So, java gives it by presuming 'this' as 'class name'.

The benefits of static are that u don't have to create an instance of a class to access a static variable or methods.
The best example is main method. As we know that the first things that runs in our program is main ,and it can't be run
unless an instance of the class in which main is, has been created or rather we make main static so that we don't have
to create the instance.

Non-static method can access both static and non-static data.
static method can only access static data.
It's like if universal set doesn't depend on object, So its subset must not also depend on object.
Static comes 1st and non-static comes 2nd because an instance is required for non-static which takes time to create.

As we know static doesn't deal with objects. So if we're giving anything non-static to it, we must be very explicit
about which instances of the class that we're talking about.
 */
