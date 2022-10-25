package com.polymorphism;

public class Square extends Shapes{
    @Override
    void area(){
        System.out.println("Area is square of side  ");
    }

    public static void main(String[] args) {
        Square obj = new Square();
        //accessing static variable from superclass
        System.out.println(obj.a);
        obj.area1();
    }
}
