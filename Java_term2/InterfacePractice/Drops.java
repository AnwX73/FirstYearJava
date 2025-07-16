
package InterfacePractice;

public class Drops extends Medicine {
    private static int NumberOfDrops;

    public Drops(String name, char risk, double price, Company CompanyName) {
        super(name, risk, price, CompanyName);
        ++NumberOfDrops;
    }

    public static int getNumberOfDrops() {
        return NumberOfDrops;
    }   

    @Override
    public String Flavour() {
        return "Strawberry Flavour";
    }

    @Override
    public double Dosage() {
        double Dosage = Caffeinated.CONCENTRATION *NumberOfDrops;
        return Dosage;
    }

    @Override
    public String toString() {
        return super.toString()+"\n";
    }
    
    
    
    
}
