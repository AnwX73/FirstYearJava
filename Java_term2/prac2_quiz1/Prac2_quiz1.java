
package prac2_quiz1;

public class Prac2_quiz1 {

    public static void main(String[] args) {
        Employee e1 = new Employee(111,20,"Ali");
        Employee e2 = new Employee(222,19,"Ahmed");
        Employee e3 = new Employee(333,21,"Khaled");
        
        Deparment d = new Deparment(564,"AI");
        
        d.addEmp(e1);
        d.addEmp(e2);
        d.addEmp(e3);
        
        d.display();
   
    }
    
}
