package com.bitWiseOperator;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/
class FlipAndInvertImage {
    public static void main(String[] args){
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(image);
        for(int[] i : image){
            System.out.println(Arrays.toString(i));
        }
        //kunal's
        flipAndInvertImage1(image);
        for(int[] i : image){
            System.out.println(Arrays.toString(i));
        }
    }
    static int[][] flipAndInvertImage1(int[][] image){
        for(int[] row: image){
            //reverse this array & xor
            for(int i=0; i < (image[0].length + 1) / 2; i++){
                //swap
                int tmp = row[i] ^ 1;
                row[i] = row[image[0].length -i - 1]^1;
                row[image[0].length - i - 1] = tmp;
            }
        }
        return image;
    }
    static int[][] flipAndInvertImage(int[][] image) {
        reverse(image);
        //foreach loop gets a copy of an element so no changes is made on the real arr.
//        for(int[] i: image){
//            for(int j : i){
//                j ^=1;
//            }
//        }
        for(int i=0; i<image.length; i++){
            for(int j=0; j < image[i].length; j++){
                image[i][j] ^= 1;
            }
        }
        return image;
    }
    //reversing each row element
    static void reverse(int[][] arr){
        for(int i=0; i<arr.length; i++){
            int s= 0,e=arr[i].length-1;
            while(s <= e){
                int tmp = arr[i][s];
                arr[i][s] = arr[i][e];
                arr[i][e] = tmp;
                s++;
                e--;
            }

        }
    }
}