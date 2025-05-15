package shrunka;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testassert2 {
	@Test
	void testTitle()
	{
		String exp_title = "IRCTC home";
		String act_title = "IRCTC hotel";
		 if (exp_title.equals(act_title))
		 {
			 System.out.println("Test pass");
			 Assert.assertTrue(true);
			 
		 }
		 else
		 {
			 System.out.println("Test pass");
			 Assert.assertTrue(false);
			 
		 }
	}

}
