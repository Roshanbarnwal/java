package com.oops;

public class Singleton1 {
    String s;
    private Singleton1(String s){
        this.s = s;
    }

    private static Singleton1 instance;
    public static Singleton1 getInstance(){
        //check whether 1 obj only is created or not
        if(instance == null){
//            instance = new Singleton();  //a constructor can decide if the class is private or not.
            instance = new Singleton1("roshan");
        }
        return instance;
    }
//main should be outside the class for private aspect of constructor to be valid.
    public static void main(String[] args){
        Singleton1 obj1 = new Singleton1("private constructor doesn't work if we have 'main' inside class itself");
        System.out.println(obj1.s);
        Singleton1 obj4 = new Singleton1("Because private means outside class, it can't be accessed.");
        System.out.println(obj4.s);
        Singleton1 obj = Singleton1.getInstance();
        System.out.println(obj.s);
        Singleton1 obj2 = Singleton1.getInstance();
        System.out.println(obj2.s);
        Singleton1 obj3 = Singleton1.getInstance();
        System.out.println(obj3.s);
//all 3 ref variables are pointing to just one object
    }
}
/*
getInstance need to be static because we are going to use it for creating first object i.e. we will use it without
reference to any object.
 */
/*
private static Singleton1 instance;
'instance' is static for 2 reasons:-
1) To not allow for more objects to be created, instance doesn't need to be null forever. I mean, every time
getInstance() will be called to create an object but we need 'instance' to be = to null only for once and that's
possible if we keep it static and every other time it is called, it will have updated value other than null.
When we create an object, each object will have its own instance variables with initial values.

2) Secondly, we can't use non-static inside static function getInstance().
 */
/*
we need to make constructor private for no one to be allowed to create a unique object. Whenever we create an
object, constructor is being called, but not when it is private. It means we need to find another way  to create a
object for which getInstance() has been added.
 */

