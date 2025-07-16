
package OOPRevision;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if(day >= 1 && day <=30){
          this.day = day;  
        }else{
            System.out.println("invail day!");
        }
        
        if(month >=1 && month <=12){
          this.month = month;  
        }else{
            System.out.println("invail month!");
        }
        
        if(year >= 1900){
           this.year = year; 
        }else{
            System.out.println("invail year!");
        }

    }

    public Date(int year) {
        this(1,1,year);
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    

    @Override
    public String toString() {
        return String.format("%d/%d/%d", day,month,year);
    }
    
    
}
