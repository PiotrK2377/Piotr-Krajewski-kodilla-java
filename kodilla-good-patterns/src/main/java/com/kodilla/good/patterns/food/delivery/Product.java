package com.kodilla.good.patterns.food.delivery;

public class Product {
    private String product;
    private double productsPrice;

    public Product(String product, double productsPrice) {
        this.product = product;
        this.productsPrice = productsPrice;
    }

    public String getProductName() {
        return product;
    }

    public double getProductsPrice() {
        return productsPrice;
    }
}

