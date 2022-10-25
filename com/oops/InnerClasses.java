package com.oops;

public class InnerClasses {
    static class Test{
        String name;
        Test(String name){
            this.name = name + " barnwal";
        }
    }

    public static void main(String[] args) {
        Test a = new Test("kunal");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
/*
static is independent of object then how 'a' and 'b' have independent identity?
Here, inner class is static which means it is independent of outer class but it can have its own individual different
classes.

**since object are created during runtime and static are independent of object so that they are resolved during
compile time.
 */
