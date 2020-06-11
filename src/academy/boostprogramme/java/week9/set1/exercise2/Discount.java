package academy.boostprogramme.java.week9.set1.exercise2;

import java.util.List;

public class Discount {

    private double discountPercentage;
    private List<String> applicableProductNames;


    public Discount(double discountPercentage, List<String> applicableProductNames) {
        this.discountPercentage = discountPercentage;
        this.applicableProductNames = applicableProductNames;
    }

    public double apply(List<Product> products) {
        return products.parallelStream()
                .filter(product -> applicableProductNames.contains(product.getName()))
                .map(Product::getPrice)
                .mapToDouble(price -> (price * discountPercentage)/100)
                .sum();
    }
}
