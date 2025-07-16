
package InheritancePractice;

public class Developer extends employee {
   
    
    String projectName;
    
    public Developer (){
        System.out.println("No parameter constructor _ sub class");
    }

 
    public Developer (String name, String emailAddress, String phone, String department, String address, int yearOfBirth,String projectName){
    //super( name,emailAddress,phone,department,address,yearOfBirth);
    super();
    this.projectName = projectName;
    }
 
}
    

