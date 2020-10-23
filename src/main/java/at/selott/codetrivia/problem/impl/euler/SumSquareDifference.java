package at.selott.codetrivia.problem.impl.euler;

/*
    The sum of the squares of the first ten natural numbers is,

        1^2 + 2^2 + ... + 10^2 = 385

    The square of the sum of the first ten natural numbers is,

        (1+2+...+10)^2 = 55^2 = 3205

    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

        3025 - 385 = 2640

    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

 */

import at.selott.codetrivia.problem.Problem;

import java.util.stream.IntStream;

public class SumSquareDifference implements Problem<Integer> {
    @Override
    public Integer solve() {

        int squares = IntStream.rangeClosed(0, 100).map(num -> num*num).sum();
        int squareSum = IntStream.rangeClosed(0, 100).sum() * IntStream.rangeClosed(0, 100).sum();

        return squareSum - squares;

    }

    @Override
    public void displaySolution() {
        System.out.println("Sum-Square difference of first 100 nums -> " + solve());
    }
}
