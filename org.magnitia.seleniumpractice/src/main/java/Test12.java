
public class Test12 {
	
	
	void m1()
	
	{   m2();
		
		System.out.println( "m1 method");
		m2();
		
	}
	
	void m2()
	{
		m3(10);
		
		System.out.println("m2 method");
	}
	
	void m3(int a)
	{
	System.out.println("m3 method");
	
	}
	
	

	public static void main(String[] args) {
		
		Test12 t = new Test12 ();
		   
		t.m1();
		
     
	}

}
