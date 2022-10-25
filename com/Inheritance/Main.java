package com.Inheritance;

public class Main {
    public static void main(String[] args){
//        Box box = new Box(4.6,9.5,3.4);
//        Box box2 = new Box(box);
//        System.out.println(box.l + " " + box.w + " " + box.h);

        BoxWeight box3 = new BoxWeight();//calls default constructor of Box.java besides to that of BoxWeight.java
        System.out.println("Dafualt construct of BoxWeight "+box3.h + " "+box3.weight);
        BoxWeight box4 = new BoxWeight(2,3,4,5);
        System.out.println("l is not accessed as it is private "+box4.h+" "+box4.w+" "+box4.weight);

        Box box5 = new BoxWeight(2,10,4,8);
        System.out.println("Box is referencing to BoxWeight "+box5.h);     //sout(box5.weight);    we can't access the member of child class through parent reference variable
//        box5.print();     //u can only do this if Box had same print fxn. In that case, print() of BoxWeight override to that of Box.

        /*
        there are many variables in both parent and child classes. you are given access to variables that are in the
        ref type i.e. BoxWeight hence, you should have access to weight variable. This also means, that the ones you
        are trying to access should be initialized but here, when the obj itself is of type parent class, how will
        you call the constructor of child class.That is why error.
         */
        //parent reference can point to child object but child reference can't point to parent object like below.

//        BoxWeight box6 = new Box(3,5,6,7);//constructor of this type is present in child class but can't be
//        System.out.println(box6);//accessed through parent class. That is why error.

        BoxPrice box7 = new BoxPrice();
        BoxPrice box8 = new BoxPrice(7,8,9);
        //checking if box8 & box9 are affecting parents attributes for itself only.
        BoxPrice box9 = new BoxPrice(70,80,90);
        System.out.println("h,w,weight,cost -> "+box8.h+" "+box8.w+" "+box8.weight+" "+box8.cost+" respectively");
        System.out.println("h,w,weight,cost -> "+box9.h+" "+box9.w+" "+box9.weight+" "+box9.cost+" respectively");
//hence, each child class creates its own parent class with given or default value.


    }
}
/*
if an attribute is private, you can't access it outside the class but you do can initialize it or change its value
via constructor. Calling a constructor means you enters into the scope of the class where you have access to
modify the attribute.
 */
/*
Very important -> it is not the object a variable is referring to,that determines what attributes are accessible
but it is the type of reference variable according to which accessibility is determined.
 */
