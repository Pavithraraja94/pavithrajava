package exersicejuly10;

import java.util.Scanner;

public class DonateBlood {
	int age;
	int weight;
	void display()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		age = scan.nextInt();
		System.out.println("Enter the weight");
		weight = scan.nextInt();
	}
	void getOutput()
	{
		if(age>=18 && weight>=50)
		{
			System.out.println("He/She is eligible to donate blood");	
	    }
		else
		{
			System.out.println("He/She is not eligible to donate blood");		
		}
	}
}
