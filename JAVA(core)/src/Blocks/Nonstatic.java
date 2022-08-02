package Blocks;

public class Nonstatic {
	 
	int age;
	
	{
		System.out.println("intialize the age to 10");
		age = 10;
	}
	
	public static void main(String[] args) {
		Nonstatic ns = new Nonstatic();
		System.out.println("Age: "+ns.age);
	}

	{
		System.out.println("initialise age to 55");
		age = 55;
	}
}
