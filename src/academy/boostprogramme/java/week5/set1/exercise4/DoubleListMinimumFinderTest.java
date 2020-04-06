package academy.boostprogramme.java.week5.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListMinimumFinderTest {

    DoubleListMinimumFinder doubleListMinimumFinder = new DoubleListMinimumFinder();
    @Test
    void findReturnsEmptyOptionalForEmptyList() {
        List<Double> input = List.of();
        Optional<Double> oResult = doubleListMinimumFinder.find(input);
        Assertions.assertTrue(oResult.isEmpty());
    }
    @Test
    void findReturnsSingleOptionalForSingleEntry () {
        List<Double> input = List.of(5.6);
        double expected = 5.6;
        Optional<Double> oResult = doubleListMinimumFinder.find(input);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected,oResult.get());
    }
    @Test
    void findReturnsCorrectSmallerOptionalForListWithPositiveEntries () {
        List<Double> input = List.of(9.0,4.6,3.5,3.4);
        double expected = 3.4;
        Optional<Double> oResult = doubleListMinimumFinder.find(input);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }
    @Test
    void findReturnsCorrectSmallerOptionalForListWithNegativeEntries () {
        List<Double> input = List.of(-4.5,-6.3,-9.1,-5.5);
        double expected = -9.1;
        Optional<Double> oResult = doubleListMinimumFinder.find(input);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }
}