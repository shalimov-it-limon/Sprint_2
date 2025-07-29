package model;

public abstract  class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    protected Food(int amount, double price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

   public abstract double getDiscount();

    public abstract double getPrice();

    public abstract int getAmount();

    public abstract boolean isVegetarian();
}
