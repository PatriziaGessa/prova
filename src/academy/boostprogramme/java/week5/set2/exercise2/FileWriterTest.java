package academy.boostprogramme.java.week5.set2.exercise2;

import academy.boostprogramme.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileWriterTest {

    FileWriter fileWriter = new FileWriter();
    FileReader fileReader = new FileReader();

    String path = "src/academy/boostprogramme/java/week5/set2/file/write.txt";

    @Test
    void write() {
        List<String> input = List.of("Hello Word");

        fileWriter.write(path, input);

        List<String> result = fileReader.read(path);
        Assertions.assertEquals(input, result);
    }

    @Test
    void append() {
        List<String> first = List.of("Say", "Hello");
        List<String> second = List.of("!");

        fileWriter.write(path,first);
        fileWriter.write(path,second);
        List<String> result = fileReader.read(path);

        List<String> expected = List.of("!");
        Assertions.assertEquals(expected, result);
    }
}
