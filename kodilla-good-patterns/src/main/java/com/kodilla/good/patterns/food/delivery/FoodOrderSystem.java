package com.kodilla.good.patterns.food.delivery;


public class FoodOrderSystem {

    private SupplierManager supplierManager;

    public FoodOrderSystem() {
        supplierManager = new SupplierManager();
        supplierManager.registerSupplier("ExtraFoodShop", new ExtraFoodShop());
        supplierManager.registerSupplier("HealthyShop", new HealthyShop());
        supplierManager.registerSupplier("GlutenFreeShop", new GlutenFreeShop());
    }

    public void processOrder(String supplier,Product product, int quantity) {
        FoodSupplier foodSupplier = supplierManager.getSupplier(supplier);
        if (foodSupplier != null) {
            foodSupplier.process(product,quantity);
        } else {
            System.out.println();
            System.out.println("No registered supplier named: " + supplier);
        }
    }
}
