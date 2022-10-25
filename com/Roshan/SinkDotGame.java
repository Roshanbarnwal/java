package com.Roshan;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class SinkDotGame{
    public static void main(String[] args) {
        GameSetUp x = new GameSetUp();
        GameStart y = new GameStart();
        x.setUp();
        //y.guess();
        int a = 0;
        do{
            y.guess();
            if(y.fCell == x.cell[x.cell1] ){
                System.out.println("hit");
                a++;
            }
            if(y.fCell == x.cell[x.cell2] ){
                System.out.println("hit");
                a++;
            }
            if(y.fCell == x.cell[x.cell3] ){
                System.out.println("hit");
                a++;
            }
        }while(a<3);
        if(a ==3 ){
            System.out.println("kill");
        }

    }
}

class GameSetUp{
    int[] cell = new int[10];
    int m = (int)(Math.random()*10);
    int n = (int) (Math.random()*10);
    int cell1;
    int cell2;
    int cell3;

    public void setUp() {
//        for (int i = 0; i < 10; i++) {
//            cell[i] = new int[10];
//        }

        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                cell[m][n] = m * n;
//                n++;
//            }
            cell[m] = m;
            if(i==0){
                cell1 = m;
            }
            if(i == 1){
                cell2 = m;
            }
            if(i ==2){
                cell3 = m;
            }
            m++;
        }
    }
}

class GameStart{
    int fCell;
    //int sCell;
    public void guess() {
        Scanner in = new Scanner(System.in);
        System.out.print("Give cell number: ");
        fCell = in.nextInt();
        //sCell = in.nextInt();
    }
}
