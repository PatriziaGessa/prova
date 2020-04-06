package academy.boostprogramme.java.week5.set2.exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileWriter {

    public void write(String contentRootPath, List<String> lines) {
        Path path = Path.of(contentRootPath);
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void append(String contentRootPath, List<String> lines) {
        Path path = Path.of(contentRootPath);
        try {
            Files.write(path, lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
