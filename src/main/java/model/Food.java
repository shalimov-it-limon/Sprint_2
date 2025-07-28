package model;
import model.constants.Discounts;

public abstract  class Food{
    protected int amount;
    protected double price;
    private boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
    }

    public abstract double getDiscount();

    public abstract double getPrice();

    public abstract int getAmount();

    public abstract boolean isVegetarian();
}
