package com.polymorphism;

public class Main {
    public static void main(String[] args){
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Shapes circle1 = new Circle();
        Shapes square = new Square();

        shapes.area();
        circle.area();  //Overrides:area in class Shapes
        circle.print();
        circle1.area();
//        circle1.print(); //Cannot resolve method 'print' in 'Shapes' //parent class doesn't know anything about
                            //its child class.
//        circle1.print1(); //print1() has private access in Shapes.java so can't be accessed.
        square.area();
    }
}
/*
what could be accessed depends on type of reference variable and not the object that it is pointing to.

When you have the type of reference variable as parent class but pointing to object of sub-class, then the chance of
overriding occurs otherwise they do the normal work.
 */
/*
    parent obj = new child();
    Here, which method will be called depends on child. This is called upcasting.
    this is all how overriding works.
    So how does java decides this? => By dynamic method dispatch.
 */