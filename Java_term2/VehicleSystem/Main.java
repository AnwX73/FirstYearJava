
package VehicleSystem;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Motorcycle[] arr = new Motorcycle[2];

        ArrayList<Vehicle> list = new  ArrayList<Vehicle>();
        list.add(new CAR());
        list.add(new Motorcycle());
        
        for (Vehicle l : list) {
            l.toString();
        }
        
        System.out.println("the num of vehicle object: "+list.size());
        
        for (Vehicle l : list) {
            l.calculateInsurance();
            
            if( l instanceof CAR ){
                ((CAR) l).startMoving();
            }
        }
        
        writeText writter = new writeText();
        writter.open("Extra.txt");
        
        for (Vehicle vehicle : list) {
            writter.write(vehicle);
        }
        writter.close();
        
        ReadText reader = new ReadText();
        reader.openR("Extra.txt");
        reader.read();
        reader.closeR();
        
        
        
    }
    
}
