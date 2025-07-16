
package prac_quiz1;

public class Battery {
    
    private int capacity;
    protected String type;
    
    public Battery(){
      this(4000,"Lithium");
    }

    public Battery(int capacity, String type) {
        setCapacity(capacity);
        setType(type);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity >= 0)
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void printBatteryDetalise(){
        System.out.println("the capacity: "+capacity);
        System.out.println("the type is :"+type);
    }
    
}
