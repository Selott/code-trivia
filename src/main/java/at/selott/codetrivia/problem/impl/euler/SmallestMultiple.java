package at.selott.codetrivia.problem.impl.euler;

import at.selott.codetrivia.problem.Problem;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple implements Problem<Integer> {
    @Override
    public Integer solve() {
        OptionalInt oi = IntStream.range(20, Integer.MAX_VALUE).filter(new ModuloPredicate(20)).findFirst();
        if(oi.isPresent()) {
            return oi.getAsInt();
        }
        return -1;
    }

    @Override
    public void displaySolution() {
        System.out.println("Smallest positive number % 1-20 == 0 -> " + solve());
    }
}
