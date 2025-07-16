
package prac_quiz1;

public class Phone {
    private String brand;
    private final int COST;   
    private Battery battery;   
    int YearOfIssue;
    private static int totalPhones;

    public Phone() {      
        this("apple",5500,new Battery(),2023);
    }
   
    
    public Phone(String brand, int COST, Battery battery, int YearOfIssue) {
        setBrand(brand);
        this.COST = COST;
        this.battery = battery;
        this.YearOfIssue = YearOfIssue;
        ++totalPhones;
    }
    
    
    public Phone(Phone phone) {
        this(phone.brand,phone.COST,phone.battery,phone.YearOfIssue);
    } 
    

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand != null && ! brand.isEmpty())
        this.brand = brand;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public int getYearOfIssue() {
        return YearOfIssue;
    }

    public void setYearOfIssue(int YearOfIssue) {
        this.YearOfIssue = YearOfIssue;
    }

    public static int getTotalPhones() {
        return totalPhones;
    }

    public static void setTotalPhones(int totalPhones) {
        Phone.totalPhones = totalPhones;
    }

    public int getCOST() {
        return COST;
    }
       
    
    public void printPhoneDetails(){
        System.out.println("the brand: "+brand);
        System.out.println("the COST: "+COST);
        System.out.println("Year Of Issue: "+YearOfIssue);
        battery.printBatteryDetalise();
    }
    
    public void checkCapacity(){
        if(battery.getCapacity()>4500)
            System.out.println("the battery capacity is big");
        else
            System.out.println("the battery capacity is small");
    }
    
    public double calculateCost(){
        double finalPrice = COST + (COST*0.10);
        return finalPrice;
    }

    
}
