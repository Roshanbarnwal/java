package com.recursion1;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {1,3,5,9,3,2,3,10,-1,0,31};
        System.out.println(linearSearch(arr,21,0));
        System.out.println(find(arr,-1,0));
        System.out.println(findIndexLast(arr,-1,arr.length-1));
        findAllIndex(arr,3,0);
        System.out.println(list);
        System.out.println(findAllIndex(arr,3,0,new ArrayList<>()));
        //returning arraylist without passing into the function as the arguments
        System.out.println(findAllIndex1(arr,3,0));//won't create an answer.
        System.out.println(findAllIndex2(arr,3,0));//it is right as we are taking list from next
                            //function call & joining it with list present in the current function call
                    //via Collection.addAll() method
                //since we can't pass the same object in the recursive calls, but we do can take the answers
        //from the very next function calls & store it somehow or copy its contents into our own object in
        //current function.
    }

    static int linearSearch(int arr[], int target,int index){
        if(index == arr.length)
            return -1;
        if(arr[index] == target)
            return index;
        return linearSearch(arr,target,index+1);
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length)
            return false;
        return arr[index] == target || find(arr,target,index + 1);
    }

    static int findIndexLast(int arr[], int target,int index){
        if(index == -1)
            return -1;
        if(arr[index] == target)
            return index;
        return findIndexLast(arr,target,index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[], int target,int index){
        if(index == arr.length)
            return ;
        if(arr[index] == target)
            list.add(index);
        findAllIndex(arr,target,index+1);
    }
    //returning an arraylist from the function
    static ArrayList findAllIndex(int arr[], int target,int index,ArrayList<Integer> list){
        if(index == arr.length)
            return list;
        if(arr[index] == target)
            list.add(index);
        return findAllIndex(arr,target,index+1,list);
    }
    static ArrayList findAllIndex1(int arr[], int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
            return list;
        if(arr[index] == target)
            list.add(index);
         findAllIndex1(arr,target,index+1);
         return list; //it is not updated in recursive calls
    }

    //V.V.V.V.V.V.I
    static ArrayList findAllIndex2(int arr[], int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
            return list;
        //this contains answer fort that particular function call only
        if(arr[index] == target)
            list.add(index);
        //findAllIndex2() contains answer from below function calls
        list.addAll(findAllIndex2(arr,target,index+1));
        return list;
    }
}
