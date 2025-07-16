
package InterfacePractice;

public class Company {
    private String Name;
    private int year;

    public Company(String Name, int year) {
        this.Name = Name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Company{" + "Name=" + Name + ", year=" + year + '}';
    }
    
    
}
