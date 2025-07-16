package InterfacePractice;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
public class WriteText {

    private Formatter output;

    public void open(String fileName) {
        try {
            output = new Formatter(fileName);
        } catch (SecurityException ex) {
            System.err.println("Error: " + ex);
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
        }

    }


public void write(Caffeinated c){
    try {
       output.format(c.toString()+"\n"); 
    } catch (FormatterClosedException ex) {
        System.err.println("Error: " + ex);
    }
}

public void close(){
    if(output != null){
        output.close();
    }
}
    
}
