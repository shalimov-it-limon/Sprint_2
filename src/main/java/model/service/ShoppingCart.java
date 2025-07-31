package model.service;

import model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods){
        this.foods = foods;
    }

    public double getPriceWithDiscount(){
        double sum =0;
        for (Food food : this.foods) {
            double foodsPrice = food.getAmount() * food.getPrice() * (1 - food.getDiscount() / 100);
            sum += foodsPrice;
        }
        return sum;
    }

    public double getPriceWithoutDiscount(){
        double sum =0;
        for (Food food : this.foods) {
            double foodsPrice = food.getAmount() * food.getPrice();
            sum += foodsPrice;
        }
        return sum;
    }

    public double getPriceVegetarianWithoutDiscount() {
        double sum = 0;
        for (Food food : this.foods) {
            if (food.isVegetarian()) {
                double foodPrice = food.getAmount() * food.getPrice();
                sum += foodPrice;
            }
        }
        return sum;
    }
}