package academy.boostprogramme.java.week5.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoremIpsumReadTest {

    LoremIpsumRead loremIpsumRead = new LoremIpsumRead();

    @Test
    void readReturnsListLorem() {

        List<String> expected = List.of("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n" +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n" +
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n" +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        List<String> result = loremIpsumRead.read();

        Assertions.assertLinesMatch(expected, result);

    }
}