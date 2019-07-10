package exersicejuly10;

import java.util.Scanner;

public class Vowels {
char n;
	void display()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		n = scan.next().charAt(0);

	}
	void getOutput()
	{
		if(n =='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
		{
			System.out.println("its a vowels"); 
		}
		else
		{
			System.out.println("its a consonant");
		}
	}
	

	public static void main(String[] args) {
	
Vowels v = new Vowels();
v.display();
v.getOutput();

	}

}
