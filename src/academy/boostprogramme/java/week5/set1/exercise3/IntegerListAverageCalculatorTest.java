package academy.boostprogramme.java.week5.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListAverageCalculatorTest {

    IntegerListAverageCalculator integerListAverageCalculator = new IntegerListAverageCalculator();

    @Test
    void calculateReturnsEmptyOptionalForEmptyList() {
        List<Integer> input = List.of();
        Optional<Double> oResult = integerListAverageCalculator.calculate(input);
        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void calculateReturnsCorrectOptionalAverageForNegativeNumbers() {
        List<Integer> input = List.of(-18, -16, -5, -3, -0);
        double expected = -8.0;
        Optional<Double> oResult = integerListAverageCalculator.calculate(input);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void calculateReturnsCorrectOptionalAverageForPositiveNumbers() {
        List<Integer> input = List.of(8, 19, 5, 90, 76);
        double expected = 39.0;
    }

}