package academy.boostprogramme.java.week1.set2;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.ArrayList;


public class CombosLists {
    public static List<String> combine(List<String> firstList, List<String> secondList) {
        List<String> combo = new ArrayList<>();

        while (firstList.size() > 0 || secondList.size() > 0) {
            if (firstList.size() > 0) {
                String word = firstList.get(0);
                firstList.remove(0);
                combo.add(word);
            }
            if (secondList.size() > 0) {
                String word = secondList.get(0);
                secondList.remove(0);
                combo.add(word);
            }
        }
        return combo;
    }

    public static void main(String[] args) {
        List<String> numbsInLettersOne = new ArrayList<>();
        numbsInLettersOne.add("one");
        numbsInLettersOne.add("three");
        numbsInLettersOne.add("five");
        List<String> numbsInLettersTwo = new ArrayList<>();
        numbsInLettersTwo.add("two");
        numbsInLettersTwo.add("four");

        List<String> combosLists = combine(numbsInLettersOne, numbsInLettersTwo);
        for (String numb : combosLists) {
            System.out.println(numb);

        }


    }


}
