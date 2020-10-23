package at.selott.codetrivia.problem.impl.util;

import java.util.function.LongSupplier;

public class FibonacciSupplier implements LongSupplier {

    long previous = 0, current = 1;

    @Override
    public long getAsLong() {
        long result = current;
        current += previous;
        previous = result;
        return result;
    }


}
