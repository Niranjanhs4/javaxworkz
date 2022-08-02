package StaticKeyword;

public class Student {
	
	static int age = 23;
	
	static void study()
	{
		System.out.println("Student is studying");
	}
	
public static void main(String[] args) {
	
	System.out.println(Student.age);
	Student.study();
	
	System.out.println("______________________");
	
	System.out.println(age);
	study();
 }	

}
