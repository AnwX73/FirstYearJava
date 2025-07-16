
package DeviceManager;

public abstract class Electronic implements Device {
    
    private String brand;
    private int year;

    public Electronic(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public abstract void StorageSpace(double StorageUsed);

    @Override
    public String toString() {
        return "Electronic{" + "brand=" + brand + ", year=" + year + '}';
    }
    
    
    
}
