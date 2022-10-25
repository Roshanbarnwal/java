package com.patterns;

public class basics {
    public static void main(String[] args){
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern17(5);
        pattern28(5);
        pattern30(5);
        pattern31(5);
        pattern32(5);
        pattern33(5);
        final int size = 5;
        int[] arr = new int[size];
        System.out.println(arr);
    }
    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            //for every row, run the col
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            //when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row+1 ; col++){
                System.out.print("* ");
            }System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row = 1; row < 2*n; row++){
            int totalColsInRow = row <=n ? row : 2*n - row;
            for(int col = 0; col < totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int i = 1; i< 2*n; i++){
            int halfCol = i <= n ? i : 2*n-i;
            int space = n - halfCol;
            for(int j=0; j<space; j++){
                System.out.print("  ");
            }
            int j=halfCol;
            while(j > 1){
                System.out.print(j + " ");
                j--;
            }
            while(j <= halfCol){
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for(int row = 1; row < 2*n; row++){
            //printing space
//            int totalSpaceInRow = row > n ? row-n : n - row;
            int totalColsInRow = row <=n ? row : 2*n - row;
            int totalSpaceInRow = n - totalColsInRow;
            for(int col = 0; col < totalSpaceInRow; col++){
                System.out.print(" ");
            }
            //printing *
            for(int col = 0; col < totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int i = 1; i<= n; i++){
            int space = n - i;
            for(int j=0; j<space; j++){
                System.out.print("  ");
            }
            int j=i;
            while(j > 1){
                System.out.print(j + " ");
                j--;
            }
            while(j <= i){
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
    }

    static void pattern31(int n){   //n is the number at the center
        n = 2*n;     //if we consider four walls, then value at a particular index is its min distance from all 4 walls
        System.out.println();
        for(int row = 0; row <= n; row++){
            for(int col =0; col <= n; col++){
                int atEveryIndex = Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println( );
        }
        System.out.println();
    }

    static void pattern32(int n){   //n is the number on the outer wall & 0 is the center
        int originalN = n;
        n = 2*n;
        System.out.println();
        for(int row = 0; row <= n; row++){
            for(int col =0; col <= n; col++){
                int atEveryIndex = originalN - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println( );
        }
    }

    static void pattern33(int n){   //1 is the number in the center & n+1 on the outer wall
        int originalN = n;
        n = 2*n;
        System.out.println();
        for(int row = 0; row <= n; row++){
            for(int col =0; col <= n; col++){
                int atEveryIndex = originalN - Math.min(Math.min(row,col),Math.min(n-row,n-col)) + 1;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println( );
        }
    }

}
/*
1) no. of lines = no. of rows = no. of times outer loop will run
2) Identify for every row no., how many columns are there or types of elements in the column
3) Try to find the formula for rows & columns
 */
