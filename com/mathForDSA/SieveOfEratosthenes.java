package com.mathForDSA;
public class SieveOfEratosthenes {
    public static void main(String[] args){
        int num = 37;
        System.out.println(isPrime(38));
        boolean[] primes = sieve(num);//false is prime number
        for(int i=2; i<primes.length; i++){     //0 & 1 are not prime
            if(!primes[i])
                System.out.print(i + " ");
        }
    }

    static boolean[] sieve(int num){
        boolean[] primes = new boolean[num + 1];//an array of boolean where each index represents number <= num
        //by default, all index will be false. So say, all false index are prime numbers. Now we need to invert the
        //index if the number is not prime
        for(int i=2; i*i <= num; i++){  // 0 & 1 are not prime
            if(!primes[i]){     //if the index is false
                for(int j = i*2; j<= num; j += i){  //iterate through multiple of 'i' but not 'i' itself
                    primes[j] = true;   //invert the multiple of 'i' as it is not prime 'cuz it has factors.
                }
            }
        }
        return primes;
    }

    static boolean isPrime(int num){
        for(int i=2; i*i <= num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
/*
Sieve of Eratosthenes is a method of finding the prime numbers between 0 and N. We can also find by iterating
through each number & checking if it is prime or not but in that case, it takes O(n(sqrt(n))).
SieveOfEratosthenes has some auxiliary space complexity i.e. O(N) but the iteration method doesn't have any.

 Time Complexity :- O(Nlog(logN))
 inner loop is running N / i times. outer loop is running N times.
 So for inner loops:- N/2 + N/3 + N/5 + N/7 + ... = log(logN) solved by prime harmonic series & taylor's series
 Here, in the code, outer loop is running sqrt(N) but the time complexity says otherwise. I don't understand this.
 */
