package com.practiceonly;

import java.util.Scanner;

public class CivilStudents {
	private int regno;
	private String name;
	private int m1,m2,m3,m4,m5;
	private float total,average;
	public void getInput()
	{
		System.out.println("Civil Students Detail");
		System.out.println("----------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the regno:");
		regno = scan.nextInt();
		System.out.println("Enter the name:");
		name = scan.next();
		System.out.println("Enter the tamil mark");
		m1 = scan.nextInt();
		System.out.println("Enter the english mark");
		m2 = scan.nextInt();
		System.out.println("Enter the maths mark");
		m3 = scan.nextInt();
		System.out.println("Enter the science mark");
		m4 = scan.nextInt();
		System.out.println("Enter the social mark");
		m5 = scan.nextInt();
       total=m1+m2+m3+m4+m5;
       average = total/5;
	}
	public void display()
	{
		System.out.println( "NAME:" +" "  +name);
		System.out.println("REGNO:"+" "  +regno);
		System.out.println("TAMIL MARK:"+" "   +m1);
		System.out.println("ENGLISH MARK:"+" "  +m2);
		System.out.println("MATHS MARK:"+" "  +m3);
		System.out.println("SCIENCE MARK:"+" " +m4);
		System.out.println("SOCIAL MARK:"+" " +m5);
		System.out.println("The total is:"+" "  +total);
		System.out.println("The average is:"+" "  +average);
	}
	
	public void getOutput()
	{
		System.out.println( "");
	System.out.println("The grade category is:");
	System.out.println( "=====================");
	if(total>400)
	{
		System.out.println( "class A");	
	}
	
	if(total<400 && total>350)
	{
			System.out.println( "class B");	
	}
	
	if(total<350)
	{
		System.out.println( "class C");	
		}
	}
}
