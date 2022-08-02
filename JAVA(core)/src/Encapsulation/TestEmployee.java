package Encapsulation;

public class TestEmployee {
    
     public static void main(String[] args) {
	   
    	 Employee emp = new Employee();
    	 
    	 emp.setId(101);
    	 emp.getId();
    	 
    	 emp.setName("nikki");
    	 emp.getName();
    	 
    	 System.out.println("ID: " +emp.getId() );
    	 System.out.println("Name: "+emp.getName());
    	 
    	 
}
}
