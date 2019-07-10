package exersicejuly10;

import java.util.Scanner;

public class Divisible5r11 {
	int n;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		n = scan.nextInt();
	}
	void getOutput()
	{
		if(n%5==0  && n%11==0)       //if(n%5==0  || n%11==0)       
		{
			System.out.println("The number is valid");	
		}
		else
		{
			System.out.println("The number is invalid");		
		}
	}

}
