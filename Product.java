package com.practice.java;
import java.util.Scanner;

public class Product {
	float productprice;
	float discountrate;
	double discountamount;
	double saleprice;
	
	void findsaleprice()
	{
		/*Scanner scan = new Scanner(System.in);	
	System.out.println("enter the productprice");
	productprice = scan.nextFloat();
	
	System.out.println("enter the discountrate");
	discountrate = scan.nextFloat();*/
	
			
	
		  discountamount = productprice * discountrate;
	saleprice = productprice - discountamount;
	System.out.println("discountamount is" +discountamount);
	System.out.println("saleprice is" +saleprice);
		
		
	}

	
		
	}



