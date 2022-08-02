package Constructors;

class Student {
	
	int age;
	
	Student(int a) //Parameterized constructor
	{
		age = a;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(21);
		Student s2 = new Student(25);
		Student s3 = new Student(28);
		
	 System.out.println("Age: "+s1.age);
	 System.out.println("Age: "+s2.age);
	 System.out.println("Age: "+s3.age);
	}

}
