package MethodOverriding;

public class Car extends Vehicle {
     
	
	void start ()
	{
		 super.start();
		System.out.println("car started");
	}
}
