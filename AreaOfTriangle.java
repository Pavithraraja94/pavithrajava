package com.practice.java;

import java.util.Scanner;

public class AreaOfTriangle {
	int breath;
	int height;
	int Area;
	void findAreaOfTriangle()
	{
		Scanner scan = new Scanner(System.in);
			//Area = scan.nextInt();
		
		System.out.println("enter the height");
		height  = scan.nextInt();
		System.out.println("enter the breath");
		breath = scan.nextInt();
		Area=(height*breath)/2;
		System.out.println("AreaOfTriangle" +Area);

	}

}
