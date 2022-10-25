package com.binarySearchAlgorithms;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//mountain array is first ascending sorted then descending sorted so using binary search
public class MountainArray {
    public static void main(String[] args){
        int[] arr = {0,6,10,51,200};
        int index = peakIndexInMountainArray(arr);
        System.out.println(arr[index]);
    }
//assuming no duplicates are present in the array
    //not sure but in binary search, at least once, start will be equal to end. If it is true, then according to
    //our algo here, s != e will be the loop breakage.
    static int peakIndexInMountainArray(int[] arr) {
        int s = 0,e = arr.length - 1;
        while(s != e){
            int m = s + (e-s)/2;
            if(arr[m] < arr[m+1])   //arr[<=m] won't be the answer and u r in ascending part of the array
                s = m + 1;
            else if(arr[m] > arr[m+1])  //arr[m] might be the possible ans but we need to check arr[<m]
                e = m ;
        }
        return e;
    }
    /*
    in the end, start == end and pointing to the largest number because of the 2 checks above
    start and end are always trying to find max element in the above 2 checks hence, when they
    are pointing to just one element, that is the max one because that is what the checks say.

    more elaborations: at every point of time for start and end, they have the best possible answer till that
    time and if we are saying that only one item is remaining, hence cuz of above line that is the
    best possible ans.
     */
}
