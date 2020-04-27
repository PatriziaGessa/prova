package academy.boostprogramme.java.week7.set2.exercise5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HappinessSpecialFiveFinderTest {

    HappinessSpecialFiveFinder fiveFinder = new HappinessSpecialFiveFinder();

    @Test
    void findFiveFinder() {
        List<String> result = fiveFinder.findFiveFinder();

        List<String> expected = List.of("Country: Burkina Faso Rank: 134",
                "Country: Afghanistan Rank: 141",
                "Country: Madagascar Rank: 144",
                "Country: South Sudan Rank: 147",
                "Country: Central African Republic Rank: 155");
        assertEquals(expected, result);
    }
}