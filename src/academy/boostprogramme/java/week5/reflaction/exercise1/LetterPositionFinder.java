package academy.boostprogramme.java.week5.reflaction.exercise1;

import java.util.List;
import java.util.Optional;

public class LetterPositionFinder {

    public Optional<Integer> find (String word, String letter) {
        if(letter.isEmpty()){
            return Optional.empty();
        }
        String replaced = word.replaceAll(" ", "");
        List<String> characters = List.of(replaced.split(""));

        int position = 0;
        for(String character : characters) {
            if(character.equalsIgnoreCase(letter)){
                return Optional.of(position);
            }
            position++;
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        String word = "D e L T a";
        String replaced = word.replaceAll(" ", "");
        int length = replaced.length();
        System.out.println(length);
    }


}
