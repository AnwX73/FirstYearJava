package VehicleSystem;

public abstract class Vehicle implements Insurable {

    protected String model;
    double price;
    private static int vehicleCount;
    private Owner owner;

    public Vehicle(String model, double price, Owner owner) {
        this.model = model;
        this.price = price;
        this.owner = owner;
        ++vehicleCount;
    }

    public Vehicle() {
        this(null, 0.0, null);
    }

    public Vehicle(Vehicle v) {
        this(v.model,v.price,v.owner);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    public final void DISPLAY_VEHICLE_TYPE(){
        System.out.println("The vehicle model:"+getModel());
    }

    @Override
    public String toString() {
        return "Vehicle{" + "model=" + model + ", price=" + price + ",\nowner=" + owner.toString() + '}';
    }
    
    

}
