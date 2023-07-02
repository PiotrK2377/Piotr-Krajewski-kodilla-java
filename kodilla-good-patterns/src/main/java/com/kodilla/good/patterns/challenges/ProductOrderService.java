package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {

        Order order = new Order(1231,"John Smith");
        order.addItem(new Product(1,"Laptop", 3499.0), 1);
        order.addItem(new Product(2,"Witcher 3",59.99), 1);
        order.addItem(new Product(3,"Mouse", 129.50), 1);
        order.addItem(new Product(4,"Can of paint",35.0),5);

        PurchaseMassage massage = new PurchaseMassage();
        massage.processPayment(order);
        massage.displayConfirmation(order);
        order.markAsPaid();
        massage.displayConfirmation(order);
        massage.statusOrder(order);

    }
}
