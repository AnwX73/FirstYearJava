
package Computer_Supply_Store;

public abstract class Products implements Shop {

    private String productName;
    private int productID;
    private double price;
    private static int productNumber;

    public Products() {
        this("", 0, 0.0);
    }

    public Products(String productName, int productID, double price) {
        this.productName = productName;
        this.productID = productID;
        setPrice(price);
        productNumber++;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Invalid price!");
        }
        this.price = price;
    }

    public static int getProductNumber() {
        return productNumber;
    }

    public abstract String productCategory();

    public abstract double productPrice();

    @Override
    public String toString() {
        return "Product Name: " + productName + "\nProduct ID: " + productID + "\nprice: " + price;
    }

}
