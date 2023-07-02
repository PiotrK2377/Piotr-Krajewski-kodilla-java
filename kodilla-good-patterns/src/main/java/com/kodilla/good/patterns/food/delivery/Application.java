package com.kodilla.good.patterns.food.delivery;

public class Application {
    public static void main(String[] args) {
        FoodOrderSystem foodOrderSystem = new FoodOrderSystem();

        foodOrderSystem.processOrder("ExtraFoodShop",new Product("Apple",2.15),5);
        foodOrderSystem.processOrder("HealthyShop",new Product("Yogurt", 4.5), 6);
        foodOrderSystem.processOrder("GlutenFreeShop", new Product("Bread", 5.5),4);
        foodOrderSystem.processOrder("NewShop",new Product("Banana", 3.6), 10);

        SupplierManager supplierManager = new SupplierManager();
        supplierManager.registerSupplier("NewShop", supplierManager.getSupplier("NewShop"));
        supplierManager.process(new Product("Pizza",39.5),3);

    }
}
