package academy.boostprogramme.java.week9.set1.exercise1;

import academy.boostprogramme.java.week8.set2.exercise3.Operator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalMovementScholarTest {

    AnimalMovementScholar movementScholar = new AnimalMovementScholar();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.of("walk,run"),"dog"),
                Arguments.of(Optional.of("jump,fly"),"Sparrow"),
                Arguments.of(Optional.of("fly,jump,swim,walk"),"bird"),
                Arguments.of(Optional.of("climb,fly,walk"),"Arthropod"),
                Arguments.of(Optional.empty(),""),
                Arguments.of(Optional.empty(),"text"),
                Arguments.of(Optional.empty(),"123")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void elaborate(Optional oExpected, String keyword) {
        Optional<String> oResult = movementScholar.elaborate(keyword);

        assertEquals(oExpected, oResult);
    }
}