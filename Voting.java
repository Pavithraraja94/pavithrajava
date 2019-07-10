package exercise1;

import java.util.Scanner;

public class Voting {
	int age;
	void display()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		age = scan.nextInt();
	}
	void getOutput()
	{
		if(age>=18)
		{
			System.out.println("His/Her "+age+" age is eligible for voting");
		}
		else
		{
			System.out.println("His/Her "+age+" age is  not eligible for voting");
		}
	}

}
