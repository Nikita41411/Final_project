
package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items; //Массив продуктов в корзине

    //Конструктор, который принимает массив продуктов
    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    //Общая сумма без скидок
    public double getTotalPrice() {
        double total = 0;
        for (Food item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    //Общая сумма со скидками
    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double discount = 0;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }
            total += item.getTotalPrice() * (100 - discount) / 100;
        }
        return total;
    }

    //Сумма только вегетарианских продуктов
    public double getVegetarianTotalPrice() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getTotalPrice();
            }
        }
        return total;
    }
}