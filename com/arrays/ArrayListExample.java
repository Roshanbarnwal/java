package com.arrays;
import java.util.ArrayList; //ArrayList is one of the collection framework
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //syntax
    //in ArrayList, no primitive types are allowed. THat means we use wrapper classes or objects
        ArrayList<Integer> list = new ArrayList<>(4);//RHS is constructor and you can give initial value but doesn't matters
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //list prints just as Arrays.toString();
        System.out.println(list);
        //to check if a number is in the list or not
        System.out.println(list.contains(65));
        //to remove a number with its index
        list.remove(4);
        //to change the value of a particular index
        list.set(2,99);
        //to print updated list
        System.out.println(list);
//        System.out.println("size of list = "+ list.size);   //size has private access in java.util.ArrayList

        //iteration
        for(int i = 0; i<5; i++){
            list.add(in.nextInt());
        }
        //get item at any index
        for(int i = 2; i<list.size(); i++){
            System.out.print(list.get(i)+" ");//list[index] systax will not work
        }
        System.out.println("");
        System.out.println(list);
    }
}
/*
 ArrayList
 1. size is fixed internally
 2. say arraylist fills by some amount
 3. It will create a new arraylist of say, double the size when it fills by say more the double of its size
 4. Old elements are copied in new one
 5. Old arraylist is deleted
 */
