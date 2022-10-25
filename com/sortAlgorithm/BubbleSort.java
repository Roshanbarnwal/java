package com.sortAlgorithm;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {7,6,5,4,3,2,1};
        int[] arr1 = {9,5,2,7,8,10,122,13,53,10,3,1,88,10};
        System.out.println("bubble sort");
        System.out.println("Before: "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After: "+Arrays.toString(arr));
//
//        System.out.println("selection sort");
//        System.out.println("Before: "+ Arrays.toString(arr1));
//        selection(arr1);
//        System.out.println("After: "+Arrays.toString(arr1));
//        selection(arr);
//        System.out.println("After: "+Arrays.toString(arr));

//        System.out.println("insertion sort");
//        System.out.println("Before: "+ Arrays.toString(arr1));
//        insertion(arr1);
//        System.out.println("After: "+Arrays.toString(arr1));
//        System.out.println("Before: " + Arrays.toString(arr));
//        insertion(arr);
//        System.out.println("After: "+Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for(int i = n - 1; i >= 0; i--){
            swapped = false;
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }

    static void selection(int[] arr){
        int n = arr.length;
        int max = 0,index = 0;
        for(int i = n-1; i>=0; i--){
            max = arr[0];
            index = 0;  //this is necessary if I'm assuming 0 index element to be max otherwise problem.
            for(int j = 1; j<= i; j++){     //j = 1 is taken not 0 'cuz max = arr[0] & max !< arr[j=0] in if().
                if(max < arr[j]){
                    max = arr[j];
                    index = j;
                }
            }
            //swapping the max number in the current array with the last element
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;

        }
    }

    static void insertion(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j>0;j--){
                if(arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }else{
                    break;
                }
            }
        }
    }
}
/*
time complexity is the relation of how the time grows as input increases.
 */
/*
In best case -> time complexity of bubble sort -> O(N)
In worst case -> time complexity of bubble sort -> O(N^2)
bubble sort is also called stable sorting algorithm.
Stable sorting means when we have duplicates in an array, say there are 3 10's, then all are in an order i.e. all
3 10's are placed at a particular position in the unsorted array. Now the stability means after sorting, all 3 10's
changes their position but doesn't change their order with respect to other. If one 10's comes before another
particular 10's, then even after the bubble sort, the same 10's will come before that particular 10's while
traversing from first element to last.
e.g. 9,5,2,7,8,10(i),122,13,53,10(ii),3,1,88,10(iii)
After sorting, 10's may change their original position in the array but their order with respect to other doesn't
change.=> [1, 2, 3, 5, 7, 8, 9, 10(i), 10(ii), 10(iii), 13, 53, 88, 122]
 */

/*
Selection sort => select any number and place it on its right index on the basis of sorting.
We can select the largest the element in the  array and put it in the last index, select the 2nd largest element
& put it in the 2nd last index and so on.
Best case => O(N^2) [since, for n=5 elements, steps = (n-1) + (n-2) + (n-3) + (n-(n-1) + 0) = n * (n-1)/2 = n^2
Worst case => O(N^2)
Stability => No
Used in small arrays/lists
 */

/*
Insertion Sort => we take 1 element & sort it with its left part. We go on doing so beginning from the 2nd element,
sorting it from left through right. Like bubble sort, big element goes to right.
In other words, we first sort 2 elements to the left, then 3 elements to the left, then 4 elements to the left & so on.
e.g. 3,5,2,1,4
step-1: sort 2nd element to its left => 3,5,2,1,4 => 1 comparison & no swap
step-2: sort 3rd element to its left => 2,3,5,1,4 => 2 comparison & 2 swap
step-3: sort 4th element to its left => 1,2,3,5,4 => 3 comparison & 3 swap
step-4: sort 5th element to its left => 1,2,3,4,5 => 2 comparison & 1 swap

So, the array is sorted.
In time complexity, comparison comes before swap. So comparison decides steps.
best case: no swap happens => 1 comparison only for 1 element => O(N)

e.g. 5,4,3,2,1
worst case: 1 + 2 + ... + (n-1) = n * (n-1) / 2 = O(N^2)

Why use it?
a.) Adaptive: steps get reduced if array is sorted. No. of swaps reduced compared to bubble sort
b.) Stable
c.) Used for smaller values of N => works good when array is partially sorted.
d.) It takes part in hybrid sorting algorithms (combination of quick and merge sort). Learn after recursion.


 */
