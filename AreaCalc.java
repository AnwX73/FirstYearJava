import java.util.Scanner;

public class AreaCalc {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("which (R or T):");
    char shape = input.next().charAt(0);
    
    if (shape=='R'){
        System.out.println("Enter width: ");
        int width = input.nextInt();
        System.out.println("Enter Height: ");
        int Height = input.nextInt();
        int area = width*Height;
        System.out.println("the area for your R is "+area);  
    }
    else if(shape=='T'){
        System.out.println("Enter base: ");
        int base = input.nextInt();
        System.out.println("Enter Height: ");
        int Height = input.nextInt();
        int area = (base*Height)/2;
        System.out.println("the area for your T is "+area);  
    } 
    else {
        System.out.println("invalid value");  
    }
        
        
    }
}
   