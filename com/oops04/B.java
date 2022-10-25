package com.oops04;

//this class can only be accessed outside package if it is declared 'public' only, not default,not private &
// nor protected. even after importing.
public class B {
    protected static int f = 99;
    protected int aB = 98;
    int bB = 21;
    public int cB = 81;
    private int dB = 45;

    public String print(){

        System.out.println("I'm accessing print() in com.oops04.B which is public");
        return "non-void as java can't use '+' for string and something void.";
    }

    protected void print1(){
        System.out.println("I'm accessing print1() in com.oops04.B which is protected");
    }

}
