package academy.boostprogramme.java.week2.reflaction.exercise1;

import java.util.List;

public class Cart {
    private List<CartItem> lists;
    private String cartOwnerName;

    public Cart(List<CartItem> lists, String cartOwnerName) {
        this.lists = lists;
        this.cartOwnerName = cartOwnerName;
    }

    public List<CartItem> getLists() {
        return lists;
    }

    public String getCartOwnerName() {
        return cartOwnerName;
    }
}
