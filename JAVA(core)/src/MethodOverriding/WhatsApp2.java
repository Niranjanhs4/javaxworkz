package MethodOverriding;

public class WhatsApp2 extends WhatsApp1{
	
	@Override
	void display()
	{
		super.display();
		System.out.println("Double ticks Supported ");
	}
	 
   void call()
   {
	   System.out.println("voice call supported");
   }

}
