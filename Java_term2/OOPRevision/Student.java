
package OOPRevision;

public abstract class Student {
    private final int ID;
    private Name name;
    private Date[] activeStat;
    protected String faculty;
    private double gpa;
    public static int count;
    private static final double FEES = 2500;

    public Student(int ID, Name name, Date[] activeStat, String faculty, double gpa) {
        this.ID = ID;
        this.name = name;
        this.activeStat = activeStat;
        this.faculty = faculty;
        this.gpa = gpa;
        ++count;
    }

    public double getGpa() {
        return gpa;
    }

    public void setActiveStat(Date[] activeStat) {
        this.activeStat = activeStat;
    }

    public Date[] getActiveStat() {
        return activeStat;
    }
    
    
    
    
    
    

    public abstract boolean giveDegree();

    public static double getFEES() {
        return FEES;
    }

    @Override
    public String toString() {
        return String.format("Student: ID:%d,Name:%s, ActiveStat:%s-%s,faculty:%s, gpa:%.1f\n", ID,
                name,activeStat[0],activeStat[1],faculty,gpa);
    }
    
    
    
    
    
}
