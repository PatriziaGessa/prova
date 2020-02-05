package academy.boostprogramme.java.week1.set2.exercise3;

import java.util.*;

public class BigAndSmall {
    public static boolean isBigger(int numbOne, int numbTwo) {
        return numbOne > numbTwo;
    }

    public static boolean isSmaller(int numbOne, int numbTwo) {
        return numbOne < numbTwo;
    }

    public static int getBiggest(List<Integer> list) {
        int bigNumb = list.get(0);

        for (int numb : list) {
            if (isBigger(numb, bigNumb)) {
                bigNumb = numb;
            }

        }
        return bigNumb;

    }

    public static int getSmaller(List<Integer> list) {
        int smallNumb = list.get(0);

        for (int numb : list) {
            if (isSmaller(numb, smallNumb)) {
                smallNumb = numb;
            }
        }
        return smallNumb;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-1, 4, 3, 0, 5, 2);

        int bigNumb = getBiggest(numbers);
        int smallerNumb = getSmaller(numbers);

        System.out.println("The biggest numb is: " + bigNumb);
        System.out.println("The smallest numb is: " + smallerNumb);


    }
}
