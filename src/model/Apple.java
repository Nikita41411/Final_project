package model;

import model.constants.Colour;
import model.constants.Discount;

//Класс яблок - вегетарианский продукт со скидкой
public class Apple extends Food implements Discountable {
    private final String colour;

    //Конструктор принимает цвет и устанавливает isVegetarian = true
    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    //Геттер для цвета
    public String getColour() {
        return colour;
    }

    //Возвращает скидку 60% только для красных яблок
    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return 0;
    }
}