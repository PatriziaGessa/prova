package academy.boostprogramme.java.week7.set2.exercise4;

import academy.boostprogramme.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileLineAppenderTest {

    FileLineAppender fileLineAppender = new FileLineAppender();
    FileReader fileReader = new FileReader();

    String path = "src/academy/boostprogramme/java/week7/set2/files/write.txt";

    @Test
    void append() {

        String firstLine = "This is line 1";
        String secondLine = "This is line 2";

        fileLineAppender.append(path,firstLine);
        fileLineAppender.append(path,secondLine);
        List<String> result = fileReader.read(path);

        List<String> expected = List.of("This is line 1","This is line 2");
        Assertions.assertEquals(expected,result);

    }

    @AfterEach
    void deleteFile() {
        try {
            Files.deleteIfExists(Path.of(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}