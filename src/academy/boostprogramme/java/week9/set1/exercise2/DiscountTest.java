package academy.boostprogramme.java.week9.set1.exercise2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {


    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(1, new Discount(0.01, List.of("item1")),
                        List.of(createProduct("item1")))

        );
    }
    static Product createProduct(String name) {
        return new Product(name, 100);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void apply(double expected, Discount discount, List<Product> products) {
        double result = discount.apply(products);

        assertEquals(expected,result);
    }
}