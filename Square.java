package exercise1;

import java.util.Scanner;

public class Square {
	float n;
	double square;
	double cube;
	
	void display()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		n = scan.nextInt();
		square=Math.pow(n,2);
		System.out.println("The square value is " +square );
		cube=Math.pow(n,3);
		System.out.println("The cube value is " +cube );

	}
	
	

}
