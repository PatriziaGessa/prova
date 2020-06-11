package academy.boostprogramme.java.week9.set1.exercise2;

import java.util.List;

public class TotalDiscountCalculator {

    private List<Discount> discounts = Discounts.get();

    public double calculate(List<Product> products) {
        double total = calculateTotal(products);
        double discount = calculateDiscount(products);
        return total - discount;
    }

    private double calculateTotal(List<Product> products) {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    private double calculateDiscount(List<Product>products) {
        return discounts.stream()
                .mapToDouble(discount -> discount.apply(products))
                .sum();
    }
}
