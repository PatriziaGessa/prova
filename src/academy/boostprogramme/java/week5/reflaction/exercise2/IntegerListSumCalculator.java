package academy.boostprogramme.java.week5.reflaction.exercise2;

import java.util.List;
import java.util.Optional;

public class IntegerListSumCalculator {

    public Optional<Integer> calculate (List<Integer> integers) {
        if(integers.isEmpty() || integers.size() < 2) {
            return Optional.empty();
        }
        int sum = 0;
        for(Integer integer : integers) {
            sum +=integer;
        }

        return Optional.of(sum);
    }



}
