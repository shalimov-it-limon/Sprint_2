package model;
import model.constants.Colour;
import model.constants.Discounts;

import java.util.Objects;

public class Apple extends Food implements Discountable {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }


    @Override
    public double getDiscount() {
        if (Objects.equals(this.colour, Colour.RED)) {
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