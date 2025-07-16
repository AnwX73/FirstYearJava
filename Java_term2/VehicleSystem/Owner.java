
package VehicleSystem;

public class Owner {
    private String name;
    private int id;

    public Owner(String name, int id) {
        if(name != null){
           this.name = name; 
        }else{
            System.out.println("name must not be null!");
        }
        
        if(id >= 0){
           this.id = id; 
        }else{
            System.out.println("id must be positive number!");
        }

    }

    @Override
    public String toString() {
        return "Owner{" + "name=" + name + ", id=" + id + '}';
    }
    
    
}
