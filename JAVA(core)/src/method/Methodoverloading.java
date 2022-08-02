package method;

public class Methodoverloading {
	
	void display()
	{
		 System.out.println("Hello");
	}
	
	void display(int a)
	{
		System.out.println(a);
	}

	void display(int a, String b)
	{
		System.out.println(a+" "+b);
	}
	
	void display(String a, int b)
	{
		System.out.println(a+" "+b);
	}
}
