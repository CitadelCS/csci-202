package edu.citadel.csci202.recursion.old;

public class PrimeChecker {

    // Returns 0 if value is not prime, 1 if value is prime
    public static int isPrime(int testVal, int divVal) {
        // Base case 1: 0 and 1 are not prime, testVal is not prime
        if(testVal == 0 || testVal == 1) {
            return 0;
        }
        // Base case 2: testVal only divisible by 1, testVal is prime
        else if(divVal == 1) {
            return 1;
        }
        else if(testVal % divVal ==  0) {
            return 0;
        }
        else {
            return isPrime(testVal, (--divVal));
        }


    }

    public static void main(String[] args) {
        int primeCheckVal = 0; // Value checked for prime

        // Check primes for values 1 to 10
        for (primeCheckVal = 1; primeCheckVal <= 10; ++primeCheckVal) {
            if (isPrime(primeCheckVal, (primeCheckVal - 1)) == 1) {
                System.out.println(primeCheckVal + " is prime.");
            }
            else {
                System.out.println(primeCheckVal + " is not prime.");
            }
        }
    }
}