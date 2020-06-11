package academy.boostprogramme.java.week9.set2.exercise1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ChangeUnitCalculatorTest {

    ChangeUnitCalculator calculator = new ChangeUnitCalculator();


    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of(), 0),
                Arguments.of(List.of(new Cent1()), 0.01),
                Arguments.of(List.of(new Cent2()), 0.02),
                Arguments.of(List.of(new Cent5()), 0.05),
                Arguments.of(List.of(new Cent10()), 0.10),
                Arguments.of(List.of(new Cent20()), 0.20),
                Arguments.of(List.of(new Cent50()), 0.50),
                Arguments.of(List.of(new Euro1()), 1),
                Arguments.of(List.of(new Euro2()), 2),
                Arguments.of(List.of(new Euro5()), 5),
                Arguments.of(List.of(new Euro10()), 10),
                Arguments.of(List.of(new Euro20()), 20),
                Arguments.of(List.of(new Euro50()), 50),
                Arguments.of(List.of(new Euro100()), 100),
                Arguments.of(List.of(new Euro200()), 200),
                Arguments.of(List.of(new Cent50(), new Cent20(), new Cent10(),
                        new Cent5(), new Cent2(), new Cent1()), 0.88),
                Arguments.of(List.of(new Euro50(), new Euro20(), new Euro10(),
                        new Euro5(), new Euro2(), new Euro1()), 88),
                Arguments.of(List.of(new Euro50(), new Euro20(), new Euro10(),
                        new Euro5(), new Euro2(), new Euro1(),
                        new Cent50(), new Cent20(), new Cent10(), new Cent5(),
                        new Cent2(), new Cent1()), 88.88),
                Arguments.of(List.of(new Euro2(), new Euro2(), new Cent2(), new Cent2()), 4.04)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void calculate(List<MoneyUnit> expected, double amount) {
        List<MoneyUnit> result = calculator.calculate(amount);

        assertEquals(expected, result);
    }
}
