package com.practice.java;

import java.util.Scanner;

public class PrintSeries{
	int n;
	void get()
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter the value");
		n = scan.nextInt();
	}
	void oddNumber()
	{
		
		System.out.println("OddSeries");
		for(int i=1;i<=n;i=i+2)
		{
		
			System.out.println(i);	
		}
	}
	void EvenNumber()
z v	{
		System.out.println("EvenSeries");
		for(int i=0;i<=n;i=i+2)
		{
		
			System.out.println(i);
			
		}
	}
	void getOutput()
	{
		if (n%2 !=0)
		{
			System.out.println(n+ " this is odd number " );
		}

		else if(n%2==0)
		{
			System.out.println(n+ " this is even number " );	
		}
		else
		{
			System.out.println("no number");
		}
	}
	/*void whi()
	{
		int j=1;
		while(j<n)
		{
			System.out.println("this is even number " );	
			j++;
		}
	}
	void for1()
	{
		for(int k=1;k<=n;k++)
		{
			System.out.println("hello");
		}*/
	}
	
	
	

		
