package com.CodingWithJohn;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Reflection {
    private int rno=21053314;
    private float mark=84;
    private String name = "Roshan Barnwal";

    public void getdata(int x){
        rno = x;
    }
    public void show(){
        System.out.println(rno);
    }
    public void increment(){
        rno++;
    }
    private void heyThisisPrivate(){
        System.out.println("Hey! This is private.");
    }
    private static void heyThisIsPrivateStatic(){
        System.out.println("Hey! This is private static method.");
    }

}


