package method;

import java.util.Scanner;

public class Scannerexm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
  
		System.out.println("Enter the Age");
		int age = s.nextInt();
		
		System.out.println("Enter the Name");
		String name=s.next();
		
		System.out.println("Enter the Salary");
		double salary=s.nextDouble();
		
		System.out.println("\nAge: "+age+ "\nName: "+name+ "\nSalary: "+salary);
		
	}

}
