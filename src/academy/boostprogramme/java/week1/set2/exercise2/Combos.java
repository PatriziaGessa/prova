package academy.boostprogramme.java.week1.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Combos {
    public static List<String> combine (List<String> listOne, List<String> listTwo) {
        List<String> combos = new ArrayList<>();

        while (listOne.size() > 0 || listTwo.size() > 0) {
            if(listOne.size() > 0 ) {
                String word = listOne.get(0);
                listOne.remove(0);
                combos.add(word);
            }
            if (listTwo.size() > 0 ) {
                String word = listTwo.get(0);
                listTwo.remove(0);
                combos.add(word);
            }
        }
        return combos;
    }

    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>();
        listOne.add("one");
        listOne.add("three");
        listOne.add("five");

        List<String> listTwo = new ArrayList<>();
        listTwo.add("two");
        listTwo.add("four");

        List<String> combos = combine(listOne, listTwo);

        for(String numb : combos) {
            System.out.println(numb);
        }
    }


}
