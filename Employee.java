package com.practice.java;

import java.util.Scanner;

public class Employee{
	int age;
	char sex;
	String maritalstatus;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
	//boolean b = true;
	//while (b)
	
	
		System.out.println("Enter the age");
		int age = scan.nextInt();
		System.out.println("maritalstatus");
		
	/*System.out.println("enter your chioce");
	int chioce = scan.nextInt();*/
	
	
	//void getOutput()
	//{
		//System.out.println("age");
		/*if(sex==male)
		{
			System.out.println("M");	
		}
		else if(sex==female)
		{*/
		//Scanner scan = new Scanner(System.in);
		
		//System.out.println("single");
		//System.out.println("maried");
		//char cho = scan.next().charAt(0);
		
		System.out.println("enter your chioce");
		int cho = scan.nextInt();
		if(cho==1)
		{
		System.out.println("single");
		}
		else if(cho==2)
		{
			System.out.println("married");
		}
		System.out.println("sex");
			System.out.println("enter your chioce");
			int choice = scan.next().charAt(0);
			if(cho==1)
			{
			System.out.println("M");
			}
			else if(cho==2)
			{
				System.out.println("F");

		}
		}
	}



