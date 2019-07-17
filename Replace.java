package com.practice.java.july15;

import java.util.Scanner;

public class Replace {
	int i;
	int n;
	int m;
	int number[] = new int[5];
	
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter the value");
		System.out.println("================");
	
		for(i=0;i<=4;i++)
		{
		System.out.println("Enter the number for position" +" "+   +i);
		number[i] = scan.nextInt();
		}
		
		System.out.println("OUTPUT");
	
	}
	void getOutput()
	{
		System.out.println("To Find the value");
        n=scan.nextInt();
        System.out.println("To Replace the value");
        m=scan.nextInt();
			for(i=0;i<=4;i++)
			{
			if(n==number[i])
			{
				number[i] = m;
				
			}
			System.out.println("The number is"   +number[i]);

			}
}
}