package Homework_1.Task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ShopTest {
    Shop shop;
    List<Product> products;
    @BeforeEach
    void prepareData() {
        products = new ArrayList<>();
        products.add(new Product("Масло", 120));
        products.add(new Product("Вода", 80));
        products.add(new Product("Сыр", 200));
        shop = new Shop(products);
    }

    @Test
    void getProductsCountTest() {
        assertThat(shop.getProducts()).hasSize(3);
    }

    @Test
    void getProductsListTest() {
        assertThat(shop.getProducts()).isEqualTo(products);
    }

    @Test
    void sortProductsByPriceTest() {
        assertThat(shop.sortProductsByPrice().toString())
                .isEqualTo("[Вода - 80 р., Масло - 120 р., Сыр - 200 р.]");
    }

    @Test
    void getMostExpensiveProductTest() {
        assertThat(shop.getMostExpensiveProduct().toString()).isEqualTo("Сыр - 200 р.");
    }
}