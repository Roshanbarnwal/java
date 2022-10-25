package com.rahul;

public class Dog {
    String name;
    public static void main(String[] args){
        //make a Dog1 object and access it
        Dog1 dog1 = new Dog1();
//        dog1.name = "Bart";
//        dog1.bark();
        dog1.name = "Bart";

        //now make a Dog1 array
        Dog1[] myDogs = new Dog1[3];
        //and put some dogs in it
        myDogs[0] = new Dog1();
        myDogs[1] = new Dog1();
        myDogs[2] = new Dog1();

        //now access the Dogs using the array references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        //Hmmm...what is myDogs[2] name?
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        //now loop through the array and tell all dogs to bark
        int x = 0;
        while(x < myDogs.length){
//            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark(){
        System.out.println(name + " says Ruff!");

    }

}
