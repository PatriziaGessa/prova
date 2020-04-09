package academy.boostprogramme.java.week5.reflaction.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegersParserTest {

    StringToIntegersParser parser = new StringToIntegersParser();

    @Test
    void parseReturnsEmptyListForEmptyEntries() {
        String input = "";

        List<Integer> result = parser.parse(input);

        Assertions.assertEquals(List.of(), result);
    }

    @Test
    void parseReturnsSingleEntryFor() {
        String input = "5";

        List<Integer> result = parser.parse(input);

        Assertions.assertEquals(List.of(5), result);
    }

    @Test
    void parseReturnsMultipleEntriesFor() {
        String input = "2;3;4;-2;5";

        List<Integer> result = parser.parse(input);

        Assertions.assertEquals(List.of(2,3,4,-2,5), result);
    }
}