package academy.boostprogramme.java.week1.set1;

public class Test {
    public static void main(String[] args) {
        int plantsInGarden = 3;
        int plantsToBuy = 9;
        int totalPlants = plantsInGarden + plantsToBuy;
        int numberMachine = 1;
        int capacityOfTheMachine = 4;
        int numberOfWateringMachinesToBuy = (totalPlants / capacityOfTheMachine) - numberMachine;


        System.out.println("The number is "+ numberOfWateringMachinesToBuy);

    }

}






