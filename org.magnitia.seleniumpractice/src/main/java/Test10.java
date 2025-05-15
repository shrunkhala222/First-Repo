
public class Test10 {
	
	int m = 1000;
	int n= 2000;
	static int o = 3000;
	static int p = 4000;
	
	void m1 ()
	{
		System.out.println(m);
		System.out.println(n);
		System.out.println(Test10.o);
		System.out.println(Test10.p);
		
		
	}
	
	static void m2()  
	{
		Test10 obj = new Test10();
		System.out.println(obj.m);
		System.out.println(obj.n);
		System.out.println(Test10.o);
		System.out.println(Test10.p);
	}
	
	
	

	public static void main(String[] args) {
		
		Test10 obj10 = new Test10();
		obj10.m1();
		Test10.m2();
		
		

	}

}
