package academy.boostprogramme.java.week7.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class RoundDownToAbsoluteBiggerThan1Test {

    @Test
    void test() {
        Optional<Double> oResult = Stream.of(1.5,-1.8,3.5)
                .map(Math::floor)
                .map(Math::abs)
                .filter(number -> number > 1)
                .findFirst();

        double expected = 2;
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());



    }
}
