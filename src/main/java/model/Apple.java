package model;
import model.constants.Colour;
import model.constants.Discounts;

public class Apple extends Food implements Discountable {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }


    @Override
    public double getDiscount() {
        if (this.colour == Colour.red) {
            return Discounts.redAppleDiscount;
        }
        else {
            return Discounts.comonDiscount;
        }
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getAmount() {
        return this.amount;
    }

    @Override
    public boolean isVegetarian()
    {
        return true;
    }

}