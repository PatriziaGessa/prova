package academy.boostprogramme.java.week5.set1.exercise3;

import java.util.List;
import java.util.Optional;

public class IntegerListAverageCalculator {

    public Optional<Double> calculate (List<Integer> numbers) {
        if(numbers.isEmpty()) {
            return Optional.empty();
        }
        int total = 0;
        for(int numb : numbers) {
            total += numb;
        }
        double average = total / numbers.size();
        return Optional.of(average);
    }
}
