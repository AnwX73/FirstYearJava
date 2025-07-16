
package Computer_Supply_Store;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class TextFileWrite {
    private Formatter output;
    public void openFile(){
       try{
          output = new Formatter("ORDER.txt" );
          }
       catch (SecurityException securityException ){
              System.err.println("You do not have write access to this file.");
              System.exit(1);}
       catch (FileNotFoundException fileNotFoundException ){ 
              System.err.println( "Error opening or creating file." );
              System.exit( 1 );} }
    public void addData(Order O){ 
        try{
            output.format(O.toString());
            output.format("\n"); }
       catch (FormatterClosedException FormatterClosedException){
           System.err.println("Error writing to file"); //return;
       } }
    public void closeFile() {
       if ( output != null ) output.close();
    }
}
