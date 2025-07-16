
package Computer_Supply_Store;

public class Order implements Shop {

    private int orderID;
    private static int orderNumber;
    private Customer customer;
    private Products products[];

    public Order() {
        this(0, null, null);
    }

    public Order(int orderID, Customer customer, Products[] products) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
        orderNumber++;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public static int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Products[] getProducts() {
        return products;
    }

    public void setProducts(Products[] products) {
        this.products = products;
    }

    public void displayOrderDetails() {
        System.out.println("< Order Details >");
        System.out.println("Order ID: " + orderID);
        System.out.println("< customer Details >" + getCustomer().customerDetails());

        System.out.println("< Products Details >");
        System.out.println("-------------------");
        double total = 0;
        for (Products product : products) {
            if (product != null) {
                System.out.println(product);
                System.out.println("-------------------");
                total += product.productPrice();
            }
        }
        System.out.printf("Total Price after Tax is: " + total + " SAR\n");
    }

    @Override
    public String toString() {
        return "Order Info: \nOrder ID: " + orderID + "\nCustomer Details: " + getCustomer().customerDetails();
    }

}
