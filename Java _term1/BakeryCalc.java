import java.util.Scanner;
public class BakeryCalc {

    public static double calTotal (String x , int y){
    double price = 0;
    if(x.equals("cake"))
        price += 15;
    else if(x.equals("cookies"))
        price += 5;  
    else if(x.equals("cupcakes"))
        price += 3;
    double total = price * y;
    return total;
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("***** MENU *****");
    System.out.println("cake -> 15 SR");
    System.out.println("cookies -> 5 SR");
    System.out.println("cupcakes -> 3 SR");

    System.out.print("Enter the type : ");
    String type = input.next();
    System.out.print("Enter the quantity : ");
    int q = input.nextInt(); 
    double total = calTotal ( type ,  q);
    System.out.print("total for "+q+" "+ type+": SR"+total);
 

    }
    
}
