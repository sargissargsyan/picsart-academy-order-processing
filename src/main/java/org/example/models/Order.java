package org.example.models;

import org.example.exceptions.InvalidPriceException;

public class Order implements Comparable<Order> {
    protected Customer customer;
    protected double price;
    public Order(Customer customer) {
        this.customer = customer;
        this.price = 0;
    }
    public Order(Customer customer, double price) {
        this.customer = customer;
        this.price = price;
    }

    public void printSummery() {
        System.out.println("Order Price: AMD" + price);
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) throws InvalidPriceException {
        if (price < 0 ){
            throw new InvalidPriceException("Price must be a positive number!");
        }
        this.price = price;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return customer + " " + price;
    }

    @Override
    public int compareTo(Order o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
