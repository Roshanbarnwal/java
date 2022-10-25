package com.Inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(){
        super();//it happens by default so you may or may not use it.
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double l, double h, double w, double weight, double cost){
        super(l,h,w,weight);
        this.cost = cost;
    }

    BoxPrice(double side,double weight,double cost){
        super(side,weight);
        this.cost = cost;
    }
}
