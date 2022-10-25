package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println(list);
        //initialisation upper layer
        for(int i = 0; i< 3; i++){
            list.add(new ArrayList<>());
        }

        //printing out list
        System.out.println(list);
        System.out.println(list.get(0));
        //initialising lower layer
        for(int i = 0; i<list.size(); i++){
            list.get(i).add(in.nextInt());
        }
        System.out.println(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
