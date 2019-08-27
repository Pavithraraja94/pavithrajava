package com.java.interview.practice;

import java.util.Scanner;

public class StrongNunber {
  int sum=0;
  int num;
 
  public void strong()
  {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	num=scan.nextInt();
	int temp=num;
	 while(num>0)
	 {
		 int strong=num%10;
		 int fact=1;
		 for(int i=1;i<=strong;i++)
		 {
			 fact=fact*i;
		 }
		 System.out.println(sum+" "+fact);
		 sum=sum+fact;
		 num=num/10;
		 
	 }
	  if(temp==sum)
	  {
		  System.out.println("The number is strong number " +sum);  
	  }
	  else
	  {
		  System.out.println("The number is not strong number " +sum);  
	  }
  }
	public static void main(String[] args) {
		StrongNunber sn = new StrongNunber();
		sn.strong();

	}

}
