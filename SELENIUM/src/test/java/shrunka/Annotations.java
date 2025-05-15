package shrunka;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	void bs()
	{
		System.out.println("This is Before suite");
	}
	@AfterSuite
	void as()
	{
		System.out.println("This is After suite");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("This is Before test");
	}
	@AfterTest
	void at()
	{
		System.out.println("This is After test");
	}
	@BeforeClass
	void bc()
	{
		System.out.println("This is Before class");
	}
	@AfterClass
	void ac()
	{
		System.out.println("This is after class");
	}
     @BeforeMethod
	void bm()
	{
		System.out.println("This is Before method");
	}
     @AfterMethod
	void am()
	{
		System.out.println("This is after method");
	}
	
	
	@Test (priority=1)
	void m1()
	{
		System.out.println("This is Test method 1");
	}
	
	@Test (priority=2)
	void m2() 
	{
		System.out.println("This is Test method 2");
	}
	
}	
	






