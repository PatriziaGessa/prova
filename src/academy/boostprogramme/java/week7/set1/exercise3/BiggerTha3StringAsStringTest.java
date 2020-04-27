package academy.boostprogramme.java.week7.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ClientInfoStatus;
import java.util.List;
import java.util.stream.Collectors;

public class BiggerTha3StringAsStringTest {

    @Test
    void test() {
        List<Integer> numbs = List.of(0,1,2,3,4,5);

        List<String> result = numbs.stream()
                .filter(number -> number > 3)
                .map(Object::toString)
                .collect(Collectors.toList());

        List<String> expected = List.of("4", "5");
        Assertions.assertEquals(expected, result);
    }
}
