package com.practiceonly;

public class Employeee {
		int empId;  
		   String empName;  
			    
		   //parameterized constructor with two parameters
		   Employeee(int id, String name){  
		       this.empId = id;  
		       this.empName = name;  
		  // }  
		  // void info(){
		        System.out.println("Id: "+empId+" Name: "+empName);
		   }  
			   
		   public static void main(String args[]){  
			Employeee obj1 = new Employeee(10245,"Chaitanya");  
			Employeee obj2 = new Employeee(92232,"Negan");  
			//obj1.info();  
			//obj2.info();  
		   }  

	}


