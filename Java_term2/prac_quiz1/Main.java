
package prac_quiz1;
// Extra ex composition;
public class Main {
 
    public static void main(String[] args) {
       
        Battery b1 = new Battery (678,"mag");
        Battery b2 = new Battery (990,"bop");

        Phone phone1 = new Phone("samsung",1500,b1,2020);
        Phone phone2 = new Phone("hawawy",3500,b2,2018);
        Phone phone3 = new Phone();
        
        System.out.println("battery capacity of phone3: "+phone3.getBattery().getCapacity());
        phone2.getBattery().printBatteryDetalise();
        phone2.setYearOfIssue(2024);
        phone1.getBattery().setCapacity(6000);
        phone1.checkCapacity();
        System.out.println("the final price : "+phone3.calculateCost());
        
        System.out.println("--------------");
        
        phone1.printPhoneDetails();
        System.out.println("--------------");
        phone2.printPhoneDetails();
        System.out.println("--------------");
        phone3.printPhoneDetails();
        
        System.out.println("Total phones: "+Phone.getTotalPhones());
    }
    
}
