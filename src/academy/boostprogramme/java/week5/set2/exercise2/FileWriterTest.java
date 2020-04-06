package academy.boostprogramme.java.week5.set2.exercise2;

import academy.boostprogramme.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
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

        fileWriter.write(path,input);

        List<String> result = fileReader.read(path);
        Assertions.assertEquals(input, result);
    }

    @Test
    void append() {

        List<String> first = List.of("Hello Word");
        List<String> second = List.of("!");

        fileWriter.append(path,first);
        fileWriter.append(path,second);
        List<String> result = fileReader.read(path);

        List<String> expected = List.of("Hello Word", "!");
        Assertions.assertEquals(expected,result);
    }

    @AfterEach
    void after() {
        try {
            Files.delete(Path.of(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}