package com.CodingWithJohn;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//by reflection, we can access private member as well as we can change their values.
public class Main {
    public static void main (String[] args)throws Exception{
        Reflection a = new Reflection();
        Field[] arr = a.getClass().getDeclaredFields();   //returns an array of field(string) in the class
        a.increment();
        a.show();
        for(Field x : arr){
            System.out.println(x.getName());
            if(x.getName().equals("rno")){
                x.setAccessible(true);
                x.set(a,21053314);  //set(object to be acted upon, value to be set)
            }
        }
        a.show();

        Method[] myMethod = a.getClass().getDeclaredMethods();
        for(Method method : myMethod){
            System.out.println(method);
            if(method.getName().equals("heyThisIsPrivateStatic")){
                method.setAccessible(true);
                method.invoke(null);    //since it is static & no parameters are there
                //invoke(object on which method is to be called,parameters of the method in same order)
            }
        }
    }
}
