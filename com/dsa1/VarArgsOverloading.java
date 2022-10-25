package com.dsa1;
import java.util.Arrays;
public class VarArgsOverloading {
    //creating "ambiguity" in function overloading
    public static void main(String args[]){
        display(2,3,4,5,6,7);
        display("kunal","roshan","dhiraj");
//        display();
//        Here display(); is ambiguous since both display method can take variable empty arguments so compiler can't decide which display method to choose
    }

    static void display(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void display(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
