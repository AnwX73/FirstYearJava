import java.util.Scanner;
public class BookShopSystem {
    
    public static void modifyList(String [] names,int idx){
      Scanner input = new Scanner(System.in);
      System.out.print("Choose a new name for the "+names[idx]+" book: "); 
      String bookName = input.next();
      names [idx] = bookName;
    }
    
    public static void modifyList(int [] chapters){
      Scanner input = new Scanner(System.in);
      for(int i =0 ; i<chapters.length ; i++){
        System.out.print("chapters for "+i+":");
        chapters[i]= input.nextInt();
      }
    }
    
    public static double calculatePrice(int chapters,double TAX){
      int price = chapters*5;
      double priceTax = price + price*TAX;
      return priceTax;
    } 
 
    public static void printPriceList(String [] names,int [] chapters){
      final double TAX = 0.10;
      System.out.println("name\tchapters\tprice");
      for(int i=0 ; i<names.length ; i++){
         double price = calculatePrice(chapters[i],TAX);
         System.out.printf("%s\t%d\t\t%.1f\n",names[i],chapters[i],price);
      }
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcom!");
        String [] names ={"Wonder","Math","Giver","Hamlet","Alice","Wish"};
        int [] chapters = new int [6];
        boolean flag = true;
        
        while(flag==true){
          System.out.println("******MENUE******");
          System.out.println("1- Modify a book name.\n"
          +"2- Modify number of chapters for all books.\n"
          +"3- Print books list with prices.\n"
          +"4- Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
          
        switch(choice){
            case 1:
               System.out.print("Enter book index number (between 0 and 5): "); 
               int idx = input.nextInt();
               modifyList(names,idx);
               break;
            case 2:
               modifyList(chapters);
               break;
            case 3:
               printPriceList(names,chapters);
               break;
            case 4:
               flag = false;
               break;
            default:
               System.out.println("invalid choice"); 
        }
    
        }
        
        System.out.println("thank you for using our Book store"); 
        
    }
    
}
