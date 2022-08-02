package method;

import java.util.Scanner;

public class Again {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EvenOrOdd eo = new EvenOrOdd();
		
		for(int i=1; i<=4; i++)
		{
			System.out.println("Enter the number");
			int num=sc.nextInt();
			eo.checks(num);
			System.out.println("-------------");
		}
	}

}
