package com.java.interview.practice;

import java.util.Scanner;

public class ArmStrong {
	double arm=0;
	  int num; 
	  public void strong()
	  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
		int temp=num;
		 while(num>0)
		 {
			 int rem=num%10;
			 arm=arm+(Math.pow(rem,3));
			 System.out.println(arm); 
			 num=num/10;	 
		 }
		  if(temp==arm)
		  {
			  System.out.println("The number is strongnumber " +arm);  
		  }
		  else
		  {
			  System.out.println("The number is not strongnumber " +arm);  
		  }
		}

	public static void main(String[] args) {
		ArmStrong as = new ArmStrong();
		as.strong();
	}
}
