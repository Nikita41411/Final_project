
package model;

public abstract class Food {
    protected int amount; // количество продукта в килограммах
    protected double price; // цена за килограмм в рублях
    protected boolean isVegetarian; // флаг вегетарианского продукта

    //Конструктор базового класса Food
    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    //Возвращает количество продукта в килограммах
    public int getAmount() {
        return amount;
    }

    //Возвращает цену за килограмм продукта
    public double getPrice() {
        return price;
    }

    //Проверяет, является ли продукт вегетарианским
    public boolean isVegetarian() {
        return isVegetarian;
    }

    //Рассчитывает общую стоимость продукта
    public double getTotalPrice() {
        return amount * price;
    }
}
