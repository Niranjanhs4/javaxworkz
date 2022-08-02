package ConstructorChaining;
//CONSTRUCTOR CHAINING USING THIS() STATMENT

public class Student {

	Student(int age)
	{
		this("tom");
		System.out.println("Age: "+age);
	}
	
	Student(double hieght)
	{
		this(22);
		System.out.println("Hieght: "+hieght);
	}
	
	Student(String name)
	{
		System.out.println("Name: "+name);
	}
	public static void main(String[] args) {
		Student s = new Student(5.8);
	}
}
