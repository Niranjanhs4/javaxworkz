package MethodOverriding;

public class Instagram3 extends Instagram2 {
	
	void display()
	{
		super.display();
		System.out.println("upload videos");
	}
	
	void DM()
	{
		super.DM();
		System.out.println("U can share MEMEs");
	}
	
	void story()
	{
		System.out.println("U can put story");
	}
	

}
