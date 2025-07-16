
package InterfacePractice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Caffeinated> list = new ArrayList<Caffeinated>();
        list.add(new Coffee("Dark",12));
        list.add(new Pills( "aa", 'A',70.5,new Company("An", 1427),6));
        
        for (Caffeinated caf : list) {
            System.out.println(caf.Dosage());
            
            if(caf instanceof Coffee){
                ((Coffee) caf).setRoast("light");
            }
        }
        
        WriteText writter = new WriteText();
       
        writter.open("Anwar.txt");
       
        for (Caffeinated caf : list) {
            writter.write(caf);
        }
        
        writter.close();
      
        System.out.println("Data saved!");
        
        ReadText reader = new ReadText();
        
        reader.open("Anwar.txt");
          reader.read();
        reader.close();
        
        
    }
    
}
