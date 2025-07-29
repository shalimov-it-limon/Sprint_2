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
            double foods_price = food.getAmount() * food.getPrice() * (1 - food.getDiscount() / 100);
            sum += foods_price;
        }
        return sum;
    }

    public double getPriceWithoutDiscount(){
        double sum =0;
        for (Food food : this.foods) {
            double foods_price = food.getAmount() * food.getPrice();
            sum += foods_price;
        }
        return sum;
    }

    public double getPriceVegetarianWithoutDiscount() {
        double sum = 0;
        for (Food food : this.foods) {
            if (food.isVegetarian()) {
                double food_price = food.getAmount() * food.getPrice();
                sum += food_price;
            }
        }
        return sum;
    }
}