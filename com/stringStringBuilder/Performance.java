package com.stringStringBuilder;

public class Performance {
    public static void main(String[] args){
        String series = "";
        System.out.println(series == (series + 1));
        String series1 = "";
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            int ch1 = (char)('a' + i);
//            char ch2 = 'a' + i;   //integer can't be converted to char implicitly
            series = series + ch;   //everytime new object is created & then left off after each iteration, leading
            series1 += ch1;         //to wastage of memory as there won't be any reference variable.
        }

        System.out.println(series);
        System.out.println(series1);
    }
}
/*
If I have a string and I add another string to it with the + operator, it allocates the necessary space,
copy over the original, and then copy over the appending string.
1 + 2 + 3 + 4 + ... + N :- each representing the size of strings that is copied  and time is proportional to the
length of the string, roughly N. Effectively, the command
                                    series = series + ch;
 operates like a loop of length N itself.

 https://www.quora.com/Does-string-concatenation-in-a-loop-have-a-run-time-of-O-N-squared
 */
