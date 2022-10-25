package com.sortAlgorithm;

public class MissingElement {
    public static void main(String[] args){
        int[] arr = {3,0,1};    //Ans: 2
        int[] arr1 = {0,1};     //Ans: 2
        int[] arr2 = {9,6,4,2,3,5,7,0,1};   //Ans: 8
        System.out.println("From missingElement()");
        System.out.println( missingElement(arr));
        System.out.println( missingElement(arr1));
        System.out.println(missingElement(arr2));

        System.out.println("From missingNumber()");
        System.out.println(missingNumber(arr));
        System.out.println(missingNumber(arr1));
        System.out.println(missingNumber(arr2));

        System.out.println("from missingNumber1()");
        System.out.println(missingNumber1(arr));
        System.out.println(missingNumber1(arr1));
        System.out.println(missingNumber1(arr2));

    }

    static int missingElement(int[] arr){
        //first sorting the arr using insertion sorting
        int n = arr.length;
        //in the problem, the arr is starting from 0. So, arr[i] = i.
        for(int i = 0; i < n-1 ; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }else{
                    break;
                }
            }
        }

        //finding which first element is not at its actual index. The number just below it is missing.
        for(int i = 0; i<n; i++){

            if( i != arr[i] ){
                return arr[i] - 1;
            }
        }
        return arr.length;
    }

    static int missingNumber(int[] arr){
        //since number are in consecutive range , we use cyclic sort
        int n =  arr.length;
        for(int i = 0; i<n; i++){
            //here, arr[i] = i.
            //when we can not add the missing element in the array without increasing its size.So, we ignore the
            // last element while sorting 'cuz largest number will have index arr.length but last index is
            //arr.length - 1.
            if(arr[i] == n){
                continue;
            }
            if(arr[i] != i){
                int tmp = arr[i];
                arr[i] = arr[tmp  ];
                arr[tmp ] = tmp;
            }
        }
        //if any index is not having the right index, then index is the number.
        int i=0;
        while(i < n){
            if(i != arr[i]){
                return i;
            }
            i++;
        }
        //if the last number is missing, we will get the proper consecutive sorted array.
        return n;
    }

    static int missingNumber1(int[] arr){
        int i = 0;
        int n = arr.length;
        while(i < n){
            int correct = arr[i];
            if(arr[i] < n && arr[i] != arr[correct]){
                int tmp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = arr[i];
            }else{
                i++;
            }
        }
        //search for first missing number
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        //case 2
        return arr.length;
    }
}
