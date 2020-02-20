package academy.boostprogramme.java.week2.reflaction.exercise1;

public class Application {

    public static void main(String[] args) {
       Product milk = new Product("Milk", 0.99);
       Product butter = new Product("Butter", 1.99);

       double milkPriceProduct = milk.getPrice();
       milk.setPrice(1.01);


       CartItem item1 = new CartItem(milk,2);
       CartItem item2 = new CartItem(butter, 1);

       int quantity = item1.getQuantity();
       item1.setQuantity(2);











    }
}
