package shrunka;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cls2 {
	@Test
	void m2()
	{
		System.out.println("This is m2 from Cls2");
	}
	@AfterTest
	void m4()
	{
		System.out.println("This is m4 after test method");
	}

}
