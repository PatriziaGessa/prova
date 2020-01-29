package academy.boostprogramme.java.week1.set1;

public class WateringMachines {
    public static void main(String[] args) {
        int numbPlants = 3;
        int numbPlantsToBuy = 9;
        int numbTotalPlants = numbPlants + numbPlantsToBuy;
        int numbMachine = 1;
        int numbMachineCapacity = 4;
        int numberOfWateringMachinesToBuy = (numbPlantsToBuy/numbMachineCapacity) - numbMachine;

        int priceEachWateringMachines = 20;
        int discount = 20;
        int discountPrice = (priceEachWateringMachines * discount) / 100;
        int newPriceWithDiscount = priceEachWateringMachines - discountPrice;
        int finalCost = numberOfWateringMachinesToBuy * newPriceWithDiscount;

    System.out.println(finalCost);


    }

}
