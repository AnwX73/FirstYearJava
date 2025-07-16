
package OOPRevision;

public class Name {
    private String first;
    private String last;

    public Name(String first, String last) {
        setName(first,last);
    }
    
    public void setName(String f, String l){
        first = f;
        last = l;
    }

    @Override
    public String toString() {
        return String.format("%s %s", first,last);
    }
    
    
}

