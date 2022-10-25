package com.oops4;

import java.util.ArrayList;
//of course, for using any class from different package, we need to import the class. By default, java can only look
//for an unidentified instances of a unique class inside a running class in the same package unless it is instructed
//to do it differently by 'import' statement.
public class AccessModifier {
    public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>(10);
    list.add(4);
//    list.grow();  //can't access as grow() is private in ArrayList() class
    list.hashCode();//it is accessible as it is public in ArrayList() class
//        list.hashCodeRange(2,5);  //It has not modifier in 'java.util.ArrayList'. Cannot be accessed from outside
//                                  package as it is left as default.
        System.out.println(list.isEmpty() + " "+ list.size());
    }
}
/*
There are 4 access modifiers: private,default,protected and public
1) public => It can be accessed from same as well as different packages, either via subclassses or normal class.

2) default => It can be accessed only from same package. It can't be accessed from different package even if you
import the class. E.g. ArrayList<> has many methods as default so it can't be accessed even after importing.

3) protected => It is same as default except one tiny thing. It can also be accessed outside package but only via
instances of "lowest" subclass inheriting the desired class and not via the instance of the class itself.
It can also be accessed outside of package without inheritance if it is static.

4) private => it can only be accessed within the same class. It can't even be accessed outside even in the same package

These are also valid for the whole class itself. At least regarding public and default.
I'm not being able to use protected and private for class as it is not allowed.
 */
/*
There are 2 types of packages:- 1) User-defined packages i.e. classes that we have been creating till now
                                2) in-built packages => i) java.lang
                                                        ii) java.util
                                                        iii) java.io
                                                        iv) java.applet
                                                        v) java.net
                                                        vi) java.awt
lang contains normal operations like operators,primitive,etc. It gets imported automatically when program runs.
util contains data structure and collections frameworks like ArrayList.
io contains stuff related files
//obsolete
applet contains development stuffs
net contains server stuffs
awt contains GUI stuffs
 */
