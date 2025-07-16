package InterfacePractice;

public class Coffee implements Caffeinated {

    private String roast;
    private int Degree;

    public Coffee(String roast, int Degree) {
        this.roast = roast;
        this.Degree = Degree;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }
    
    

    @Override
    public double Dosage() {
        if (roast.equals("Dark")) {
            return 2.5;
        } else {
            return 4.5;
        }

    }

    @Override
    public String toString() {
        return "Coffee{" + "roast=" + roast + ", Degree=" + Degree + '}';
    }

}
