package com.kodilla.good.patterns.food.delivery;

public class GlutenFreeShop implements FoodSupplier {

    public void process(Product product, int quantity) {
        System.out.println();
        System.out.println("Order: " + product.getProductName() + " (" + quantity + " pcs.)");
        System.out.println("Total order cost: " + quantity * product.getProductsPrice());
        if (product.getProductName().equals("Bread") && quantity == 4) {
            System.out.println("When you buy 4 breads, you pay as for 3");
            System.out.println("Price after discount: " + 3 * product.getProductsPrice());
            System.out.println("Order processed by GlutenFreeShop");
        } else {
            System.out.println("Total order cost: " + quantity * product.getProductsPrice());
            System.out.println("Order processed by GlutenFreeShop");
        }
    }
}
