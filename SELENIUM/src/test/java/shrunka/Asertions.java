package shrunka;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asertions
{
	@Test (priority=1)
    void openapp()
    {
    	Assert.assertTrue(false);
    	
    }
	@Test (priority=2, dependsOnMethods= {"openapp"})
	void Login()
	{
		Assert.assertTrue(false);
		
	}
	@Test (priority=3, dependsOnMethods= {"Login"})
	void search()
	{
		Assert.assertTrue(true);
		
	}
	@Test(priority=4, dependsOnMethods= {"Login"})
	void advsearch()
	{

		Assert.assertTrue(true);
	}
	
	@Test(priority=5,dependsOnMethods= {"Login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
}
