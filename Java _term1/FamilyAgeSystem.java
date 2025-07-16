import java.util.Scanner;
public class FamilyAgeSystem {
    
    public static int count(int[] Ages){
        return Ages.length;
    } 
    
    public static void Eldest(int[] Ages){
        int eldest = Ages[0];
        for(int i=1 ; i<Ages.length ; i++){
            if(Ages[i]>eldest)
               eldest = Ages[i]; 
        }
        System.out.println("the eldest member of family "+eldest+" years old");
    }
    
    public static void ageGroup(int[] Ages){
        for(int i=0 ; i<Ages.length ; i++){
            if(Ages[i]<=16)
                System.out.println("member#"+(i+1)+" is a child");
            else if(Ages[i]>16&&Ages[i]<=30)
                System.out.println("member#"+(i+1)+" is a young adult");
            else if(Ages[i]>30&&Ages[i]<=45)
                System.out.println("member#"+(i+1)+" is a middle-age adult");
            else if(Ages[i]>45)
                System.out.println("member#"+(i+1)+" is a old adult");
        }
            
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Ages [] = {33,51,57,23,16,9,4,77,35};
       
          System.out.println("1: calculate the family members number\n"
          +"2: find the oldest number age\n"
          +"3: determine the group age of each member\n"
          +"0: Exit the programe"); 
          System.out.println("Enter the number of operaion: ");
          int x = input.nextInt();
       
          do{

          switch(x){
              case 1:
                  int mem = count(Ages);
                  System.out.println("there is "+mem+" membeer in the family");
                  System.out.println("Enter the operaion number to contunu or 0 to exit");
                  x = input.nextInt();
                  break;
              case 2:
                  Eldest(Ages);
                  System.out.println("Enter the operaion number to contunu or 0 to exit");
                  x = input.nextInt();
                  break;
              case 3: 
                  ageGroup(Ages);
                  System.out.println("Enter the operaion number to contunu or 0 to exit");
                  x = input.nextInt();
                  break;
              case 0:
                  break;
              default:
                  System.out.println("Enter the number frome list");
                  x = input.nextInt();

          }
        
        }while(x!=0);
        
    }
    
}
