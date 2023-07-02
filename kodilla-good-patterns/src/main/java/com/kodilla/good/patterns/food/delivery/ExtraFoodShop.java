package com.kodilla.good.patterns.food.delivery;

public class ExtraFoodShop implements FoodSupplier {

    public void process(Product product, int quantity) {
        System.out.println();
        System.out.println("Order: " + product.getProductName() + " (" + quantity + " pcs.)");
        System.out.println("Total order cost: " + quantity * product.getProductsPrice());
        System.out.println("Order processed by ExtraFoodShop");
    }
}
