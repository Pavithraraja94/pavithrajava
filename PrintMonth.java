package com.practiceonly;

import java.util.Scanner;

public class PrintMonth {
	int n;
	
	public void get()
	{
		Scanner scan = new Scanner(System.in);
	     System.out.println("Enter the number");
	     n=scan.nextInt();
			
	}
	public void getOutput()
	{
		if(n==1)
		{
			 System.out.println(" hai,you press one so the  month is january  ");	
		}
		if(n==2)
		{
			 System.out.println(" hai,you press two so the month is febuary");	
		}
		if(n==3)
		{
			 System.out.println(" hai,you press three so the month is march ");	
		}
		if(n==4)
		{
			 System.out.println(" hai,you press four so the  month is april ");	
		}
		if(n==5)
		{
			 System.out.println(" hai,you press five so the month is may");	
		}
		if(n==6)
		{
			 System.out.println(" hai,you press six so the month is june ");	
		}
		if(n==7)
		{
			 System.out.println(" hai,you press seven so the month is july ");	
		}
		if(n==8)
		{
			 System.out.println(" hai,you press eight so the month is august ");	
		}
		if(n==9)
		{
			 System.out.println(" hai,you press nine so the month is september ");	
		}
		if(n==10)
		{
			 System.out.println(" hai,you press ten so the month is october ");	
		}
		if(n==11)
		{
			 System.out.println(" hai,you press eleven so the month is november ");	
		}
		if(n==12)
		{
			 System.out.println(" hai,you press twelve so the month is december ");	
		}
	
	}
	

	public static void main(String[] args) {
		PrintMonth pm  = new PrintMonth();
           pm.get();
           pm.getOutput();
	}

}
