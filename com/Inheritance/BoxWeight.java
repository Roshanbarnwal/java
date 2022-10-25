package com.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight (BoxWeight other){
        //child class has access to everything in parent so we can pass it to super in place of parent object.
        super(other);//parameter ~= Box other = new BoxWeight(); //if Box(Box other){} is only present in Box.java
        weight = other.weight;
    }
    public BoxWeight(double l,double h, double w, double weight){
        //if super(l,h,w) not called, default constructor of parent is called -> Box()
        super(l,h,w);//call the parent class constructor. used to initialize values present in parent class
        this.weight = weight;
//        super(l,h,w);     //error: Call to 'super()' must be first statement in constructor body
    }

    void print(){
        System.out.println("BoxWeight invoked print!");
    }
}
/*
child class can't access private attributes of parent class. 'extends' keyword is used to connect a class to some
other class and super() is used to call the constructor of parent class.
 */
/*
super(l,h,w);
Here, l is private in Box.java so shouldn't it initialized in BoxWeight.java. Well, it is not. Actually l is being
initialized inside Box.java as super() calls Box.java internally.
super() actually inherits the immediate parent class as there can be a chain of parent and child classes.
In fact every single class is child class of superclass object() as is written in java. So you can use super()
inside Box.java.

*** super() needs to be called first before initialising any members of child class if you are going to initialize
any members of parent class.

What if you have same member in both parent and child class? How will you differentiate it while initializing?
Well, here comes the second use of 'super'. For calling class, we use 'this' keyword while for parent class we use
'super' keyword. if weight is on both class, this.weight and super.weight are for respective classes.
 */
/*
parent class has no idea whatsoever what is present in child class. So it doesn't care about child class. But
child class do know everything about parent class. So child class do give preferences to parent. So before
initializing own members, child class must initialize its parent class.***
 */
