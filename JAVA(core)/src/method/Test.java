package method;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Check c = new Check();
		Scanner sc = new Scanner(System.in);
		System.out.println();
	for(int i=1;i<=5;i++)
	 {
		System.out.println("Enter the number");
		          int num=sc.nextInt();
		         c.PosOrNeg(num);
	 }
	}
}
