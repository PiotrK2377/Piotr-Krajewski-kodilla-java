package com.kodilla.good.patterns.food.delivery;

import java.util.HashMap;
import java.util.Map;
public class SupplierManager {

    private Map<String, FoodSupplier> suppliers;


    public SupplierManager() {
        suppliers = new HashMap<>();
    }

    public void registerSupplier(String name, FoodSupplier supplier) {
        suppliers.put(name, supplier);
        System.out.println("Register new supplier: " + name);
    }

    public FoodSupplier getSupplier(String name) {
        return suppliers.get(name);
    }

    public void process(Product product, int quantity) {
        System.out.println("Order: " + product.getProductName() + " (" + quantity + " pcs.)");
        System.out.println("Total order cost: " + product.getProductsPrice() * quantity);
        System.out.println("Order processed by the latest supplier");
    }

}
