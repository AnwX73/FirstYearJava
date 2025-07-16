
package Computer_Supply_Store;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException; 

import java.util.Scanner;
public class TextFileRead {
    private Scanner input;
    public void openFile(){
      try{
        input = new Scanner(new File( "ORDER.txt" ));
      }
      catch (FileNotFoundException fileNotFoundException ){
         System.err.println("Error opening or creating file.");
         System.exit( 1 );}}
    public void readData(){
     try{
       while (input.hasNext() ){
         System.out.println(input.nextLine());
         System.out.println("One record read successfully"); }}
       catch ( NoSuchElementException elementException ){
        System.err.println( "File improperly formed." );
        input.close();
        System.exit( 1 );}
       catch ( IllegalStateException stateException ){
        System.err.println( "Error reading from file." );
        System.exit( 1 ); }}
    public void closeFile(){
        if ( input != null )
            input.close(); }
}

