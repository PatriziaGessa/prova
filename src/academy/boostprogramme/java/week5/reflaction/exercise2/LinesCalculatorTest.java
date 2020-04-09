package academy.boostprogramme.java.week5.reflaction.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinesCalculatorTest {

    LinesCalculator calculator = new LinesCalculator();
    @Test
    void calculateReturnsEmptyListForEmptyEntry() {
        List<String> input = List.of();
        List<String> result = calculator.calculate(input);
        Assertions.assertEquals(List.of(), result);
    }
    @Test
    void calculateReturnsEmptyListFor() {
        List<String> input = List.of("1");
        List<String> result = calculator.calculate(input);
        Assertions.assertEquals(List.of(), result);
    }
    @Test
    void calculateReturnsSumForPositiveString() {
        List<String> input = List.of("1,2,3,4","1234");
        List<String> result = calculator.calculate(input);
        Assertions.assertEquals(List.of("1244"), result);
    }
    @Test
    void calculateReturnsSumForNegativeAndPositiveString() {
        List<String> input = List.of("-2,-1,-4,3", "3,-4,5,6,-7");
        List<String> result = calculator.calculate(input);
        Assertions.assertEquals(List.of("-1"),result);
    }

}