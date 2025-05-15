package shrunka;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencies {
	@Test (priority=1)
	 void openapp()
	    {
	    	Assert.assertTrue(true);
	    	
	    }
	 @Test (priority=2, dependsOnMethods= {"openapp"})
	 void Login()
		{
			Assert.assertTrue(true);
			
		}
	 @Test (priority=3, dependsOnMethods= {"Login"})
	 void search()
		{
			Assert.assertTrue(false);
			
		}
	 @Test (priority=4, dependsOnMethods= {"Login", "search"})
	 void advsearch()
		{

			Assert.assertTrue(true);
		}
	 @Test (priority=5, dependsOnMethods= {"Login"})
	 void logout()
		{
			Assert.assertTrue(true);
		}

}
