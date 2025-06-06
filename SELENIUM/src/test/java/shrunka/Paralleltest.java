package shrunka;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Paralleltest {
	
	WebDriver driver;
	@Parameters ({"browser"})
	@BeforeClass
	void setup(String br)
	{
		switch(br.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver(); break;
		//case "edge" : driver = new EdgeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		default : System.out.println("Invalid browser"); return;
		
		}
		 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void testlogo() throws InterruptedException
	{
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//*[@class=\"orangehrm-login-branding\"]")).isDisplayed();
				Assert.assertEquals(status,true);
		
	}
	@Test (priority=2)
	void testtitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=3)
	void testut1()
	{
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertEquals(driver.getCurrentUrl(),url);
	}
	@AfterClass
	void close()
	{
		driver.quit();
	}
		
}		
	
	
	
	
	
		


