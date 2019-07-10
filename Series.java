package exercise1;

import java.util.Scanner;

public class Series {
int n;
void display()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value");
	n = scan.nextInt();
}
void getOutput()
{
	if(n%2 !=0)
	{
		System.out.println("The number is odd number");	
	}
	if(n%2 ==0)
	{
		System.out.println("The number is even number");	
	}

}
	public static void main(String[] args) {
		Series s1 = new Series();
		s1.display();
		s1.getOutput();
		

	}

}
