package com.abstractDemo;

public class Main {
    public static void main(String[] args) {
//        Parent parent = new Parent();   //'Parent' is abstract; cannot be instantiated
        Son son = new Son();
        son.career("son");
        son.son();

        Daughter daughter = new Daughter();
        daughter.career("daughter");
    }
}
