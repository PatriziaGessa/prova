package academy.boostprogramme.java.week9.set1.exercise1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalKindScholarTest {

    AnimalKindScholar scholar = new AnimalKindScholar();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.empty(), ""),
                Arguments.of(Optional.empty(),"CAT"),
                Arguments.of(Optional.of("mammal"), "Dog"),
                Arguments.of(Optional.of("dog,gorilla"), "mammal"),
                Arguments.of(Optional.of("angelfish,salmon"), "fish"));
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void elaborate(Optional<String> oExpected, String keyword) {
        Optional<String> oResult = scholar.elaborate(keyword);
        
        assertEquals(oExpected,oResult);
    }
}