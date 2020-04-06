package academy.boostprogramme.java.week5.set1.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DoubleListMaximumFinder {

    public Optional<Double> find (List<Double> numbers) {
        if(numbers.isEmpty()) {
            return Optional.empty();
        }
        List<Double> sortNumber = new ArrayList<>(numbers);
        Collections.sort(sortNumber);
        Collections.reverse(sortNumber);
        double bigger = sortNumber.get(0);
        return Optional.of(bigger);
    }
}
