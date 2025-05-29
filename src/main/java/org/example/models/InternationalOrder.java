package org.example.models;

public class InternationalOrder extends Order implements Deliverable {
    public InternationalOrder(String customerName, double price) {
        super(customerName, price);
    }
    @Override
    public double calculateDeliveryPrice() {
        return price * 0.2;
    }


}
