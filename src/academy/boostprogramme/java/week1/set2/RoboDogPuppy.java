package academy.boostprogramme.java.week1.set2;
import java.util.Scanner;


public class RoboDogPuppy {
    public static int calculateJumps(int food) {
        int numbTimes = 6 * food;
        return numbTimes;
    }

    public static int calculateBarks(int food) {
        int numbTimes = 1 + food;
        return numbTimes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Woof food do I get today?");
            int food = scanner.nextInt();
            // click on IntelliJ terminal and enter number
         //   int food = 1;
            int numbOfJumps = calculateJumps(food);
            int numbOfBarks = calculateBarks(food);
        System.out.println("I will jump " + numbOfJumps + " times and bark " + numbOfBarks + " times!");

    }

}
