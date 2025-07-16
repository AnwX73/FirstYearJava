
package InterfacePractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadText {
    private Scanner input;
    
    public void open(String fileName){
        try {
           input = new Scanner(new File(fileName)); 
        } catch (FileNotFoundException ex) {
            System.err.println("Error: "+ex);
        }  
        
    }
    
    public void read(){
        try {
           while(input.hasNextLine()){
              System.out.println(input.nextLine());
        } 
        } catch (IllegalStateException ex) {
            System.err.println("Error: "+ex);
        } catch (NoSuchElementException ex){
            System.err.println("Error: "+ex);
        }
        
    }
    
    public void close(){
        if(input != null){
            input.close();
        }
    }
    
}
