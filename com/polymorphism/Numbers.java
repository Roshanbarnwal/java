package com.polymorphism;

public class Numbers {
    double sum(double a, int b){
        return a*b;
    }
    double sum(int a,int b){
        return a*b;
    }
    int sum(int a,int b,int c){
        return a*b*c;
    }

    public static void main(String[] args){
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2,3));
        System.out.println(obj.sum(4,5,6));

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(2, 3);
        String d = cde.substring(1, 2);
        System.out.println(c + " " + d + " " + "abc".substring(2));
    }
}
