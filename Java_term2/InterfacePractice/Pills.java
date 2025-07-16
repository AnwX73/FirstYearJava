
package InterfacePractice;

public class Pills extends Medicine {
    private int Quantity;

    public Pills( String name, char risk, double price, Company CompanyName,int Quantity) {
        super(name, risk, price, CompanyName);
        this.Quantity = Quantity;
    }

    @Override
    public String Flavour() {
        return "No Flavour";
    }

    @Override
    public double Dosage() {
        double Dosage = Caffeinated.CONCENTRATION *(Quantity/100);
        return Dosage;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPills{" + "Quantity=" + Quantity + '}';
    }
    
    
    
    
    
    
    
}
