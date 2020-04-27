package academy.boostprogramme.java.week7.set2.exercise5;

import academy.boostprogramme.java.week7.set2.exercise5.HappinessTopThreeFinder;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HappinessTopThreeFinderTest {

    HappinessTopThreeFinder topThreeFinder = new HappinessTopThreeFinder();

    @Test
    void findTopThree() {
        List<String> result = topThreeFinder.findTopThree();

        List<String> expected = List.of(
                "Country: Norway Score: 7.53700017929077",
                "Country: Denmark Score: 7.52199983596802",
                "Country: Iceland Score: 7.50400018692017");
        assertEquals(expected, result);
    }
}