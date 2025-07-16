package FileIOExample;

// i use * to import all element
import java.io.*;
import java.util.*;

public class WriteTextFile {

    private Formatter output;

// opens a file for writing
    public void open_File(String fileName) {
        try {
            output = new Formatter(fileName);
        } catch (SecurityException ex) {
            System.err.println("You do not have write access to this file.");
        } catch (FileNotFoundException ex) {
            System.err.println("Error opening or creating file.");
        }
    }
    
// write a student object to the file
    public void Write_File(Student s) {
        try {
            output.format(s.toString() + "\n");
        } catch (FormatterClosedException ex) {
            System.err.println("Error writing to file");
        }
    }
    
//closes the file after writing is done
    public void Close_File() {
        if (output != null) {
            output.close();
        }
    }
}
