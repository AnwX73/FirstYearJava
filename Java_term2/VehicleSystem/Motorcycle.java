
package VehicleSystem;

public class Motorcycle extends Vehicle {

    @Override
    public double calculateInsurance() {
        double price = getPrice() + (getPrice()*0.5);
        return price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
