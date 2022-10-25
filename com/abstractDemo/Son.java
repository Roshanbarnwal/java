package com.abstractDemo;

//Class 'Son' must either be declared abstract or implement abstract method 'career(String)' in 'Parent'
//to inherit an abstract class, u must define all the abstract methods of the parent class. u cannot leave a single one.
public class Son extends Parent{

    @Override
    void career(String name) {
        System.out.println("I am going to be a "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+name+". She is "+age);
    }

    void son(){
        System.out.println("son() is Son's own function.");
    }
}
