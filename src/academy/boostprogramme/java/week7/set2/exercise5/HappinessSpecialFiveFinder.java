package academy.boostprogramme.java.week7.set2.exercise5;

import academy.boostprogramme.java.week5.set2.exercise4.HappinessRecord;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessSpecialFiveFinder {

    private academy.boostprogramme.java.week5.set2.exercise4.HappinessDataReader dataReader = new academy.boostprogramme.java.week5.set2.exercise4.HappinessDataReader();

    public List<String> findFiveFinder() {
        return dataReader.read().stream()
                .filter(record -> record.getCountry().contains("a") || record.getCountry().contains("A"))
                .filter(dataReader -> dataReader.getCountry().length() > 9)
                .sorted(Comparator.comparing(HappinessRecord::getScore))
                .limit(5)
                .sorted(Comparator.comparing(HappinessRecord::getScore).reversed())
                .map(record -> "Country: " + record.getCountry() + " Rank: " + record.getRank())
                .collect(Collectors.toList());
    }

}
