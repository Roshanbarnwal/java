package com.polymorphism;
class Vehicle
{
    protected void start() {
        System.out.println("Vehicle Started");
    }

    static void stop() {
        System.out.println("Vehicle Stopped");
    }

    final void run (){
        System.out.println("Vehicle running. this method is not in Car");
    }
}

class Car extends Vehicle
{
    //access privilege of the overriding method should be equal or greater than method in its parent class.
    //here, public status of start() is greater than protected status of start() in Vehicle. protected can alse used.
    //private method can't be overridden
    //private < default < protected < public
    @Override
     public void start() {
        System.out.println("Car Started");
    }

//    @Override //can't override static method but unlike final, static can be created inside child class.
    static void stop() {
        System.out.println("Car Stopped");
    }

//    final void run (){  //'run()' cannot override 'run()' in 'com.polymorphism.Vehicle'; overridden method is final
//        System.out.println("Vehicle running");
//    }
}

public class EarlyLateBinding {
    public static void main(String[] args)
    {
        // `Car` extends `Vehicle`
        Vehicle vehicle = new Car();
        Car car = new Car();
        car.run();
        vehicle.start();
        vehicle.stop(); //convention: Vehicle.stop(); ~= class_name.static_method();
    }
}
/*
Output:

Car Started
Vehicle Stopped


Consider the above code. It has two classes – the Vehicle class and the Car class, where the Car extends the Vehicle
class. Each class has two methods – start() and stop(). The stop() method is static while the start() method is
non-static. Now when we call the start() and stop() methods using parent class reference, the start() method of the
child class is called while the stop() method of the parent class is called.

Why?

This is because stop() is a static method and hence cannot be overridden. So binding of the stop() method happens at
the compile time itself (early binding). On the other hand, start() is a non-static method overridden in the child
class. So, the information about the type of object is available at the run time only (late binding), and hence the
start() method of the Car class is called.

That’s all about the differences between Early and Late binding in Java.
 */
/*
Difference between Early and Late Binding in Java
This post will discuss the difference between early and late binding (static and dynamic binding) in Java.

Binding generally refers to a mapping of one thing to another. In the context of compiled programming languages,
binding is the association of a method call with the method definition. In simpler terms, when a method is called in
Java, the program control binds to the memory address where that method is defined.


There are two types of binding in Java – early (or static) binding and late (or dynamic) binding. This post provides
an overview of the differences between the two.

The early binding happens at the compile-time and late binding happens at the run time.
In early binding, the method definition and the method call are linked during the compile time. This happens when
all information needed to call a method is available at the compile time.
Unlike early binding, the method calls are not resolved until run time in late binding as we cannot determine all
information needed for a method call at compile time. So the method definition and a method call are not bound until
run time.

The normal method calls and overloaded method calls are examples of early binding, while reflection and method
overriding (run time polymorphism) are examples of late binding.
The binding of private, static, and final methods happens at the compile-time as they cannot be overridden.
Since all information needed to call a method is available before run time, early binding results in faster execution
of a program. While for later binding, a method call is not resolved until run time, resulting in somewhat slower
execution of code.
The major advantage of late binding is its flexibility since a single method can handle different types of objects at
run time. This significantly reduces the size of the codebase and makes the code more readable.
Example of early and late binding in Java

 */
