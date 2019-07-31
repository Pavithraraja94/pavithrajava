package com.practiceonly;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	 static ArrayList<Integer> alist = new ArrayList<Integer>();
	public static void main(String[] args) {
// ArrayList<Integer> alist = new ArrayList<Integer>();//(in class level by using static keyword)
			   alist.add(23);
			   alist.add(45);
			   alist.add(56);
			   alist.add(24);
			   alist.add(65);
			  System.out.println(alist);
			  System.out.println("The size of the array is:"+"  " +alist.size());
			 System.out.println("Before removing the element"  +alist);
			
			 System.out.println("After removing the element");
			  alist.remove(2);
			  System.out.println(alist);
			  
			  System.out.println("To get the value");
			  System.out.println("****************");
				for(int i=0;i<alist.size();i++)
				{
					System.out.println(alist.get(i));	
				}
				System.out.println("After Sorting");
				System.out.println("==============");
				Collections.sort(alist);
				  System.out.println(alist);
				  System.out.println("In Reverse");
				  System.out.println("==============");
				  Collections.reverse(alist);
				  System.out.println(alist);
				  System.out.println(alist.iterator());
		   }

	}


