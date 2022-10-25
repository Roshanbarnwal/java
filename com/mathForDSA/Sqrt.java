package com.mathForDSA;

public class Sqrt {
    public static void main(String[] args){
        System.out.printf("%.3f\n",BSsqrt(40,3));
        System.out.println(newtonSqrt(40));
    }

    static double newtonSqrt(int num){  //O(log(N) F(N)) where F(N) = cost of calculating f(x) / f'(x)
        double root = 0.0;
        double x = num;
        while(true){
            root = 0.5 * (x + num/x);   //x is assumed sqrt(num). If x is correct, then root is our answer.
            if(Math.abs(root - x) < 0.5)    //if error is < 0.5, then our assumed root i.e. x is the answer
                break;                      //the lesser is the error, more precise the answer we get.
            x = root;
        }
        return root;
    }
    static double BSsqrt(int num, int p){
        int s = 0,e = num;
        double root = 0.0;
        while(s <= e){      //works if the number is perfert square
            int m = s + (e-s)/2;
            if(m * m == num)
                return m;
            else if(m * m < num )
                s = m + 1;
            else
                e = m - 1;
        }
        double incr = 0.1;
        for(int i=0; i<p; i++){     //works if the number is not perfect square & we require precesion upto 'p'
            while(root * root <= num ){
                root += incr;
            }
            root -= incr;//when while() ends, root value increases by incr so we need to decrease it in order
            incr /= 10;     //to run the while() loop in the next iteration.
        }
        return root;
    }
}
