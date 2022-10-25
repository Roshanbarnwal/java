package com.binarySearchAlgorithms;
//solution of someone from leetcode
public class NextGreatestLetter2 {
    public static void main(String[] args){
        char[] letters = {'c','c','c','k','m','o','r','u'};
        char target = 'c';
        char ans = nextGreatestLetter(letters,target);
        System.out.println("The smallest letter greater than "+target+" in the char array is '"+ ans+"'");

    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int s = 0, e = letters.length-1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(letters[m] <= target ){
                s=m+1;
            }
            else {
                e = m -1;
            }
        }
        return letters[(s)%letters.length];
    }
}
