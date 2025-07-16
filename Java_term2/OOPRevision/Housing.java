
package OOPRevision;

public abstract class Housing implements Payable {
    
    protected final double RENT = 100;

    @Override
    public String toString() {
        return "Housing; RENT=" + RENT;
    }

    
    
    
}
