
package FileIOExample;
  // creat class to represent student
public class Student {
    private String name;
    private int id;
    private double GPA;

    public Student(String name, int id, double GPA) {
        this.name = name;
        this.id = id;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", GPA: " + GPA + "\n";

    }
}
