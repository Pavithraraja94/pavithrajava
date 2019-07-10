package exersicejuly10;

import java.util.Scanner;

public class Digits {
	double n;
	void display()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		n = scan.nextDouble();
	}
	void getOutput()
	{
		if(n>11 && n<99)
		{	
		System.out.println("The number is 2 digit");
		}
		/*else
		{
			System.out.println("The number is not 2 digit");
		}*/
		if(n>100 && n<999)
		{	
		System.out.println("The number is 3 digit");
		}
//		else
//		{
//			System.out.println("The number is not 3 digit");
//		}
		if(n>1000 && n<9999)
		{	
		System.out.println("The number is 4 digit");
		}
		/*else
		{
			System.out.println("The number is not 4 digit");
		}*/
	}
}
