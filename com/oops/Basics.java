package com.oops;

import org.w3c.dom.ls.LSOutput;

public class Basics {
    public static void main(String[] args) {
        Student roshan = new Student();
        System.out.println(roshan);
        System.out.println(roshan.rno + " " + roshan.name + " " + roshan.marks);
        roshan.rno = 21053314;
        roshan.marks = 84.43f;
        roshan.name = "roshan barnwal";
        System.out.println(roshan.rno + " " + roshan.name + " " + roshan.marks);
    }
}

class Student{
    int rno;
    String name;
    float marks;
}
