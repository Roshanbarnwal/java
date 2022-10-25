package com.polymorphism;

public class Shapes {
    static int a = 10;
    private void print1(){
        System.out.println("Trying to override private methods in the same class.");
    }
    private void print1(int a){
        System.out.println("Trying to override private methods in the same class.");
    }
    void area(){
        System.out.println("I am in shapes");
    }

    static final void area1(){
        System.out.println("I'm checking if static method are inherited since static variable does get inherited! ohh..Yes it does.");
    }

    //early binding
//    final void area() {
//        System.out.println("I am in shapes");
//    }

}
/*
final keyword is used so that our code/variable/methods are not changed by anyone else. Inheritance doesn't change
anything as it only give access for which it creates its own parent class. But overriding means changing/affecting.
I'm not sure of these statements as I wrote this on my intuition.
 */
/*
final prevents overriding of a 'method' but not inheritance of the 'method'. But if the class itself is final, it
can neither be inherited nor will any of its methods will be overridden.
Also,final prevents inheritance of a class. Whenever you declare a class as final, it implicitly declares its all
method to be final. So, if a class can't be inherited then there won't be an option of overriding. As such it is
understandable to make all the method as final inside the class.

private avoids overridden and inheritance in subclasses.
static can only avoid overriding but not inheritance.//you can inherit but you cannot override.
 */
