package academy.boostprogramme.java.week7.set2.exercise4;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StreamFileReaderTest {

    StreamFileReader streamFileReader = new StreamFileReader();


    @Test
    void readLines() {

        String path = "src/academy/boostprogramme/java/week7/set2/files/document.txt";
        List<String> result = streamFileReader.readLines(path)
                .collect(Collectors.toList());

        List<String> expected = List.of(
                "line 1;part 1-2",
                "line 2;part 2-2",
                "line 3;part 3-2");
        assertEquals(expected,result);
    }
}