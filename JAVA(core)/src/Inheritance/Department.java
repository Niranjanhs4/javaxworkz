package Inheritance;

public class Department extends College {

	String departmentname = "cs";
	
	void fest()
	{
		System.out.println("cs dep will arrange fest");
	}
public static void main(String[] args) {
	
	Department d = new Department();
	
	System.out.println("Universityname: "+d.universityname);
	System.out.println("Collegename: "+d.collegename);
	System.out.println("Departmentname: "+d.departmentname);
	
	System.out.println("--------------------------");

	d.conductExams();
	d.provideplacement();
	d.fest();
	
  
}
}
