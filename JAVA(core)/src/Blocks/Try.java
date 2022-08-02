package Blocks;

public class Try {
     
	int age;
	{
		age=10;
	}
	
	public static void main(String[] args) {
		Try t = new Try();
		System.out.println("A:"+t.age);
	}
	
	{
	  age=35;	
	}
}
