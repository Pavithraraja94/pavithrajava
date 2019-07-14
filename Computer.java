package Practise;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Computer {
	int ram=2;
	int getSpeed()
	{
		int timeclock=2;
		int speed = timeclock*ram;
		return speed;
	}
	class Book{
		int price=34;
		String author=" ";
	}
	Book getAction()
	{
	Book tamil = new Book();
	tamil.price=50;
	tamil.author="Bharathiyar";
	return tamil;
	}	

	public static void main(String[] args){
		Computer c = new Computer();
		int k = c.getSpeed();
		System.out.println(k);
		Book book = c.getAction();
		System.out.print(book.author);
		System.out.print(" ");
		System.out.print(book.price);
		
	}

}
