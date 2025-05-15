package shrunka;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Cls3 {
	@Test
	void m5()
	{
		System.out.println("This is m5 from Cls3");
	}
	
	@BeforeSuite
	void m6()
	{
		System.out.println("This is m6 Beforesuite method");
	}
	
	@AfterSuite
	void m7()
	{
		System.out.println("This is m7 Aftersuite method");
	}
	
	
	
	
}
