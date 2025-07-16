package InterfacePractice;

public abstract class Medicine implements Caffeinated {

    protected String name;
    private char risk;
    private double price;
    private Company CompanyName;

    public Medicine(String name, char risk, double price, Company CompanyName) {
        this.name = name;
        this.risk = risk;
        this.price = price;
        this.CompanyName = CompanyName;
    }

    public final boolean SafeForKids() {
        if (risk == 'D') {
            return true;
        } else {
            return false;
        }
    }

    public abstract String Flavour();

    @Override
    public String toString() {
        return "Medicine{" + "name=" + name + ", risk=" + risk + ", price=" + price + ", CompanyName=" + CompanyName + '}';
    }

}
