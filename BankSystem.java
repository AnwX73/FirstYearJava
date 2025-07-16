public class BankSystem {
    
    private int acountNo;
    private String name;
    private float amount;
    
    public void insert(int a, String n ,float amt){
       this.acountNo = a;
       this.name = n;
       this.amount = amt;
    }
    
    public void deposit(float amt){
       this.amount += amt;
       System.out.println(amt+" deposit");
          
    }
    
    public void withdraw(float amt){
        if(amt>amount)
           System.out.println("not enough"); 
        else{
            this.amount -= amt;
            System.out.println(amt+" withdraw");
        }

    }
    
    public void check(){
      System.out.println("amout now "+this.amount);
    }

    @Override
    public String toString() {
        return "Bank{" + "acountNo=" + acountNo + ", name=" + name + ", amount=" + amount + '}';
    }

    public static void main(String[] args){
        BankSystem a1 = new BankSystem();
        a1.insert(225649, "Anwar", 1000);
        a1.deposit(500);
        a1.withdraw(200);
        a1.check();
        System.out.print(a1.toString());  
    }


}
