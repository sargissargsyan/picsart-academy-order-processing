package org.example;

import org.example.models.Customer;
import org.example.models.ExpressOrder;
import org.example.models.Order;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John",
                "Smith",
                "john@gmail.com",
                "+37477777777",
                "5 Azatutyun, Yerevan, Armenia");
        Order order = new ExpressOrder(customer, 1500);
        order.getCustomer().printSummary();
        order.printSummery();
    }
}