
package DeviceManager;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Mobile> MobileArrayList = new ArrayList<Mobile>();
        
        Mobile m1 = new Mobile(200.8, "apple", 2023);
        Mobile m2 = new Mobile(800.8, "galx", 2026);
        
        MobileArrayList.add(m1);
        MobileArrayList.add(m2);
         
        for (Mobile m : MobileArrayList) {
            m.printDatils();
        }
        
        MobileArrayList.get(0).StorageSpace(56);
        MobileArrayList.get(1).setPrice(6500);
        System.out.println("caculat final for obj2: "+MobileArrayList.get(1).CALCULATE_FINAL());
        System.out.println("size for arraylist: "+ MobileArrayList.size());
       
        
        ArrayList<LAPTOP> laptpArrayList = new ArrayList<LAPTOP>();
        
        LAPTOP l1 = new LAPTOP(55, "aff", "haear", 2020);
        LAPTOP l2 = new LAPTOP(56, "gf", "jfhu", 1051);
        LAPTOP l3 = new LAPTOP(88, "ee", "kggo", 2028);
        
        laptpArrayList.add(l1);
        laptpArrayList.add(l2); 
        
        for (LAPTOP l : laptpArrayList) {
            l.printDatils();
        }
        
        System.out.println(laptpArrayList);
        
        laptpArrayList.add(1, l3);
        
        System.out.println("prossor for first elemnt: "+laptpArrayList.get(0).getProcessor());
       

    }
    
}
