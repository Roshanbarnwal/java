package com.stringStringBuilder;

public class StringIntro {
    public static void main(String[] args){
        String a = "roshan";    //both a & b are pointing to same object 'cuz of string pool theory in java
        String b = "roshan";
        String c = "barnwal";

        String name1 = new String("roshan");    //both name1 & name2 are pointing to different objects
        String name2 = new String("roshan");//'cuz we are telling java to create new object explicitly.
        String name3 = new String("barnwal");

//        System.out.println(a==b + " " + a==c);    //Operator '==' cannot be applied to 'boolean', 'java.lang.String'
        System.out.println(a==b );
        System.out.println(a==c);
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(a==name1);
        System.out.println("Now checking the value of objects");
        System.out.println(a.equals(b));
        System.out.println(name1.equals(name2));
        System.out.println(a.equals(name1));

        //to access the individual char at preferred index from String, use .charAt()
        System.out.println(a.charAt(0) + " " + c.charAt(0) + " "  + name1.charAt(0));
    }
}
/*
String pool is a separate section in the heap memory. For optimizing the program & make it faster, java creates a
pool of memory where no 2 objects with same value can exist together. So, whenever a String object is created,
java searches for the same object in the pool & if found then give the same object to the reference variable.

But when we use 'new' keyword, we tell java to create a new object even if there exist an object with the same value
Also, object created by 'new' exist in the heap but outside the string pool.

String is immutable i.e. its value can't be changed for the security reason. We know that more than 1 reference
variable can point to the same String object, then it would not be wise to give control of the object to any 1
reference variable. Secondly, when we are explicitly putting the value in the program itself without asking to the
user, it means we don't want to change the value in the whole program. So why bother changing it later.
 */

/*
== is called comparator. It checks the memory address as well as value.
.equals() checks only values.
 */
