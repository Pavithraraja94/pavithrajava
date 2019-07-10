package exercise1;

import java.util.Scanner;

public class String1 {
	
	String name1;
	String name2;

	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name1 ");
		name1 = scan.next();
		System.out.println("Enter the name2");
		name2 = scan.next();
		System.out.println(name1 + name2);
		

	}

	public static void main(java.lang.String[] args) {
		String1 s = new String1();
		s.getInput();

	}

}
