
package CourseStudentApp;

public class UnderGradaute extends Student {
    private double GPA;

    public UnderGradaute(double GPA, String stdName, int stdID, String stdMajor, int yearOfEnrollment) {
        super(stdName, stdID, stdMajor, yearOfEnrollment);
        this.GPA = GPA;
    }


    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public int expectedGraduationYear() {
        if(getStdMajor().equals("medicine")){
            return getYearOfEnrollment()+6;
        }else{
            return getYearOfEnrollment()+3;
        }    
    }

    @Override
    public boolean isHonoured() {
        if(getGPA()>= 4.3){
           return true;
        }else{
           return false;
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "GPA: " + GPA ;
        return s;
    }
    
    
    
}
