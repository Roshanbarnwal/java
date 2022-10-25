package com.sortAlgorithm;
//https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {
    public static void main(String[] args){
        int[] arr1 = {1,2,0};
        int[] arr2 = {3,4,-1,1};
        int[] arr3 = {7,8,9,11,12};
        System.out.println("From firstMissingPositive()");
        System.out.println(firstMissingPositive(arr1));
        System.out.println(firstMissingPositive(arr2));
        System.out.println(firstMissingPositive(arr3));

        System.out.println("From firstMissingPositive1()");
        System.out.println(firstMissingPositive1(arr1));
        System.out.println(firstMissingPositive1(arr2));
        System.out.println(firstMissingPositive1(arr3));

        System.out.println("From firstMissingPositive2()");
        System.out.println(firstMissingPositive2(arr1));
        System.out.println(firstMissingPositive2(arr2));
        System.out.println(firstMissingPositive2(arr3));

    }

    //this is O(N^2) but we have to solve the problem with O(N).
    static int firstMissingPositive(int[] arr){
        int max = 1;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            max = Math.max(arr[i],max);
        }
        //ans should be in the range [1,max+1]
        for(int i =1; i<= max; i++){
            boolean flag = false;
            for(int j=0; j<n; j++){ //checking if i is my answer or not
                if(arr[j] == i){
                    flag = true;    //it means i is not my answer as it is present.
                    break;      //breaking the j loop as 'i' is checked
                }
            }
            if(!flag){
                return i;
            }
        }
        return max+1;
    }

/*
What does cyclic sort does?
=> If a number inside an array is in the range = [0,arr.length-1] || [1,arr.length] then it will place the number
    in its right index inside the array.
    Of course, if the arr[i] is in the range [0,arr.length-1] || [1,arr.length] then cyclic sort can be used to
    sort the array.
 */
    static int firstMissingPositive1(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i<n){
            int correct = arr[i] - 1;
            //placing the arr[i] in the right index if possible
            //first checking if the index of arr[i] is present in the array or not. If not ignore the number.
            if(correct >= 0 && correct < n){    //ignoring number < 1 & > n - 1
                if(arr[i] != arr[correct]){
                    int tmp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = tmp;
                }else{
                    i++;//go to next index only if the present index contains the right value = i+1
                }
            }else{
                i++;    //go to next index only if arr[i] doesnot have index in the array.
            }
        }
        //ans is in the range of [1,max number in the array + 1] with valid index value.
        //ans is the first index which does not contain the right number.
        for(int index=0; index<n; index++){
            if(arr[index] != index+1){
                return index+1;
            }
        }
        //if arr = {1,2,3}
        return n+1;
    }

    static int firstMissingPositive2(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i<n){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct]){    //ignoring number < 1 & > n - 1
                    int tmp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = tmp;

            }else{
                i++;
            }
        }
        for(int index=0; index<n; index++){
            if(arr[index] != index+1){
                return index+1;
            }
        }

        return n+1;
    }
}
