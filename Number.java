package com.practice.java;

import java.util.Scanner;

public class Number {
	int n1;
	//int n2;
	//int n;
	int i;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
   n1=scan.nextInt();
		/*System.out.println("Enter the another value");
		n2=scan.nextInt();*/
	}
	void getOutput()
	{
		
		for( i=0;i<=n1-1;i++);
		{
		
		if(n1==0)
		{
			System.out.println("The positive number is" +i);
		}
		}
	/*
		else if(n1==i) 
		{
			System.out.println("The negative number is" +i);
		}
	*/for( i=0;i>n1;i--)
	{
		if(n1 > i)
		{
		System.out.println("The positive number is" +i);
		}
	/*else if(n2 == i)
	{
		System.out.println("The negative number is" +i);
	}*/
	}
}
	
	
}

