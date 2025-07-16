
package CourseStudentApp;

public class Main {

    
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0]= new PostGraduate("PhD", "Pass", "Sara", 1111, "Computer", 2016);
        students[1]= new PostGraduate("Master", "Pass", "Mona", 1112, "Medicine", 2015);
        students[2]= new PostGraduate("Master", "Pass with distinction", "Maha", 1113, "Medicine", 2018);
        students[3]= new UnderGradaute(4.7, "Haya", 2222, "History", 2015);
        students[4]= new UnderGradaute(3.5, "Noor", 2212, "Science", 2018);
    }
    
}
