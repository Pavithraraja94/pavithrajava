package com.java.multithreading;

public class MyThread  extends Thread{
		
		public void run(){  
		    System.out.println("My thread is in running state.");  
		  } 
		public void display(){
			display();
		}
		  public static void main(String args[]){  
		     MyThread mt =new MyThread();   
		     mt.start(); 
		     mt.display(); //this is .StackOverflowError
		    
		  }  
		}



