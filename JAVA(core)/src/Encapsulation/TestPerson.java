package Encapsulation;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setAge(25);
		
		int age = p.getAge();
		
		System.out.println(p.getAge());
	}

}
