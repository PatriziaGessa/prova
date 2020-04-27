package academy.boostprogramme.java.week7.set2.exercise4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalsContainSTest {

    String animals = "src/academy/boostprogramme/java/week7/set2/files/animals.txt";
    String animalsS_Path = "src/academy/boostprogramme/java/week7/set2/files/animals-s.txt";
    String animals_Expected_Path = "src/academy/boostprogramme/java/week7/set2/files/animals-s-expected.txt";


    @Test
    void test() {

        StreamFileReader streamFileReader = new StreamFileReader();
        FileLineAppender fileLineAppender = new FileLineAppender();

        streamFileReader.readLines(animals)
                .filter(animal -> animal.contains("s") || animal.contains("S"))
                .map(String::toUpperCase)
                .forEach(animal -> fileLineAppender.append(animalsS_Path,animal));

        List<String> result = streamFileReader.readLines(animalsS_Path)
                .collect(Collectors.toList());

        List<String> expected = streamFileReader.readLines(animals_Expected_Path)
                .collect(Collectors.toList());

        Assertions.assertEquals(expected,result);

    }

    @AfterEach
    void deleteFile() {
        try {
            Files.delete(Path.of(animalsS_Path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
