package academy.boostprogramme.java.week7.set2.exercise5;

import academy.boostprogramme.java.week5.set2.exercise4.HappinessDataReader;
import academy.boostprogramme.java.week5.set2.exercise4.HappinessRecord;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessTopThreeFinder {

    private HappinessDataReader reader = new HappinessDataReader();

    public List<String> findTopThree() {
        return reader.read().stream()
                .sorted(Comparator.comparing(HappinessRecord::getScore).reversed())
                .limit(3)
                .map(record -> "Country: " + record.getCountry() + " Score: " + record.getScore())
                .collect(Collectors.toList());
    }
}
