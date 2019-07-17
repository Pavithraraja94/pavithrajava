package com.practice.java.july15;

import java.util.Scanner;

public class Subarray {
	int i;
	int element[] = new int[10];
	
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter the value");
		System.out.println("================");
	
		for(i=0;i<10;i++)
		{
		System.out.println("Enter the number for position" +" "+   +i);
		element[i] = scan.nextInt();
		}
		
		System.out.println("OUTPUT");
	
	}
	void getOutput()
	{
			for(i=2;i<8;i++)
			{
				System.out.println(element[i]);	
	     	}
	
	
	}
}

