package com.practice.java.july15;

import java.util.Scanner;

public class Numbers {
	int j;
	int n;
	int number[] = new int[20];
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter the value");
		System.out.println("================");
	
		for(j=0;j<20;j++)
		{
		System.out.println("Enter the number for position" +" "+   +j);
		number[j] = scan.nextInt();
		}
		
		System.out.println("OUTPUT");
	}
	void getOutput()
	{
		
			for(j=0;j<20;j++)
			{
			if(number[j]%2==0)
			{
				System.out.println("The given number is even=" +" "+ +number[j]);
			}
			else
			{
				System.out.println("The given number is odd="  +" "+   +number[j]);
			}
			if(number[j]>0)
			{
				System.out.println("The given number is positive="  +" "+  +number[j]);
			}
			else
			{
				System.out.println("The given number is negative="  +" "+  +number[j]);
			}
		}
		}
}

