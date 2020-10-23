package at.selott.codetrivia.problem.impl.euler;

import at.selott.codetrivia.problem.Problem;

public class BigPrime implements Problem<Integer> {
    @Override
    public Integer solve() {

        int num = 1, count = 0, i;

        while (count < 10_001) {
            num = num + 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num)
                count = count + 1;

        }
        return num;
    }

    @Override
    public void displaySolution() {
        System.out.println("10001st prime number -> " + solve());
    }
}
