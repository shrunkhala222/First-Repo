package shrunka;

import org.testng.annotations.Test;

public class LoginTests {
	@Test (priority=1, groups= {"smoke"})
	void LoginbyGmail()
	{
		System.out.println("This is Login by Gmail");
	}
	@Test (priority=2, groups= {"smoke"})
	void LoginbyFacebook()
	{
		System.out.println("This is Login by Facebook");
	}
	@Test (priority=3, groups= {"smoke"})
	void LoginbySkype()
	{
		System.out.println("This is Login by Skype");
	}
}

