
public class Test3 {
	
	int a=100;
	int b=200;
	static int c=300;
	static int d=400;
	
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(Test3.c);
		System.out.println(Test3.d);
	}
	 
	static void m2()
	{ 
		Test3 obj = new Test3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(Test3.c);
		System.out.println(Test3.d);
		
	}

	
  
    
public static void main(String[] args)
	{ Test3 obj3=new Test3();
	 obj3.m1();
	Test3.m2();
	
	}
		
}            
         

