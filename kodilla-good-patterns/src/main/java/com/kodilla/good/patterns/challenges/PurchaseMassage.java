package com.kodilla.good.patterns.challenges;

public class PurchaseMassage {

    public void processPayment(Order order) {
        System.out.println("Payment processing for the order: " + order.getOrderId());
    }
    public void displayConfirmation(Order order) {
        if (order.isPaid() == true) {
            System.out.println("The order has been paid. Order ID: " + order.getOrderId());
        } else {
            System.out.println(order.getNameCustomer() + " we are waiting for your payment.");
            System.out.println("You have to pay: $" + order.calculateTotalAmount());
        }
    }

    public void statusOrder(Order order) {
        System.out.println(order.getNameCustomer() + " your order no: " + order.getOrderId()+" has been processed.");
    }
}
