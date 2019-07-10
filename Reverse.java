package exercise1;

import java.util.Scanner;

public class Reverse {
	int i;
	int n;
	
	void display()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		n = scan.nextInt();	
	
	
	}
	void getOutput()
	{
		
		for(i=n;i>=1;i--)
		{
		System.out.println(i);
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse re = new Reverse();
		re.display();
		re.getOutput();
		

	}

}
