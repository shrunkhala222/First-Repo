package shrunka;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SA1 {
	@Test
	void test_softassertion()
	{
		System.out.println("This is first test");
		System.out.println("This is second test");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);
		
		System.out.println("This is third test");
		System.out.println("This is fourth test");
		
		sa.assertAll();
	}

}
