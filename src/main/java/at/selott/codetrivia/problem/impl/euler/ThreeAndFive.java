package at.selott.codetrivia.problem.impl.euler;

    /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.
    */

import at.selott.codetrivia.problem.Problem;

import java.util.stream.IntStream;

public class ThreeAndFive implements Problem<Integer> {



    @Override
    public Integer solve() {
        return IntStream.range(0, 1000).filter(num -> (num%3 == 0 || num%5== 0)).sum();
    }

    @Override
    public void displaySolution() {
        System.out.println("Sum of multiples of 3 and 5 below 1000 -> " + solve());
    }

}
