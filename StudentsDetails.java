package exercise1;

import java.util.Scanner;

public class StudentsDetails {
	String name;
	String rollnum;
	String areaofinterest;
	void getOutput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Name");
		name = scan.next();
		System.out.println("Enter the Roll Number");
		rollnum = scan.next();
		System.out.println("Enter the Area of Interest");
		areaofinterest = scan.next();
	}
	
	void display()
	{
		System.out.println("Name is "+name);
	}
	

	public static void main(String[] args) {
		StudentsDetails sd = new StudentsDetails();
		sd.getOutput();
		sd.display();
	}

}
