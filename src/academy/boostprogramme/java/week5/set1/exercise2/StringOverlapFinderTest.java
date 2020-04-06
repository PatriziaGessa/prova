package academy.boostprogramme.java.week5.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StringOverlapFinderTest {

    StringOverlapFinder stringOverlapFinder = new StringOverlapFinder();

    @ParameterizedTest
    @CsvSource({
            "he, hello, hei",
    })
    void find(String expected, String first, String second) {
        Optional<String> oResult = stringOverlapFinder.find(first, second);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());

    }
}



