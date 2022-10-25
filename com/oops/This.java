package com.oops;

public class This {
    public static void main(String[] args) {
//        Student2 roshan  = new Student2(210,"kunal kushwaha",98.9f);//int is good for float but double is not.
        Student2 roshan = new Student2();
        System.out.println(roshan);
        System.out.println(roshan.rno + " " + roshan.name + " " + roshan.marks);
        roshan.rno = 21053314;
        roshan.marks = 84.43f;
        roshan.name = "roshan barnwal";
        System.out.println(roshan.rno + " " + roshan.name + " " + roshan.marks);
        roshan.greeting();
        Student2 random = new Student2(roshan);
        System.out.println("For random object: "+ random.rno + " " + random.name + " " + random.marks);

    }
}

class Student2 {
    int rno;
    String name;
    float marks = 90;
    void greeting(){
        System.out.println("Hello " + name);
        System.out.println("hello this! " + this.name); //internally this is how it works. 'this' is always called.
    }
    Student2() {
  //this is how you call a constructor from another constructor
  //internally: Student2(13,"default person",100.f);
  //here 'this' doesn't mean reference variable like roshan because roshan() isn't a function and u can't call a function on a reference variable
        this (13,"default person",100.f);
    }
//    Student2(int rno, String name,float marks){
//        rno = rno;
//        name = name;
//        marks = marks;
//    }

    Student2 (Student2 other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student2(int rno, String name,float marks){     //constructor overloading like function overloading
        this.rno = rno;             //'this' differentiates the instance variables from the parameters in case both bear the same name
        this.name = name;
        this.marks = marks;
    }
}
/*
you can create as many constructor as you want. It is just like other functions except it is special in its call.
If you remove constructor with zero parameters and have other constructor with at least 1 parameter, then it is
mandatory to give arguments while creating the object.
 */
