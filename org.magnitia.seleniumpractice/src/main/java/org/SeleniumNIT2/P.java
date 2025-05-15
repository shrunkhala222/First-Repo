package org.SeleniumNIT2;

 class P {
	
	
	int a = 10;
	int b = 20;
	
}
	
	public class P extends P{
	{
	int  a = 100;           //instance variables
	int  b= 200;
	}
	
	void add(int a , int b)  // local variables
	
	{
		System.out.println(a+b);
		System.out.println(this.a + this.b);
		System.out.println(super.a + super.b);
	}
	

	

	public static void main(String[] args) {
	      
	   P obj = new P();
	   obj.add(1000,2000);

	}

}
