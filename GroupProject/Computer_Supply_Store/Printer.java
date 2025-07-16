
package Computer_Supply_Store;

public class Printer extends Products {

    private boolean hasColors;
    private String resolution;
    private boolean hasScanner;

    public Printer() {
        this(false, "", false, "", 0, 0.0);
    }

    public Printer(boolean hasColors, String resolution, boolean hasScanner, String productName, int productID, double price) {
        super(productName, productID, price);
        this.hasColors = hasColors;
        this.resolution = resolution;
        this.hasScanner = hasScanner;
    }

    public boolean isHasColors() {
        return hasColors;
    }

    public void setHasColors(boolean hasColors) {
        this.hasColors = hasColors;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public boolean isHasScanner() {
        return hasScanner;
    }

    public void setHasScanner(boolean hasScanner) {
        this.hasScanner = hasScanner;
    }

    @Override
    public String productCategory() {
        return "Printers";
    }

    @Override
    public double productPrice() {
        if (hasColors) {
            return (super.getPrice() + (super.getPrice() * Shop.TAXRATE)) + 99.0;
        } else if (hasScanner) {
            return (super.getPrice() + (super.getPrice() * Shop.TAXRATE)) + 199.0;
        } else if (hasColors && hasScanner) {
            return (super.getPrice() + (super.getPrice() * Shop.TAXRATE)) + 299.0;
        } else {
            return super.getPrice() + (super.getPrice() * Shop.TAXRATE);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nHas Colors: " + hasColors + "\nResolution: " + resolution + "\nHas Scanner: " + hasScanner;

    }

}
