package com.dsa1;

// Program to Convert a given Binary String to
// its equivalent decimal number

import java.lang.Math;
import java.util.Scanner;

class BinaryToDecimal {
    // convertToDec() Method
    // performs the conversion of
    // Binary to Decimal
    static int convertToDec(String bin)
    {
        int[] binArray = new int[1024];
        int eqv_dec = 0;

        // Converting characters of Binary String to
        // primitive integer and storing it in the Array in
        // reverse order!!
        for (int i = bin.length() - 1; i >= 0; i--) {
            binArray[i] = Character.getNumericValue(bin.charAt(i));
            System.out.println(binArray[i]);
        }

        // Evaluating Equivalent Decimal Number from the
        // Binary Array!!
        for (int i = 0; i < bin.length(); i++) {
            if (binArray[i] == 1) {
                eqv_dec += (int)Math.pow(2, bin.length() - 1 - i);
            }
            else
                continue;
        }
        return eqv_dec;
    }

    // Driver Code!
    public static void main(String[] args)
    {
        String bin = "1101";
        System.out.println("Given Binary: " + bin);
        int eqv_dec = convertToDec(bin);
        System.out.println("Equivalent Decimal Number: "
                + eqv_dec);
    }
}

