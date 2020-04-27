package academy.boostprogramme.java.week7.set2.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileLineAppender {

    public void append(String contentRootPath, String line) {
        Path path = Path.of(contentRootPath);
        List<String> lines = List.of(line);
        try {
            Files.write(path, lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
