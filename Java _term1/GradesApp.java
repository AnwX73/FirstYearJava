import java.util.Scanner;

public class GradesApp {
    public static void printArray(int [] Score){
        for(int i=0 ; i<Score.length ; i++)
            System.out.println("Course#"+(i+1)+": "+Score[i]);
    }
    
    public static char grade(int avrage){
        char grade = '_';
        if(avrage>=90)
            grade = 'A';
        else if(avrage>=80)
            grade = 'B';
        else if(avrage>=70)
            grade = 'C';
        else if(avrage>=60)
            grade = 'D';
        else if(avrage<60)
            grade = 'F';
        
        return grade;
    }
    
    public static void sum(int [] Score){
        int sum =0;
        for(int i=0 ; i<Score.length ; i++)
            sum += Score[i];
        
        int avrage = sum / Score.length;
        char grade = grade(avrage);
        System.out.println("student avrage = "+avrage+"\tstudentGrade = "+grade);
    }    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] Score = {65,89,85,76,90,89,95,92,82,78,91,86};
        boolean flag = true;
        
        while(flag){
            System.out.println("Enter 1 to print the array, 2 to calculate the avrage and grade, or 3 to end the program");
            int x = input.nextInt();
            
            switch(x){
                case 1:
                    printArray(Score);
                    break;
                case 2:
                    sum(Score);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Enter number frome the list");
            }
        }
    }
    
}
