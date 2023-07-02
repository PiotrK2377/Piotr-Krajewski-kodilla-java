package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public int orderId;
    public String nameCustomer;
    public List<OrderItem> orderItems;

    private boolean isPaid;

    public Order(int orderId, String nameCustomer) {
        this.orderId = orderId;
        this.nameCustomer = nameCustomer;
        this.orderItems = new ArrayList<>();
        this.isPaid = false;
    }

    public void addItem(Product product, int quantity) {
        OrderItem orderItem = new OrderItem(product, quantity);
        orderItems.add(orderItem);
    }

    public int getOrderId() {
        return orderId;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (OrderItem item: orderItems) {
            totalAmount += item.getProduct().getPrice() * item.getQuantity();
        }
        return totalAmount;
    }
    public boolean isPaid() {
        return isPaid;
    }

    public void markAsPaid() {
        isPaid = true;
    }

}
