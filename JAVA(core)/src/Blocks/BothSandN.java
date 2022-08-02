package Blocks;

public class BothSandN {
	
static int age;

    static
    {
	   System.out.println("Initilise age to 10");
	   age=10;
    }
  
    static
    {
    	System.out.println("intialise age to 77");
    	age=77;
    }
    
    {
    	System.out.println("intialise age to 66");
    	age=66;
    }
    public static void main(String[] args) {
		
		System.out.println("Age:"+age);
		BothSandN sn = new BothSandN();		
	}
}
