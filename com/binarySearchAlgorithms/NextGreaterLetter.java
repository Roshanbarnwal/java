package com.binarySearchAlgorithms;
/*
744. Find Smallest Letter Greater Than Target
Given a characters array letters that is sorted in non-decreasing order and a character target,
return the smallest character in the array that is larger than target.

Note that the letters wrap around.
For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 */
public class NextGreaterLetter {
    public static void main(String[] args){
        char[] letters = {'c','c','c','k','m','o','r','u'};
        char target = 'c';      //corner case: target > 'z'
        String name = "roshan";
        //converting string to character arrays and accessing through indexing.
        System.out.println(name.toCharArray()[0]);

        char ans = nextGreatestLetter(letters,target);
        System.out.println("The smallest letter greater than "+target+" in the char array is '"+ ans+"'");
    }

    static char nextGreatestLetter(char[] letters,char target){
        int start = 0;
        int end = letters.length - 1;
//        if(target > letters[end] && target <= 'z'){
//            return letters[0];
//        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(letters[mid] == target){
                start = mid + 1;
                while(letters[start] == target){
                    start++;
                }
                break;
            }
            else if(letters[mid] < target){
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        int index = start % letters.length;
//        return letters[start];
        return letters[index];
    }
}
/*
start = end + 1 =>
we can remove the check condition for letter greater than greatest letter in letters by using the modulo.
simply speaking, we can counter the wrap constraints of the question using modulo.
 */


