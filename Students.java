package com.practiceonly;

public class Students {
	int m1,m2,m3,m4,m5;
    int total;

    Students(int m1,int m2,int m3,int m4,int m5)
    {
    	
   this.m1 = m1;
   this.m2 = m2;
   this.m3 = m3;
   this.m4 = m4;
   this.m5 = m5;
    }
   public void get()
   {
   total = m1+m2+m3+m4+m5;
   System.out.println(total);
    }
    
	public static void main(String[] args) {
	Students ram = new Students(80,90,100,90,100);
	Students rahim = new Students(100,100,100,80,70);
     ram.get();
     rahim.get();

	}

}
