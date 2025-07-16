package OOPRevision;

public class Undergrad extends Student {

    private int numSemCompleted;
    private boolean graduated = false;

    public Undergrad(int ID, Name name, Date[] activeStat, String faculty, double gpa, int numSemCompleted) {
        super(ID, name, activeStat, faculty, gpa);
        this.numSemCompleted = numSemCompleted;
    }

    public void setNumSemCompleted() {
        if (numSemCompleted < 8) {
            numSemCompleted += 1;
        }else{
            graduated = true;
        }
    }

    @Override
    public boolean giveDegree() {
        if(graduated==true && getGpa()>2){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return  String.format("%sUndergrad:%d, graduated:%s", super.toString(),numSemCompleted,graduated);
    }
    
    

}
