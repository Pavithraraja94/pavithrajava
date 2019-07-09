package com.practice.java;

import java.util.Scanner;

public class Smallest {
	
	
	int num1;
	int num2;
	int num3;
	void display()
	{
		Scanner scan = new Scanner(System.in);
		System.out. println("Enter the value");
		num1=scan.nextInt();
		System.out. println("Enter the another value");
		num2=scan.nextInt();
		System.out. println("Enter the another value");
		num3=scan.nextInt();
	}
	void getOutput()
	{
		if(num1<num2 && num1<num3)
		{
			System.out.println("smallest num is "+num1);
		}
		else if(num2<num1 && num2<num3)
		{
			System.out.println("smallest num is "+num2);

		}
		
		else if(num3<num1 && num3<num2)
		{
			System.out.println("smallest num is " +num3);

		}
		else
			System.out.println("wrong num");
	}
	}

	
	
	


