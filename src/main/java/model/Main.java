package model;
import model.constants.Colour;
import model.service.ShoppingCart;

public class Main {

    public static void main(String[] args) {
        Meat meat = new Meat(5,100);
        Apple redApple = new Apple(10,50,Colour.red);
        Apple greenApple = new Apple(8,60,Colour.green);

        Food[] foods = {meat,redApple,greenApple};
        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println("Общую сумму товаров без скидки: " + cart.getPriceWithoutDiscount());
        System.out.println("Общую сумму товаров со скидкой: " + cart.getPriceWithDiscount());
        System.out.println("Общую сумму всех вегетарианских продуктов без скидки: " + cart.getPriceVegetarianWithoutDiscount());
    }
}
