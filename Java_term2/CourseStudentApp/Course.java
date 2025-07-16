
package CourseStudentApp;

public class Course {
   private String courseName;
   private String courseCode;
   private int creditHourse;

    public Course(String courseName, String courseCode, int creditHourse) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHourse = creditHourse;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCreditHourse() {
        return creditHourse;
    }

    public void setCreditHourse(int creditHourse) {
        this.creditHourse = creditHourse;
    }

    @Override
    public String toString() {
        return "Course{" + "courseName=" + courseName + ", courseCode=" + courseCode + ", creditHourse=" + creditHourse + '}';
    }
   
   
}
