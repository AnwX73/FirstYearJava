
package CourseStudentApp;

import java.util.ArrayList;


public abstract class Student implements Graduate {
    private String stdName;
    private int stdID;
    private String stdMajor;
    private int yearOfEnrollment;
    private ArrayList<Course> course = new ArrayList<Course>();

    public Student(String stdName, int stdID, String stdMajor, int yearOfEnrollment) {
        this.stdName = stdName;
        this.stdID = stdID;
        this.stdMajor = stdMajor;
        this.yearOfEnrollment = yearOfEnrollment;
    }
    
    

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public ArrayList<Course> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }

    public String getStdMajor() {
        return stdMajor;
    }

    public void setStdMajor(String stdMajor) {
        this.stdMajor = stdMajor;
    }
    
    
    @Override
     public abstract int expectedGraduationYear(); 
     
    @Override
     public abstract boolean isHonoured();
     
     public void addCourse(Course course){
         this.course.add(course);
     }

    @Override
    public String toString() {
        String s = "Name:" + stdName + ", ID:" + stdID + ", year Of Enrollment:" + yearOfEnrollment;
        s += "\ncourse: ";
        for (Course course : course) {
            s += course.toString()+"\n";
        }
        return s;
    }
     
     
    
}
