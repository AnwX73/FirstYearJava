package FileIOExample;

// i use * to import all element
import java.io.*;
import java.util.*;

public class ReadTextFile {

    private Scanner input;
    
//opens the file for reading
    public void open_File(String fileName) {
        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException ex) {
            System.err.println("Error opening or creating file.");
        }
    }

// read and print all lines frome the file
    public void Read_File() {
        try {
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (NoSuchElementException ex) {
            System.err.println("File improperly formed.");
            input.close();
        } catch (IllegalStateException ex) {
            System.err.println("Error reading from file.");
        }
    }
    
//closes the file after reading is done
    public void Close_File() {
        if (input != null) {
            input.close();
        }
    }
}
