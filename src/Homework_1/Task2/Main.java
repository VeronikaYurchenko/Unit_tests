//Задание 2. Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых
//        метода в класс Shop:
//        Метод sortProductsByPrice(), который сортирует список продуктов по стоимости;
//        Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт.
//        Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество
//        продуктов, верное содержимое корзины).
//        Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
//        Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
//        Используйте класс Product для создания экземпляров продуктов и класс Shop для написания методов сортировки
//        и тестов.

package Homework_1.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Масло", 120));
        products.add(new Product("Вода", 80));
        products.add(new Product("Сыр", 200));
        Shop shop = new Shop(products);
        System.out.println("Магазин: " + shop.getProducts());
        System.out.println("Сортировка продуктов по цене: " + shop.sortProductsByPrice());
        System.out.println("Самый дорогой продукт: " + shop.getMostExpensiveProduct());
    }
}
