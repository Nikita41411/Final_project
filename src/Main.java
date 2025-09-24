
import model.Meat;
import model.Apple;
import model.Food;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        //Создаем продукты: мясо 5кг по 100р, яблоки красные 10кг по 50р, зеленые 8кг по 60р
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        //Создание массива продуктов для корзины
        Food[] items = {meat, redApple, greenApple};

        //Создаем корзину с продуктами
        ShoppingCart cart = new ShoppingCart(items);

        //Вывод результатов
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPrice());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getVegetarianTotalPrice());
    }
}