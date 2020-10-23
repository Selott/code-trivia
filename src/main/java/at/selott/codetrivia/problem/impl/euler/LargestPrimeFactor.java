package at.selott.codetrivia.problem.impl.euler;

import at.selott.codetrivia.problem.Problem;

/*
    The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?
*/

public class LargestPrimeFactor implements Problem<Long> {
    @Override
    public Long solve() {
        long maxPrime = -1;

        long n = 600851475143L;


        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
        }

        if (n > 2)
            maxPrime = n;

        return maxPrime;
    }

    @Override
    public void displaySolution() {
        System.out.println("Largest prime factor of 600851475143 -> " + solve());
    }
}
