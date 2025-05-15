package shrunka;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test (dataProvider = "dp")
	void testlogin(String email, String password)
	
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}
	@AfterClass
	void close()
	{
		driver.quit();;
		
	}
	
  @DataProvider (name="dp",indices={0,4})
	Object[][] logindata()
	{
		Object data [][] = {
				   
				{"abc@gmail.com","test123"},
				{"xyz@gmail.com", "test012"},
				{"john@gmail.com","test@123"},
				{"Alluarjun123@gmail.com","test@123"},
				{"johncam@gmail.com", "test"},
		};
		
		return data;
		
			
	}
	
	
	

}
