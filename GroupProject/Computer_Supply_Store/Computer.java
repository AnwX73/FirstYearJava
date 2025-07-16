
package Computer_Supply_Store;

public class Computer extends Products {

    private String color;
    private double screenSize;

    public Computer() {
        this("", 0.0, "", 0, 0.0);
    }

    public Computer(String color, double screenSize, String productName, int productID, double price) {
        super(productName, productID, price);
        this.color = color;
        setScreenSize(screenSize);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize < 0) {
            throw new IllegalArgumentException("Invalid screen size!");
        }
        this.screenSize = screenSize;
    }
   
    

    @Override
    public String productCategory() {
        return "Computers";
    }

    @Override
    public double productPrice() {
        return super.getPrice() + (super.getPrice() * Shop.TAXRATE);
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor: " + color + "\nScreen Size: " + screenSize;

    }

}
