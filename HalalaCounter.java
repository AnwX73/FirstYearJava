
import java.util.Scanner;

public class HalalaCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the total amount in halalas
        System.out.print("enter total halalah: ");
        int totalHalalas = input.nextInt();

        // Denominations values in halalas
        int riyalValue = 100;
        int halfRiyalValue = 50;
        int quarterRiyalValue = 25;
        int tenHalalasValue = 10;
        int fiveHalalasValue = 5;

        // Calculate the number of each currency unit
        int riyals = totalHalalas / riyalValue;
        int remainingHalalas = totalHalalas % riyalValue;

        int halfRiyals = remainingHalalas / halfRiyalValue;
        remainingHalalas %= halfRiyalValue;

        int quarterRiyals = remainingHalalas / quarterRiyalValue;
        remainingHalalas %= quarterRiyalValue;

        int tenHalalas = remainingHalalas / tenHalalasValue;
        remainingHalalas %= tenHalalasValue;

        int fiveHalalas = remainingHalalas / fiveHalalasValue;
        remainingHalalas %= fiveHalalasValue;

        // Print the result
        System.out.println("Number of Riyals: " + riyals);
        System.out.println("Number of Half Riyals: " + halfRiyals);
        System.out.println("Number of Quarter Riyals : " + quarterRiyals);
        System.out.println("Number of 10 Halalas: " + tenHalalas);
        System.out.println("Number of 5 Halala: " + fiveHalalas);
        System.out.println("Number of remainig Halala: " + remainingHalalas);

                
    }

}



  

