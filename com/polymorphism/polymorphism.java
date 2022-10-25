package com.polymorphism;

public class polymorphism {

}

/*
polymorphism means many ways to do the same thing. Depending on the situation, an object can behave differently.
Eg. a man can behave as husband, father and son as well as behave accordingly. In the same way, an object of a class
can be created in many ways depending on the types of constructor that is called which is basically called method /
constructor overloading.

2 types of polymorphism are there.
1) compile time/static polymorphism => achieved via method OVERLOADING. Since compiler checks whether the code is
syntactically correct or not and at same time which method to be called during runtime & object creation, it is
called compile time polymorphism. Since static are evaluated in compile time and are object independent, it is termed
as static polymorphism.

2) run time polymorphism => achieved by method OVERRIDING.
    ->what member can be accessed, determined by reference type.
    parent obj = new child();
    ->Here, which method will be called depends on child. This is called upcasting.
    this is all how overriding works.
    So how does java decide this? => By dynamic method dispatch. It says that java decides which version of method to
    be called during runtime i.e. the time when the method is called. During compilation, compiler checks if the method
    is accessible or not but what version of the method is to be called gets decided at runtime.

 */
/*
'final' keyword is used to create constants. Besides, it is also used to prevent override. So if a method is final,
it can't be overridden by its subclass and will show error if we try to do so.
 */
