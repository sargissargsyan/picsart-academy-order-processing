package org.example;

import org.example.models.Customer;
import org.example.models.ExpressOrder;
import org.example.models.InternationalOrder;
import org.example.models.Order;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John",
                "Smith",
                "john@gmail.com",
                "+37477777777",
                "5 Azatutyun, Yerevan, Armenia");
        Customer customer2 = new Customer("Aram",
                "Aramyan",
                "aram@gmail.com",
                "+37477777777",
                "5 Mashtots, Yerevan, Armenia");
        Customer customer = new Customer("Poghos",
                "Poghosyan",
                "poghos@gmail.com", 
                "+37477777777",
                "5 Kievyan, Yerevan, Armenia");

        Order order1 = new ExpressOrder(customer, 3500);
        Order order2 = new ExpressOrder(customer, 500);
        Order order3 = new InternationalOrder(customer, 3400) ;

        System.out.println(ExpressOrder.getVendor());
        List<Order> orders = Arrays.asList(order1, order2, order3);

        System.out.println("Before sorting: ");
        System.out.println(orders);
        Collections.sort(orders);
        System.out.println("After sorting: ");
        System.out.println(orders);
//
//        for(Order order : orders) {
//            order.getCustomer().printSummary();
//            order.printSummery();
//            System.out.println("--------------------------------------------------");
//        }
//
//        int totalOrders = orders.length;
//        int expressOrderCount = 0;
//        int interOrderCount = 0;
//        for(Order order : orders) {
//            if (order instanceof ExpressOrder) {
//                expressOrderCount++;
//                break;
//            } else if (order instanceof InternationalOrder) {
//                interOrderCount++;
//            }
//        }
//        System.out.println("Total orders: " + totalOrders);
//        System.out.println("Total express orders: " + expressOrderCount);
//        System.out.println("Total international orders: " + interOrderCount);
//
//        System.out.println("Total orders: " + totalOrders);
//        System.out.println("Total express orders: " + expressOrderCount);
//        System.out.println("Total international orders: " + interOrderCount);

    }
}