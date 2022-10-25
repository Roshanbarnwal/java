package com.binarySearchAlgorithms;
//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
//number of rotation = index of pivot number + 1;
public class RotatedSortedArray {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2} , arr1 = {1};
        System.out.println(findPivot(new int[] {2,2,9,9,2,2}));
        System.out.println(findPivotWithDuplicates(new int[] {2,2,9,9,2,2}));
        int target = 3,target1 = 0;
        System.out.println(search(arr,target));
        System.out.println(search(arr1,target1));
        //using 2nd method
        int[] arr2 = {3,5,1}; int target2 = 3;
        System.out.println(search1(arr,target));
        System.out.println(search1(arr1,target1));
        System.out.println(search1(arr2,target2));

    }

    static int search(int[] arr,int target){
        int s = 0, e = arr.length - 1;
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0,e);
        }
        if(arr[pivot] == target)
            return pivot;
        int fTry = binarySearch(arr,target,0,pivot);
        if(fTry != -1){
            return fTry;
        }
        else{
            int sTry = binarySearch(arr,target,pivot+1,e);//in worst case, both fTry & sTry will run, not good
            return sTry;
        }

    }
//Kunal's one.
    static int search1(int[] arr,int target){   //this is efficient as only 1 BS will only run in worst case.
        int s = 0, e = arr.length - 1;
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0,e);
        }
        if(arr[pivot] == target)
            return pivot;
        //here arr[s] & target are variables. So, remember to include all 3 inequalities.
        //since arr[s] is one of the variable, I need to put = in the block where index 's' is present.
        else if(arr[s] <= target)//we know, arr[0] is only < than number present in the 1st part.
            return binarySearch(arr,target,s,pivot - 1);
        else
            return binarySearch(arr,target,pivot + 1,e);

    }

    //arr is ascending so no need to go for OrderAgnostics method
    static int binarySearch(int[] arr,int target, int s,int e){
        while(s <= e){
            int m = s + (e-s)/2;
            if(arr[m] == target)
                return m;
            if(arr[m] < target)
                s = m + 1;
            else
                e = m -1;
        }
        return -1;
    }

//Kunal says this will not work for duplicate values but I have not found any array
//with duplicates where it is not working. So writing another method.
    static int findPivot(int[] arr){
        int s = 0, e = arr.length - 1;
        //4 cases are there
        while(s <= e){
            int m = s + (e-s)/2;
            if(m < e && arr[m] > arr[m+1])  //m < e prevents index out of bound
                return m;
            else if(m > s && arr[m] < arr[m-1])
                return m-1;
            else if(arr[m] <= arr[s])   //Always remember,there are 3 inequalities possible between 2 variable.
                e = m - 1;             //Here, arr[s] & arr[m] are the 2 variable. So, = is needed to be used.
            else                      //Besides, = comes handy when multiple occurrences of a number happens.
                s = m + 1;
        }
        return -1;  //in case the array is not rotated & is a simple sorted array.
    }

    //for duplicates
    static int findPivotWithDuplicates(int[] arr){
        int s=0, e = arr.length - 1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(m<e && arr[m] > arr[m+1])
                return m;
            else if(m>s && arr[m] < arr[m-1] )
                return m - 1;
            //if elements at middle, start, end are equal than just skip the duplicates
            if(arr[m] == arr[s] && arr[m] == arr[e]){
                //skip the duplicates
                //NOte: what if these elements at start and end were the pivot??
                //check if start is pivot
                if(arr[s] > arr[s + 1])
                    return s;
                s++;

                //check whether end is pivot
                if(arr[e] < arr[e-1])
                    return e -1;
                e--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[s] < arr[m] || (arr[s] == arr[m] && arr[m] > arr[e])){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }
        return -1;
    }
}

/*
when 2 corners of an ascending sorted array are rotated clockwise, then we find a rotated sorted array. As it was
sorted earlier, there will be a largest value which is called pivot. On either side of pivot, numbers will be in
ascending order unlike in mountain array where on left side numbers are in ascending order and on the right side,
the numbers are in descending order.
e.g. 1 2 3 4 5 6 6 7 8 9
After rotation through 4 digits :-> 6 7 8 9 1 2 3 4 5 6
So,
here, only pivot number is greater than both the number on its either side & only it is > than  its next no.
Case 1:
    When arr[mid] > arr[mid+1], arr[mid] is the pivot number.
Case 2:
    arr[mid] < arr[mid-1] => arr[mid - 1] is the pivot number.
Case 3:
    arr[start] >= arr[mid] => we can ignore all the no. after mid as we are looking for largest element.
    In rotated sorted array, there are 2 parts btw pivot no. Now, 2nd part will always be < than 1st part & in 1st
    part, no number will be > than its next number. As start is the first number in our space, it will only be
    > than number present in 2nd part of the array.
    Hence,
          end = mid - 1;
Case 4:
    arr[start] < arr[mid] => start = mid + 1;
    Here, we are not taking -> start = mid; cuz if that would be the case, case 1 & case 2 would have already
    caught that. so we are ignoring  start = mid;
 */
