package com.rahul;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";

        if(result.equals("hit")){
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}

class SimpleDotCom{
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for(int cell:locationCells){
            if(guess == cell){
                result = "hit";
                numOfHits ++;
                break;
//                System.out.println(result);
            }//end if
//            if(guess != cell){
//                result = "miss";
//                System.out.println(result);
//            }
        }//end for
        if(numOfHits == locationCells.length){
            result = "kill";
        }//end if

        System.out.println(result);
        return result;
    }//end of checkYourself method
}
