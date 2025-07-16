
package OOPRevision;

public class Postgrad extends Student implements Payable{
    protected  String degreeName;
    private double pgGpa;

    public Postgrad() {
        super(0000, new Name("fname","lname"), new Date[]{new Date(2000),new Date(2000)}, "degree", 0.0);
    }

    public String getDegreeName() {
        return degreeName;
    }

    public double getPgGpa() {
        return pgGpa;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public void setPgGpa(double pgGpa) {
        this.pgGpa = pgGpa;
    }

    
    
    @Override
    public boolean giveDegree() {
        if(getGpa()>2 && pgGpa>2){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double PayDay() {
        if(getGpa() > 4){
            return getFEES()-BENEFIT;
        }else{
            return getFEES();
        }
    }

    @Override
    public String toString() {
        return String.format("%sdegreeName:%s, pgGpa:%.1f",super.toString(),degreeName,pgGpa);
    }
    
    
    
}
