package com.practice.java;

import java.util.Scanner;

public class ProductTest{

	public static void main(String[] args) {
		
		Product pd = new Product();
		Scanner scan = new Scanner(System.in);	
		System.out.println("enter the productprice");
		pd.productprice = scan.nextFloat();
		
		System.out.println("enter the discountrate");
		pd.discountrate = scan.nextFloat();
		
		pd.findsaleprice();
		
		

		// System.out.println("discountamount is" +discountamount);
		 
		//System.out.println("saleprice is" +saleprice);
		
	}

}
