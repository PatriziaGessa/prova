package academy.boostprogramme.java.week3.reflaction.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PoundToEuroConverterTest {

    PoundToEuroConverter poundToEuroConverter = new PoundToEuroConverter();


    @ParameterizedTest
    @CsvSource({

            "1.53, 1.80 ",
            "4.335 , 5.10",
            "2.55, 3.0",

    })

    void convert(double expected, double pound) {

        double result = poundToEuroConverter.convert(pound);

        Assertions.assertEquals(expected, result);
    }
}