package OOPRevision;

public class Main {

    public static void main(String[] args) {
        Student[] stuArray = new Student[5];
        stuArray[0] = new Undergrad(1111, new Name("Aseel", "Ahmed"), new Date[]{new Date(2001), new Date(4, 11, 2001)}, "Art", 3.2, 3);
        stuArray[1] = new Undergrad(2222, new Name("Basma", "Bader"), new Date[]{new Date(2002)}, "Medcin", 1.9, 5);
        stuArray[2] = new Undergrad(3333, new Name("Sara", "Same"), new Date[]{new Date(2, 5, 2000)}, "CS", 4.5, 7);

        stuArray[3] = new Postgrad();
        stuArray[4] = new Postgrad();

        if(stuArray[3] instanceof Postgrad){
        ((Postgrad) stuArray[3]).setDegreeName("PhD");
        ((Postgrad) stuArray[3]).setPgGpa(4.2);
        }
        
        if(stuArray[4] instanceof Postgrad){            
        ((Postgrad) stuArray[4]).setDegreeName("Msc");
        ((Postgrad) stuArray[4]).setPgGpa(4.5);
        }
        
        
    }

}
