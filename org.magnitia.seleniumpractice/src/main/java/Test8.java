
public class Test8 {
	
	
	
	         int a= 200;
			int b = 100;
			static int c= 350;
			static int d = 400;
					
					void m1()
					{
					
					System.out.println(a);
			        System.out.println(b);
			        System.out.println(Test8.c);
			        System.out.println(Test8.d);
					}
			        
			        
			      static void m2()
			        {
			        	Test8  obj = new Test8();
			        	System.out.println(obj.a);
			        	System.out.println(obj.b);
			        	System.out.println(Test8.c);
			        	System.out.println(Test8.d);
			        }
			        	
			        	

	public static void main(String[] args) {
		
		Test8 obj8 = new Test8();
		obj8.m1();
		Test8.m2();
		
		
		
		
		
	
		        	
		        	
		        }
		

	}


