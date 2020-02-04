package academy.boostprogramme.java.week1.set1;

public class WateringMachines {
    public static void main(String[] args) {
        int numbPlantsInGarden = 3;
        int numbPlantsToBuy = 9;
        int totalPlants = numbPlantsInGarden + numbPlantsToBuy;
        int numbWateringMachineInGarden = 1;
        int capacityOfTheWateringMachine = 4;

        int numberOfWateringMachineToBuy = (totalPlants / capacityOfTheWateringMachine) - numbWateringMachineInGarden;

        System.out.println("The number of Watering Machine to buy is: " + numberOfWateringMachineToBuy);

        int price = 20;
        int discount = 20;
        int discountProMachine = (discount * price) / 100;
        int finalCost = (price - discountProMachine) * numberOfWateringMachineToBuy;


        System.out.println("The saving is: " + discountProMachine + " €");
        System.out.println("The final cost is: " + finalCost + " €");

    }
}
