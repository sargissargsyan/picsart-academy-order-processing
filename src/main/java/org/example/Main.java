package org.example;

import org.example.models.ExpressOrder;
import org.example.models.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new ExpressOrder("John Smith", 1500);
        order.printSummery();
    }
}