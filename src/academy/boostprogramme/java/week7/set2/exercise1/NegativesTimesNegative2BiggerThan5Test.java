package academy.boostprogramme.java.week7.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;

public class NegativesTimesNegative2BiggerThan5Test {
    
    @Test
    void test() {

        List<Double> numbers = List.of(1.2, 0.4, -0.1, -2.0, -3.1, 2.0, -2.6);

        long result = numbers.stream()
                .filter(number -> number < 0)
                .map(number -> number * -2)
                .filter(number -> number > 5).count();

        long expected = 2;
        Assertions.assertEquals(expected,result);
    }


}
 