package VehicleSystem;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class writeText {
    private Formatter output ;
    
    public void open(String fileName){
        try{
        output = new Formatter(fileName);
        }catch(FileNotFoundException ex){
            System.err.println("Error: "+ex);
        }catch(SecurityException ex){
            System.err.println("Error: "+ex);
        }
    }
    
    public void write(Vehicle v){
        try{
        output.format(v.toString()+"\n");
        }catch(FormatterClosedException ex){
           System.err.println("Error: "+ex);
        }
    }
    
    public void close(){
        if(output != null){
            output.close();
        }
    }
}
