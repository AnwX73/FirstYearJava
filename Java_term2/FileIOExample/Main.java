package FileIOExample;

public class Main {

    public static void main(String[] args) {
        // creat 3 student object
        Student s1 = new Student("Anwar", 446008, 5.0);
        Student s2 = new Student("Aseel", 446007, 4.9);
        Student s3 = new Student("Amal", 446004, 3.7);
        
        //write student data to file
        WriteTextFile writer = new WriteTextFile();
        writer.open_File("StudentTextFile.txt");
        writer.Write_File(s1);
        writer.Write_File(s2);
        writer.Write_File(s3);
        writer.Close_File();
        
        //read and display student data from file
        ReadTextFile reader = new ReadTextFile();
        reader.open_File("StudentTextFile.txt");
        reader.Read_File();
        reader.Close_File();
    }

}
