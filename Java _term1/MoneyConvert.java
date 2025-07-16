import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      while(true){
        System.out.print("enter 1 to converts Riyal to dollar\nenter 2 to converts dollar to Riyal\nenter 0 to stope : ");
        double coin = input.nextDouble();
       
        if (coin==1){
          System.out.print("enter Riyal: ");
          double Riyal = input.nextDouble();  
          double dollar = Riyal/3.75 ;
          System.out.println("Riyal in dollar is: "+dollar);         
      }
        else if (coin==2){
          System.out.print("enter dollar: ");
          double dollar = input.nextDouble();  
          double Riyal = dollar*3.75 ;
          System.out.print("Riyal in dollar is: "+Riyal);    
      }
        else if (coin==0)
            break;
        else 
          System.out.print("error input");  
      }
        System.out.print("stope");         
    
     }
    }
    

