package TestNG;

import org.testng.annotations.Test;

public class Testassertions1 {
	
	@Test
	void testTitle()
	{
	 String exp_title = "IRCTC home";
	 String actual_title = "IRCTC home";
	 
	 if (exp_title.equals(actual_title))
	 {
		 System.out.println("Test pass");
	 }
	 
	 else
	 {
		 System.out.println("Test fail");
	 }
	}

}
