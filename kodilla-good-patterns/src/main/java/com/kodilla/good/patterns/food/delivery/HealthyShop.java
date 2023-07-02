package com.kodilla.good.patterns.food.delivery;

public class HealthyShop implements FoodSupplier {

    public void process(Product product, int quantity) {
        System.out.println();
        System.out.println("Order: " + product.getProductName() + " (" + quantity + " pcs.)");
        System.out.println("Total order cost: " + quantity * product.getProductsPrice());

        if (quantity > 3) {
            System.out.println("When buying more than 3 pieces, 20% discount");
            System.out.println("Price after discount: " + 0.8 * quantity * product.getProductsPrice());
        }
        System.out.println("Order processed by HealthyShop");
    }
}
