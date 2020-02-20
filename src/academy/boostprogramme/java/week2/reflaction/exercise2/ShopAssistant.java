package academy.boostprogramme.java.week2.reflaction.exercise2;

import academy.boostprogramme.java.week2.reflaction.exercise1.Cart;
import academy.boostprogramme.java.week2.reflaction.exercise1.CartItem;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {

    public Cart walkThroughShop(String name) {
        Scanner scanner = new Scanner(System.in);
        List<CartItem> lists = new ArrayList<>();


        System.out.println("Hello " + name + " , welcome to our shop!");
        System.out.println("What do you want to buy?");
        String answer = scanner.nextLine();


        while (!answer.equals("")) {
            lists.add(answer);
            System.out.println("How much does it cost?");
            double price = scanner.nextDouble();
            System.out.println("How many do you want?");
            int quantity = scanner.nextInt();
            System.out.println("Thank you, we will put that in the cart!");

        }
        System.out.println("Thank you for shopping with us!");

        Cart cart = new Cart(lists, name);
        return Cart;

    }






}
