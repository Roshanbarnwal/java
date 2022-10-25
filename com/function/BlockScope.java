package com.function;

public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "kunal";
        //creating a block/separate space
        {
//            int a = 78; //already initialized outside block in the same method so cannot initialize it again but it
//but it can be updated inside block.Simply speaking, variable from outside but within the same method can be used
//inside the block but those created/initialized inside the block can't have existence outside the block.
            a = 100;
            System.out.println("value of a inside block: "+a);
            int c = 99;
            System.out.println("value of c inside block: "+c);
            name = "Rahul";
            System.out.println("value of name inside block:"+name);
            //values created in this block, will remain in block.
        }
        /*
        block scope is same as for{} , while{}, main{}
         */
        int c = 900;
        System.out.println("value of a outside block: "+a);
        System.out.println("value of name outside block:"+name);
        System.out.println("value of c outside block: "+c);
    }
}
