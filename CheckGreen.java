package com.practice.java.string;

import java.util.Scanner;

public class CheckGreen {
	public void getInput()
	{
	String s = new String();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Sentence");
	s = scan.next();
	System.out.println("OUTPUT");
	System.out.println (s.contains( "green"));
	}
public static void main(String [] args)
{
	CheckGreen cg = new CheckGreen();
	cg.getInput();
}
}
