
package DeviceManager;

public final class LAPTOP extends Electronic{
    protected int RAN;
    private String processor;
    private final double Storage = 256;

    public LAPTOP(int RAN, String processor, String brand, int year) {
        super(brand, year);
        this.RAN = RAN;
        this.processor = processor;
        
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRAN(int RAN) {
        this.RAN = RAN;
    }
    

    public int getRAN() {
        return RAN;
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
        System.out.println("laptop ditels"); 
        System.out.println("RAN; "+RAN);
        System.out.println("processor; "+processor);
        System.out.println("Storage; "+Storage);
    }

    @Override
    public String toString() {
        return super.toString()+"\nLAPTOP{" + "RAN=" + RAN + ", processor=" + processor + ", Storage=" + Storage + '}';
    }
    
    

    
    
    
}
