package academy.boostprogramme.java.week1.set2.exercise1;

import java.util.Scanner;

public class RoboDogPuppy {
    public static int calculateJumps(int food) {
        return food * 6;
    }

    public static int calculateBarks (int food) {
        return food + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Woof food I get today?");
        int food = scanner.nextInt();
        int numbOfJumps = calculateJumps(food);
        int numbOfBarks = calculateBarks(food);
        System.out.println("I will jump " + numbOfJumps + " times and bark " + numbOfBarks + " times!");

    }

}
