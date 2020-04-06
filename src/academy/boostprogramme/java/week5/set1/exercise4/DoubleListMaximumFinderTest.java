package academy.boostprogramme.java.week5.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListMaximumFinderTest {

    DoubleListMaximumFinder doubleListMaximumFinder = new DoubleListMaximumFinder();
    @Test
    void findReturnsEmptyOptionalForEmptyList() {
        List<Double> input = List.of();
        Optional<Double> oResult = doubleListMaximumFinder.find(input);
        Assertions.assertTrue(oResult.isEmpty());
    }
    @Test
    void findReturnsSingleOptionalEntryForListWithSingleNumber() {
        List<Double> input = List.of(9.9);
        double expected = 9.9;
        Optional<Double> oResult = doubleListMaximumFinder.find(input);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }
    @Test
    void findReturnsCorrectBiggestNumberForListWithPositiveEntries () {
        List<Double> input = List.of(9.7,5.7,3.6,0.9);
        double expected = 9.7;
        Optional<Double> oResult = doubleListMaximumFinder.find(input);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }
    @Test
    void findReturnsCorrectBiggestNumberForListWithNegativeEntries () {
        List<Double> input = List.of(-8.0,-6.5,-90.2,-4.5);
        double expected = -4.5;
        Optional<Double> oResult = doubleListMaximumFinder.find(input);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected,oResult.get());
    }



}