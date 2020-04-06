package academy.boostprogramme.java.week5.set1.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DoubleListMinimumFinder {

    public Optional<Double> find (List<Double> numbers) {
        if(numbers.isEmpty()) {
            return Optional.empty();
        }
        List<Double> sortNumbers = new ArrayList<>(numbers);
        Collections.sort(sortNumbers);
        double smaller = sortNumbers.get(0);
        return Optional.of(smaller);
    }
}
