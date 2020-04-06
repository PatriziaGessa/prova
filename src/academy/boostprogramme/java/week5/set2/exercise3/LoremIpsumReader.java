package academy.boostprogramme.java.week5.set2.exercise3;

import academy.boostprogramme.java.week5.set2.exercise1.FileReader;

import java.util.List;

public class LoremIpsumReader {

    private FileReader fileReader = new FileReader();
    String contentRootPath = "src/academy/boostprogramme/java/week5/set2/file/lorem-ipsum.txt";

    public List<String> read() {

        return fileReader.read(contentRootPath);
    }
}
