package academy.boostprogramme.java.week5.reflaction.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListSumCalculatorTest {

    IntegerListSumCalculator sumCalculator = new IntegerListSumCalculator();


    @Test
    void calculateReturnsEmptyOptionalForListWithOneEntry() {
        List<Integer> integers = List.of(1);
        Optional<Integer> oResult = sumCalculator.calculate(integers);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void calculateReturnsZeroForEmptyList() {
        List<Integer> integers = List.of();
        Optional<Integer> oResult = sumCalculator.calculate(integers);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void calculateReturnsOptionalSumForPositiveEntries() {
        List<Integer> integers = List.of(1,2,3,4,5);
        int expected = 15;

        Optional<Integer> oResult = sumCalculator.calculate(integers);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected,oResult.get());
    }

    @Test
    void calculateReturnsOptionalSumForNegativeEntries() {
        List<Integer> integers = List.of(-2,-7,-6,-9,-1);
        int expected = -25;

        Optional<Integer> oResult = sumCalculator.calculate(integers);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected,oResult.get());
    }

    @Test
    void calculateReturnsOptionalSumWithPositiveAndNegativeEntries() {
        List<Integer> integers = List.of(18,90,-7,2,-3,12,32,-1);
        int expected = 143;

        Optional<Integer> oResult = sumCalculator.calculate(integers);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected,oResult.get());

    }
}