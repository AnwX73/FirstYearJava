
package prac_quiz2;

import java.util.ArrayList;


abstract class Sweet{
    private String name;
    private double Price;

    public Sweet(String name, double Price) {
        this.name = name;
        this.Price = Price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    public abstract void eat();
    
}


abstract class Candy extends Sweet{
    private String Flavour;
    private int Calorie;

    public Candy(String Flavour, int Calorie, String name, double Price) {
        super(name, Price);
        this.Flavour = Flavour;
        this.Calorie = Calorie;
    }

    public String getFlavour() {
        return Flavour;
    }

    public void setFlavour(String Flavour) {
        this.Flavour = Flavour;
    }

    public int getCalorie() {
        return Calorie;
    }

    public void setCalorie(int Calorie) {
        this.Calorie = Calorie;
    }
    
    public abstract boolean NotHealthy();
    
}


class Lollipop extends Candy{
    private String color;

    public Lollipop(String color, String Flavour, int Calorie, String name, double Price) {
        super(Flavour, Calorie, name, Price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean NotHealthy() {
        if(getCalorie()>550)
            return true;
        else
            return false;
    }

    @Override
    public void eat() {
        System.out.println("eating candy");
        System.out.println("the name of sweet: "+getName());
    }
    
    
}


public class Prac_quiz2 {

   
    public static void main(String[] args) {
        ArrayList<Lollipop> arrayList = new ArrayList<Lollipop>();
        Lollipop l1 = new Lollipop("red", "asd", 460, "bb", 86.9);
        Lollipop l2 = new Lollipop("blue", "hf", 460, "iu", 42.9);
        arrayList.add(l1);
        arrayList.add(l2);
        arrayList.get(1).setCalorie(120);
        System.out.println("the size: "+ arrayList.size());

    }
    
}
