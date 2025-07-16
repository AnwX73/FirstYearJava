
package DeviceManager;

public class Mobile extends Electronic {
    private double price;
    private static int total;
    private final double Storage = 64;

    public Mobile(double price, String brand, int year) {
        super(brand, year);
        this.price = price;
        total++;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double getStorage() {
        return Storage;
    }
    

    @Override
    public void StorageSpace(double StorageUsed) {
        double  remining = Storage - StorageUsed;
        System.out.println(remining);
    }

    @Override
    public void printDatils() {
        System.out.println("mopile ditels"); 
        System.out.println("price; "+price);
        System.out.println("Storage; "+Storage);
         System.out.println("total; "+total);
        
    }
    
    public final double CALCULATE_FINAL(){
        return price + (price*0.10);
    }

    @Override
    public String toString() {
        return super.toString()+"\nMobile{" + "price=" + price + ", Storage=" + Storage + '}';
    }
    
    
    
    
    
}
