package com.CodingWithJohn;

public class Generics {
    public static void main(String[] args){
        IntegerPrinter i = new IntegerPrinter(99);
        i.print();
        DoublePrinter d = new DoublePrinter(88.99);
        d.print();
        StringPrinter s = new StringPrinter("Roshan");
        s.print();

        //now is turn for generic
//        Printer p1 = new Printer(999);    //Printer is a raw type & references to generic type Printer should be
//                                          parameterized. But it is also working don't know why.
        Printer<Integer> p1 = new Printer<>(999);
        p1.print();
        Printer<Double> p2 = new Printer<>(88.999);
        p2.print();
        Printer<String> p3 = new Printer<>("Roshann");
        p3.print();
    }
}
class Printer <T>{
    T thingToPrint;
    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}
class StringPrinter{
    String thingToPrint;
    public StringPrinter(String thingTOPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}
class IntegerPrinter{
    Integer thingToPrint;
    public IntegerPrinter(Integer thingTOPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}
class DoublePrinter{
    Double thingToPrint;
    public DoublePrinter(Double thingTOPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}
/*
So, here we can see that we have the same type of classes except they are dealing in different data type.
We want to print a data but because of different data type, we creating whole different class. So to avoid
that we follow generic concept in which we somehow make that data type of a variable the same to the value
it is given just like 'auto' keyword in c++.
 */
/*
Generics means one class which is flexible with different data types.
Format:
    public class class-name <whatever>{ }
Generic doesn't work with primitives.
 */
