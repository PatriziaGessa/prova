package academy.boostprogramme.java.week5.reflaction.exercise2;

import java.util.ArrayList;
import java.util.List;


public class StringToIntegersParser {

    public List<Integer> parse (String string) {
        if(string.isEmpty()) {
            return List.of();
        }

        List<Integer> integers = new ArrayList<>();
        List<String> splitString = List.of(string.split(";"));
        for(String numb : splitString) {
            int number = Integer.parseInt(numb);
            integers.add(number);
        }
        return integers;
    }
}
