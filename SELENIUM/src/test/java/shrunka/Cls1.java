package shrunka;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cls1 {
	@Test
	void m1()
	{
		System.out.println("This is m1 from Cls1");
	}
	
	@BeforeTest
	void m3()
	{
		System.out.println("This is m3 before test method");
	}
	
	
}
