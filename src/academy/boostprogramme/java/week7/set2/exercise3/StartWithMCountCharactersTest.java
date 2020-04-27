package academy.boostprogramme.java.week7.set2.exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StartWithMCountCharactersTest {


    @Test
    void test() {

        List<String> names = List.of("Mary”, “Joe”, “Max”, “Laura");

        int result = names.stream()
                .filter(name -> name.startsWith("M"))
                .map(String::length)
                .reduce(0,Integer::sum);

    }
}
