
package prac2_quiz1;

public class Deparment {
    private int Deparment_id;
    private String Deparment_name;
    private Employee[] ArrayEmp;
    
    private static int empCount;

    public Deparment(int Deparment_id, String Deparment_name) {
        this.Deparment_id = Deparment_id;
        this.Deparment_name = Deparment_name;
        this.ArrayEmp = new Employee[3];
    }

    public int getDeparment_id() {
        return Deparment_id;
    }

    public void setDeparment_id(int Deparment_id) {
        this.Deparment_id = Deparment_id;
    }

    public String getDeparment_name() {
        return Deparment_name;
    }

    public void setDeparment_name(String Deparment_name) {
        this.Deparment_name = Deparment_name;
    }

    public Employee[] getArrayEmp() {
        return ArrayEmp;
    }

    public void setArrayEmp(Employee[] ArrayEmp) {
        this.ArrayEmp = ArrayEmp;
    }

    public static int getEmpCount() {
        return empCount;
    }
    
    public void addEmp(Employee emp){
     if(empCount < 3){
        ArrayEmp[empCount] = emp;
        empCount++;
     }else{
         System.out.println("the array is full");
     } 
    }
    
    public void display(){
        System.out.println("the depar id: "+Deparment_id);
        System.out.println("the depar name: "+Deparment_name);
        System.out.println("the employee: ");
        for (Employee e : ArrayEmp) {
            e.display();
        }
        
    }

    
    
    
    
    
    
    
}
