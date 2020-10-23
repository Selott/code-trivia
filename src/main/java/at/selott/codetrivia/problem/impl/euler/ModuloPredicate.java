package at.selott.codetrivia.problem.impl.euler;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class ModuloPredicate implements IntPredicate {

    int limit;
    public ModuloPredicate(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean test(int value) {
        AtomicBoolean ret = new AtomicBoolean(true);
        IntStream is = IntStream.rangeClosed(1, limit);
        is.forEach(num -> {
            if(value % num != 0) {
                ret.set(false);
            }
        });

        return ret.get();
    }
}
