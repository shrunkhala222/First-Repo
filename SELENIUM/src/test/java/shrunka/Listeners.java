package shrunka;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Listeners {
	
	WebDriver driver;
	@BeforeClass
	void setup () 
	{
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	}
	@Test(priority=1)
	void testlogo() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean status = driver.findElement(By.xpath("//*[@class=\"orangehrm-login-branding\"]")).isDisplayed();
				Assert.assertEquals(status,true);
		
	

}
	@Test (priority=2)
	void testurl()
	{
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/";
		Assert.assertEquals(driver.getCurrentUrl(), url);
		
		
	}
	@Test (priority= 3, dependsOnMethods= {"testurl"})
	void testtitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
}