package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotationstest1 {
	@BeforeClass
	void Login() 
	{ 
		System.out.println("Login app");
	}
		@Test (priority = 1)
   void Search ()
   {
	  System.out.println("Search for content"); 
   }
		@Test (priority=2)
		void Advsearch()
		{
			System.out.println("Advsearch for content");
		}
		@AfterClass
		void Logout()
		{
			System.out.println("Logout app");
		}
		
}
