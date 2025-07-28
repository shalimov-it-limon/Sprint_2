package model;
import model.constants.Discounts;

public class Food implements Discountable{
    private int amount;
    private double price;
    private boolean isVegetarian;

    public Food(int amount, double price){
        this.amount = amount;
        this.price = price;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public double getDiscount() {
        return Discounts.comonDiscount;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }
}
