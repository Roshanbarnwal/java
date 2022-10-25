package com.rahul;

class Dog1 {
    String name;
    public static void main(String[] args) {
        //make a Dog1 object and access it
        Dog1 dog1 = new Dog1();
//        dog1.bark();
        dog1.name = "Bart";

        //now make a Dog1 array
        Dog1[] myDogs = new Dog1[3];
        myDogs[0] = new Dog1();
        myDogs[1] = new Dog1();
        myDogs[2] = dog1;
        //now access the Dogs using the array references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        //Hmmm... what is myDogs[2] name?
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);
        //now loop through the array and tell all dogs to bark
        int x = 0;

        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
        public void bark(){
            System.out.println(name + " says Ruff!");
        }
        public void eat(){}
        public void chaseCat(){}

//    }
}
/*
I have called all the function of an object except main function. Will it be possible to call it?
Also I have not created a new function within an existing function, not even in C. I guess nothing like that exist
as we can put the flovours of the function itself in the existing function. Earlier I tried to include bark()
within main and as it should behave, it was not working.

 */
