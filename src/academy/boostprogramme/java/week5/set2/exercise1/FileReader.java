package academy.boostprogramme.java.week5.set2.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<String> read(String contentRootPath) {
        Path path = Path.of(contentRootPath);
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
