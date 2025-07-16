
package prac2_quiz1;

public class Employee {
    private int emp_id;
    private int age;
    private String name;

    public Employee(int emp_id, int age, String name) {
        this.emp_id = emp_id;
        this.age = age;
        this.name = name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void display(){
        System.out.println("the id: "+emp_id);
        System.out.println("the age: "+age);
        System.out.println("the name: "+name);
    }
    
    
}
