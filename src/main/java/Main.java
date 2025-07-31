import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;
import model.constants.Colour;

public class Main {

    public static void main(String[] args) {
        Meat meat = new Meat(5,100);
        Apple redApple = new Apple(10,50,Colour.RED);
        Apple greenApple = new Apple(8,60,Colour.GREEN);

        Food[] foods = {meat,redApple,greenApple};
        ShoppingCart cart = new ShoppingCart(foods);

        System.out.printf("Общая сумма товаров без скидки: %s %n", cart.getPriceWithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %s %n", cart.getPriceWithDiscount());
        System.out.printf("Общая сумма всех вегетарианских продуктов без скидки: %s", cart.getPriceVegetarianWithoutDiscount());
    }
}
