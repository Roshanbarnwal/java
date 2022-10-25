package com.abstractDemo;
//u cannot instantiate an abstract class
//u need to use abstract keyword for declaring class if it contains abstract method.
public abstract class Parent {
    abstract void career(String name);
    abstract void partner(String name, int age);
}

/*
abstract means we only give the prototype of methods in the parent class. Now child class will be & must be responsible
for defining those methods if it is going to inherit that abstract parent class henceforth overriding the methods in
parent class.
 */
