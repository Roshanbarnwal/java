package com.Roshan;

class Echo{
    int count = 0;
    void hello(){
        System.out.println("helloooo... ");
    }
}

public class EchoTestDrive {
    public static void main(String[] args){
        Echo e1 = new Echo();
        Echo e2 = new Echo(); //Echo e2 = e1;   for getting 24 as final output.
        int x = 0;

        while (x < 4){
            e1.hello();
            e1.count = e1.count + 1; //Echo e2 = e1; is wrong as e2 is already defined above.
            if( x==3){
                e2.count = e2.count + 1;
            }//end of 1st if

            if(x>0){
                e2.count = e2.count + e1.count;
            }
            x = x+1;
        }//end of 2nd if
        System.out.println(e2.count);
    }//end of main
}//end of class
