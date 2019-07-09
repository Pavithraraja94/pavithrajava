package com.practice.java;

import java.util.Scanner;

public class Factorial {



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
	
		int n =scan.nextInt();
		int fact = 1;
		
		for(int i=1;i<=5;i++){
			fact = fact*i;
			System.out.println(fact);
			
		}

	}

}
