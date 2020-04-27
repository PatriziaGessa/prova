package academy.boostprogramme.java.week7.set2.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamFileReader {

    public Stream<String> readLines(String contentPathRoot){
        Path path = Path.of(contentPathRoot);
        try{
            return  Files.lines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return Stream.empty();
        }
    }
}
