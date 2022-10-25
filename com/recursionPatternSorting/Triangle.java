package com.recursionPatternSorting;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args){
//        triangle(4,0);//recursion means printing each * in each row & column by recursion & not just a row.

        int[] arr = {7,6,5,4,3,2,1};
        int[] arr1 = {9,5,2,7,8,10,122,13,53,10,3,1,88,10};
//        bubbleSort(arr,0,arr.length-1);
//        bubbleSort(arr1,0,arr1.length-1);
//        selectionSort(arr,0,arr.length-1);
//        selectionSort(arr1,0,arr1.length-1);
        //using argument in selection Sort
        selectionSort2(arr,0,arr.length-1,0);
        selectionSort2(arr1,0,arr1.length-1,0);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    static void triangle(int r,int c){
        if(r == 0)
            return ;
        if(c < r){
            System.out.print("* ");//printing row
            triangle(r,c+1);
            System.out.print("* ");
        }else{
            System.out.println();//changing row
            triangle(r-1,0);
            System.out.println();
        }
    }

    static void bubbleSort(int[] arr,int s,int e){
        if(e == 0)
            return;
        if(s < e){  //bubbling largest to the end   //works like inner for loop in the iterative version.
            if(arr[s] > arr[s+1])
                arr[s] = arr[s] ^ arr[s+1] ^ (arr[s+1] = arr[s]);//swapped
            bubbleSort(arr,s+1,e);
        }else{
            bubbleSort(arr,0,e-1);  //decreasing the sorting space from the end //works like outer loop
        }
    }

    static int index = 0;
    static int max = Integer.MIN_VALUE;
    static void selectionSort(int[] arr,int s, int e){
        if(e == 0)
            return ;
        if(s<=e){       //take = as well 'cuz last element can also be the max
            if(arr[s] > max){   //i didn't take as I was thinking like bubble sort where index out of bound comes
                max = arr[s];
                index = s;
            }
            selectionSort(arr,s+1,e);
        }else{
            arr[index] = arr[e] ^ arr[index] ^ (arr[e] = arr[index]);//putting max at the end of sorting space
            index = 0;
            max = Integer.MIN_VALUE;
            selectionSort(arr,0,e-1);
        }
    }

    //if we need a value to be passed from one function call to another, then put it in the argument.
    static void selectionSort2(int[] arr,int s, int e,int maxIndex){
        if(e == 0)
            return ;
        if(s<=e){       //take = as well 'cuz last element can also be the max
            if(arr[s] > arr[maxIndex]){   //i didn't take as I was thinking like bubble sort where index out of bound comes
                selectionSort2(arr,s+1,e,s);
            }else {
                selectionSort2(arr, s + 1, e, maxIndex);
            }
        }else{
            arr[maxIndex] = arr[e] ^ arr[maxIndex] ^ (arr[e] = arr[maxIndex]);//putting max at the end of sorting space

            selectionSort2(arr,0,e-1,0);
        }
    }
}
