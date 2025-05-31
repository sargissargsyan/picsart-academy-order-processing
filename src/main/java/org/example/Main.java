package org.example;

import org.example.models.Customer;
import org.example.models.ExpressOrder;
import org.example.models.InternationalOrder;
import org.example.models.Order;

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
        Order order1 = new ExpressOrder(customer, 1500);
        Order order2 = new ExpressOrder(customer, 2000);
        Order order3 = new InternationalOrder(customer, 3400) ;

        System.out.println(ExpressOrder.getVendor());
        Order[] orders = new Order[3];
        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;

        for(Order order : orders) {
            order.getCustomer().printSummary();
            order.printSummery();
            System.out.println("--------------------------------------------------");
        }

        int totalOrders = orders.length;
        int expressOrderCount = 0;
        int interOrderCount = 0;
        for(Order order : orders) {
            if (order instanceof ExpressOrder) {
                expressOrderCount++;
                break;
            } else if (order instanceof InternationalOrder) {
                interOrderCount++;
            }
        }
        System.out.println("Total orders: " + totalOrders);
        System.out.println("Total express orders: " + expressOrderCount);
        System.out.println("Total international orders: " + interOrderCount);

    }
}