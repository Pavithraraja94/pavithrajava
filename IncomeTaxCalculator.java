package com.practice.java;

import java.util.Scanner;

public class IncomeTaxCalculator {
	double amount;
	double tax;
	void display()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		amount = scan.nextDouble();	
	}
	void BusinessLogic()           //this model only for references
	{
		if(amount<= 20000)     
		{
			System.out.println("no tax");
		}
		else if((amount>=20000) && (amount<=40000))
		{
			tax = amount*0.1;
			System.out.println("The tax is " +tax);
		}
		else if((amount>=40000) && (amount<=60000))
		{
			tax = amount*0.2;
			System.out.println("The tax is " +tax);
		}
		else if((amount>=60000) && (amount<=80000))
		{
			tax = amount*0.3;
			System.out.println("The tax is " +tax);
		}
	}

}
