package Blocks;

public class staticblock {
     static int age;
    
	 static 
	 {
		 age = 10; 
	 }

	 static 
	 {
		 age = 25;
	 }
	  
	public static void main(String[] args) {
		
		System.out.println(+age);
		
		
	}
}
