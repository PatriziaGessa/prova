package academy.boostprogramme.java.week7.set2.exercise5;

import academy.boostprogramme.java.week5.set2.exercise4.HappinessDataParser;
import academy.boostprogramme.java.week5.set2.exercise4.HappinessRecord;
import academy.boostprogramme.java.week7.set2.exercise4.StreamFileReader;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HappinessDataReader {

    private StreamFileReader fileReader = new StreamFileReader();
    private HappinessDataParser parser = new HappinessDataParser();
    private String file = "src/academy/boostprogramme/java/week5/set2/file/world-happiness-2017.csv";

    public List<HappinessRecord> read() {
        return fileReader.readLines(file)
                .skip(1)
                .map(line -> parser.parseLine(line))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

}
