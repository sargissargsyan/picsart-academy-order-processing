package org.example.models;

public class InternationalOrder extends Order implements Deliverable {
    private static String vendor = "FedEx";
    public InternationalOrder(Customer customer, double price) {
        super(customer, price);
    }
    @Override
    public double calculateDeliveryPrice() {
        return price * 0.2;
    }


    @Override
    public void printSummery() {
        super.printSummery();
        System.out.println("Type: International Order. Delivery Price: AMD" + calculateDeliveryPrice());

    }
    public static String getVendor() {
        return vendor;
    }
}
