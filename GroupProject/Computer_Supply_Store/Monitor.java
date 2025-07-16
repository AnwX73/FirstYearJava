
package Computer_Supply_Store;

public class Monitor extends Products {

    private double moniterSize;
    private String resolution;
    private boolean hasHDMI;

    public Monitor() {
        this(0.0, "", false, "", 0, 0.0);
    }

    public Monitor(double moniterSize, String resolution, boolean hasHDMI, String productName, int productID, double price) {
        super(productName, productID, price);
        setMoniterSize(moniterSize);
        this.resolution = resolution;
        this.hasHDMI = hasHDMI;
    }

    public double getMoniterSize() {
        return moniterSize;
    }

    public void setMoniterSize(double moniterSize) {
        if (moniterSize < 0) {
            throw new IllegalArgumentException("Invalid moniter size!");
        }
        this.moniterSize = moniterSize;
    }
        

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public boolean isHasHDMI() {
        return hasHDMI;
    }

    public void setHasHDMI(boolean hasHDMI) {
        this.hasHDMI = hasHDMI;
    }

    @Override
    public String productCategory() {
        return "Monitors";
    }

    @Override
    public double productPrice() {
        if (hasHDMI) {
            return (super.getPrice() + (super.getPrice() * Shop.TAXRATE)) + 499.0;
        } else {
            return super.getPrice() + (super.getPrice() * Shop.TAXRATE);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMonitor Size: " + moniterSize + "\nResolution: " + resolution + "\nHas HDMI: " + hasHDMI;

    }

}
