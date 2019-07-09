package com.practice.java;

import java.util.Scanner;

public class Average {
	int num1,num2,num3;
	 float average;
	 int sum=0;
	void getInput()

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		 num1 = scan.nextInt();
		System.out.println("Enter the another value");
		 num2 = scan.nextInt();
		System.out.println("Enter the another value");
		 num3 = scan.nextInt();
	}

	void sum()
	{
		
		
		//sum=num1+num2+num3;
		System.out.println( "sum of " +(num1+num2+num3));
		
	}
void average()
	{
		//average = sum/3;
		System.out.println("average of " +((num1+num2+num3)/3));
		
	}

	
		
	
}
