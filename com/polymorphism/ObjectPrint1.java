package com.polymorphism;

public class ObjectPrint1 {
    int num;

    public ObjectPrint1(int num){
        this.num = num;
    }

    @Override//As we can see, it has overridden the toString() method of Object superclass.
    public String toString(){
        return "ObjectPrint{" + "num=" + num + '}';
    }

    public static void main(String[] args) {
        ObjectPrint1 obj = new ObjectPrint1(54);
        System.out.println(obj);//println() invokes toString() method of obj. Since this class has its own toString()
                                //method, it will override the Object.java one.
    }
}
