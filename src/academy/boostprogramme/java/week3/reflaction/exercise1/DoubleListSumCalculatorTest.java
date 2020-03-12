package academy.boostprogramme.java.week3.reflaction.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListSumCalculatorTest {

    DoubleListSumCalculator doubleListSumCalculator = new DoubleListSumCalculator();


    @ParameterizedTest
    @CsvSource({

            "7.95, 1.53, 2.06, -4.36 ",


    })

    void calculate(double expected, List<Double> numbs) {

        double result = doubleListSumCalculator.calculate(numbs);

        Assertions.assertEquals(expected, result);
    }
}