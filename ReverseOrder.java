package com.practice.java.july15;

import java.util.Scanner;

public class ReverseOrder {
	int i;
	int element;
	int elements[] = new int[10];
	int array[] = new int[10];
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		for(i=0;i<=9;i++)
		{
		System.out.println("Enter the value");
		System.out.println("-----------------");
		elements[i] = scan.nextInt();
		}
		//System.out.println(elements[i]);
}
	void getOutput()
	{
		for(i=9;i>=0;i--)
		{			
			array[i] = elements[i];
		System.out.println("the array is" +array[i]);
		}
	}

}

