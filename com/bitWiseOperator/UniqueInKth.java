package com.bitWiseOperator;

public class UniqueInKth {
    public static void main(String[] args){
        int[] arr = {2,2,6,2,7,7,8,7,8,8};
        System.out.println(unique(arr,3));
    }

    static int unique(int[] arr,int k){
        int n = arr.length;//size of array
        int Int_size = Integer.SIZE;
        int[] count = new int[Int_size];
        //calculating the count of 1 in ith bit of every element in the arr through O(N)
        for(int i=0; i<Int_size; i++){  //iterating from 1th to 32th bit
            for(int j=0; j<n; j++){ //checking (i+1)th bit of all elements of arr.
                //if (i+1)th bit is '1' then count[i]++. SO how to find if (i+1)th bit of a number contains
                //'1' or '0'? By & operator
                if((arr[j] & (1 << i)) != 0)
                    count[i] += 1;  //(i+1)th bit from right side of a binary is stored in (i+1)th index with
                                    //base value of 2^i.
            }
        }
        //We know, 2^i = 1 << i;  //just like in creating mask number
        int ans = 0;
        for(int i=0; i<Int_size; i++){
            //finding if the index contains any bit from unique number or not by modulo operator & multiplying
            //it with its base value and adding subsequently as well to find the number.
            ans += (count[i] % k) * (1 << i);
        }

        return ans;
    }
}
