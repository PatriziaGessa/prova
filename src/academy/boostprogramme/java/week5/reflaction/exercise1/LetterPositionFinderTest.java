package academy.boostprogramme.java.week5.reflaction.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LetterPositionFinderTest {

    LetterPositionFinder letterPositionFinder = new LetterPositionFinder();

    @ParameterizedTest
    @CsvSource({
            "3, alpha, h",
            "0, beta, B",
            "6, ga/142mm?a, m",
            "4, D e L T a, A",

    })
    void findReturnsOptionalPosition(int expected, String word, String letter) {
        Optional<Integer> oResult = letterPositionFinder.find(word,letter);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());

    }


}