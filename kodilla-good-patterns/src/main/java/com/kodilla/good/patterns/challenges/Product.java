package com.kodilla.good.patterns.challenges;

public class Product {

    public int productId;
    public String nameProduct;
    public double price;

    public Product(int productId, String nameProduct, double price) {
        this.productId = productId;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
