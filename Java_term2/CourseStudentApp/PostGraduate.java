package CourseStudentApp;

public class PostGraduate extends Student {

    private String degree;
    private String result;
    private static int numOfMasterStudens;
    private static int numOfPhdStudents;

    public PostGraduate(String degree, String result, String stdName, int stdID, String stdMajor, int yearOfEnrollment) {
        super(stdName, stdID, stdMajor, yearOfEnrollment);
        getDegree();
        this.result = result;
    }

    

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        if (degree.equals("Mster")) {
            this.degree = degree;
            ++numOfMasterStudens;
        } else if (degree.equals("PhD")) {
            this.degree = degree;
            ++numOfPhdStudents;
        } else {
            System.out.println("degree must be Mster or PhD");
        }
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static int getNumOfMasterStudens() {
        return numOfMasterStudens;
    }

    public static void setNumOfMasterStudens(int numOfMasterStudens) {
        PostGraduate.numOfMasterStudens = numOfMasterStudens;
    }

    public static int getNumOfPhdStudents() {
        return numOfPhdStudents;
    }

    public static void setNumOfPhdStudents(int numOfPhdStudents) {
        PostGraduate.numOfPhdStudents = numOfPhdStudents;
    }

    @Override
    public int expectedGraduationYear() {
        if (degree.equals("Mster")) {
            return getYearOfEnrollment() + 3;
        } else if (degree.equals("PhD")) {
            return getYearOfEnrollment() + 5;
        } else {
            return 0;
        }
    }

    @Override
    public boolean isHonoured() {
        if (getResult().equals("Pass with distinction")) {
            return true;
        } else {
            return false;
        }
    }

    public static void printNumOfPostGraduate() {
        System.out.println("Num of PhD students: " + numOfPhdStudents);
        System.out.println("Num of Master students: " + numOfMasterStudens);
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "degree: " + degree + ", result: " + result;
        return s;
    }

}
