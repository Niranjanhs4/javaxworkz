package ConstructorChaining;

// CONTRUCTOR CHAINING USING THIS() STATMENT
public class Demo {

	Demo(int a)
	{
		System.out.println(1);
	}
	Demo()
	{
		this(10);
		System.out.println(2);
	}
	public static void main(String[] args) {
		System.out.println("start");
		Demo d = new Demo();
		System.out.println("end");
	}
}
