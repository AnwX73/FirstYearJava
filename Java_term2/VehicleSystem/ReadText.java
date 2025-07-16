
package VehicleSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class ReadText {
    private Scanner input;
    
    public void openR(String fileName){
       try{
        input = new Scanner(new File(fileName));
       }catch(SecurityException ex){
           System.err.println("Error: "+ex);
       }catch(FileNotFoundException ex){
           System.err.println("Error: "+ex);
       }
    }
    
    public void read(){
        try{
        if(input.hasNextLine()){
            System.out.println(input.nextLine());
        }
        }catch(NoSuchElementException ex){
            System.err.println("Error: "+ex);
        }catch(IllegalStateException ex){
            System.err.println("Error: "+ex);
        }
    }
    
    public void closeR(){
        if(input != null){
            input.close();
        }
    }
}
