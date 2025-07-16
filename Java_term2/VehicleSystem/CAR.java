
package VehicleSystem;

public final class CAR extends Vehicle {
    public final int DISCOUNT = 1000;

    @Override
    public double calculateInsurance() {
        return getPrice() - DISCOUNT;
    }
    
    public void startMoving(){
        System.out.println("CAR is moving!");
    }

    @Override
    public String toString() {
        return super.toString()+"\nCAR{" + "DISCOUNT=" + DISCOUNT + '}';
    }
    
    
    
}
