package shrunka;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HA2 {
	@Test
	void test_hardassertions()
	
	{
		System.out.println("This is first test");
		System.out.println("This is second test");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("This is third test");
		System.out.println("This is fourth test");
		
	}
	
	

}
