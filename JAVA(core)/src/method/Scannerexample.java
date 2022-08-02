package method;

import java.util.Scanner;

class Scannerexample{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	 System.out.println("Enter the value of a");
	 int a = scan.nextInt();
	 
	 System.out.println("Enter the value of b");
	 int b =scan.nextInt();
	 
	 System.out.println(a+b);
	}
}