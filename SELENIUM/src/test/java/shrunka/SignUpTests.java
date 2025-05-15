package shrunka;

import org.testng.annotations.Test;

public class SignUpTests {
	
	
	@Test (priority=1, groups= {"regression"})
	void SignupbyGmail()
	{
		System.out.println("This is Signup by Gmail...");
	}

	@Test (priority=2, groups= {"regression"})
	void SignUpbyFacebook()
	{
		System.out.println("This is SignUp by Facebook...");
	}	
	
	@Test(priority=2, groups= {"regression"})
	void SignUpbySkype()
	{
		System.out.println("This is SignUp by Skype...");
		
	}
		
	
}
