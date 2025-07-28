package model;
import model.constants.Colour;
import model.constants.Discounts;

public class Apple extends Food implements Discountable {
    private final String color;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.setVegetarian(true);
        this.color = colour;
    }


    @Override
    public double getDiscount() {
        if (this.color == Colour.red) {
            return Discounts.redAppleDiscount;
        }
        else {
            return Discounts.comonDiscount;
        }
    }

}