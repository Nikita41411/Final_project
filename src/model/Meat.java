package model;

public class Meat extends Food {
    //Конструктор устанавливает isVegetarian = false для мяса
    public Meat(int amount, double price) {
        super(amount, price, false);
    }
}