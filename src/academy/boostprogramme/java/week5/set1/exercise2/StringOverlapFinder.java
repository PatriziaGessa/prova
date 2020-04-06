package academy.boostprogramme.java.week5.set1.exercise2;

import java.util.List;
import java.util.Optional;

public class StringOverlapFinder {

    public Optional<String> find (String first, String second) {
        String trimFirst = first.trim();
        String trimSecond = second.trim();
        if(first.isEmpty() || second.isEmpty()) {
            return Optional.empty();
        }
        List<String> spiltFirst = List.of(trimFirst.split(""));
        List<String> splitSecond = List.of(trimSecond.split(""));
        StringBuilder similar = new StringBuilder();
        String letter = spiltFirst.get(0);
        for(int i = 1; i < spiltFirst.size(); i++) {
            String character = splitSecond.get(0);
            for (int a = 1; a < splitSecond.size(); a++) {
                if(character.equals(letter)){
                    similar.append(character);
                }
            }
        } return Optional.of(similar.toString());
    }
}
