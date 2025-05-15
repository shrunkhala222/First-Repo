
public class Test5 {
	
	int a=1000;
	int b=2000;
	
	static void m1()
	{
		Test5 obj1=new Test5();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
	}
	
	static void m2()
	{
		Test5 obj2=new Test5();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
	}
	

	public static void main(String[] args) {
		Test5.m1();
		Test5.m2();

	}

}
