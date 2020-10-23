package at.selott.codetrivia;


import at.selott.codetrivia.problem.Problem;
import at.selott.codetrivia.problem.impl.euler.*;
import at.selott.codetrivia.problem.impl.util.FibonacciSupplier;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Codetrivia {

    private static final Set<Problem<?>> trivia = new LinkedHashSet<>();

    public static void main(String[] args) {

        trivia.add(new ThreeAndFive());
        trivia.add(new EvenFibonacci());
        trivia.add(new LargestPrimeFactor());
        trivia.add(new LargestPalindrome());
        //TODO: make async -> trivia.add(new SmallestMultiple());

        trivia.forEach(Problem::displaySolution);

    }


}
