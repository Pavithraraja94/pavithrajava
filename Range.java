package exercise1;

import java.util.Scanner;

public class Range {
	int i=55; 
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		System.out.println("--------------");
		
		i= scan.nextInt();
		//System.out.println("--------------");
	}
	void getoutput()
	{
		
	 if(i<=100)	
		{
		    System.out.println("The num b/w the range" );
			System.out.println("The condition is true" );
	    }
	 else
		{
			System.out.println("it is out of border");
		}
	}

	public static void main(String[] args) {
	
		Range r = new Range();
		r.getInput();
		r.getoutput();
	}

}
