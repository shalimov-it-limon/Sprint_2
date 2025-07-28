package model;

public abstract  class Food{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public abstract double getDiscount();

    public abstract double getPrice();

    public abstract int getAmount();

    public abstract boolean isVegetarian();
}
