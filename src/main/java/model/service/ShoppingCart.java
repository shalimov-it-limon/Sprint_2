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
            if (this.foods[i].getDiscount() > 0) {
                sum = sum + this.foods[i].getPrice()*(this.foods[i].getDiscount()/100);
            }
        }
        return sum;
    }

    public double getPriceWithoutDiscount(){
        double sum =0;
        for(int i = 0; i<this.foods.length; i++){
            if (this.foods[i].getDiscount() == 0) {
                sum = sum + this.foods[i].getPrice();
            }
        }
        return sum;
    }

    public double getPriceVegetarianWithoutDiscount(){
        double sum =0;
        for(int i = 0; i<this.foods.length; i++){
            if ((this.foods[i].getDiscount() == 0) && this.foods[i].isVegetarian())
                sum = sum + this.foods[i].getPrice();
        }
        return sum;
    }
}
