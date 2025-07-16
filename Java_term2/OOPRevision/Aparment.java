package OOPRevision;

public class Aparment extends Housing {

    private int numShared;

    public Aparment(int ns) {
        setNumShared(ns);
    }

    public void setNumShared(int numShared) {
        if (numShared >= 1 && numShared <= 4) {
            this.numShared = numShared;
        } else {
            this.numShared = 1;
        }
    }

    @Override
    public double PayDay() {
        return RENT/numShared;
    }

    @Override
    public String toString() {
        return String.format("%s\nAparment:numShared=%d", super.toString(),numShared);
    }
    
    

}
