package com.Inheritance;

public class Box {
    private double l;
//    double l;
    double h;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l,double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){   //also valid for any parameter class if it has to everything to that of Box class.
        super();  //call the Object class
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

//    Box(BoxWeight other){
//        super();
//    }
    void print1(){
        System.out.println("print1() is default in Box.java");
    }
    void print(){
        System.out.println("print() is present in Box.java but most likely it will be overridden by child class.");
    }
}


