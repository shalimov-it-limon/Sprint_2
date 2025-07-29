package model;
import model.constants.Discounts;

public class Meat extends  Food {
    public  Meat(int amount, double price){
        super(amount,price, false);
    }

    @Override
    public double  getDiscount() {
        return Discounts.COMON_DISCOUNT;
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
        return false;
    }
}
