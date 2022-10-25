package com.polymorphism;

public class Circle extends Shapes{
    //this will run when obj of Circle is created. hence it is overriding the parent method
    @Override//this is called annotation. Here it is written just above the method to check if it is overriding.
    void area(){
        System.out.println("Area is pie * r * r ");
    }

    void print(){
        System.out.println("Hello, I'm a circle!");
    }
}

/*
If both parent and child class have the same method with the same signature, the child method will replace the parent
method when we create the child object and referenced by either parent reference type or by its own type. This is called
overriding. Normally, we can't access the members of child through parent reference but when it is overriding, we do can
access it. It is as if we are accessing the method of parent as goes with the rules of accessibility but in fact that
method has been overridden by the child method having same signature.
 */
