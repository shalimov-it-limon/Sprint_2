package model.service;

import model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods){
        this.foods = foods;
    }

    public double getPriceWithDiscount(){
        double sum =0;
        for(int i = 0; i<this.foods.length; i++){
            double foods_price = this.foods[i].getAmount()*this.foods[i].getPrice()*(1 - this.foods[i].getDiscount()/100);
            sum = sum + foods_price;
        }
        return sum;
    }

    public double getPriceWithoutDiscount(){
        double sum =0;
        for(int i = 0; i<this.foods.length; i++){
                double foods_price = this.foods[i].getAmount() * this.foods[i].getPrice();
                sum = sum + foods_price;
        }
        return sum;
    }

    public double getPriceVegetarianWithoutDiscount() {
        double sum = 0;
        for (int i = 0; i < this.foods.length; i++) {
            if (this.foods[i].isVegetarian()) {
                double food_price = this.foods[i].getAmount() * this.foods[i].getPrice();
                sum = sum + food_price;
            }
        }
        return sum;
    }
}