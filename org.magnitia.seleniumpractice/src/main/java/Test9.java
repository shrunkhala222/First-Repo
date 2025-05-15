
public class Test9 {
	
	
	int     e = 28;
	int		f= 35;
	static int		g= 46;
	static int		h= 50;
	
	void m1()
	{
	
	System.out.println(e);
	System.out.println(f);
	System.out.println(Test9.g);
	System.out.println(Test9.h);
	}
	
	static void m2()
	
	{
		
	Test9  obj = new  Test9();
	
	System.out.println(obj.e);
	System.out.println(obj.f);
	System.out.println(Test9.g);
     System.out.println(Test9.h);
     
	}
     
     
	
	
	
	   public static void main(String[] args) {
		   
		   Test9 obj9 = new Test9();
		   
		   obj9.m1();
		   
		   Test9.m2();
		
		

	}

}
