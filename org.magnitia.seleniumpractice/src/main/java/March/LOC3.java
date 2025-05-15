package March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOC3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://wwww.facebook.com/");
		driver.manage().window().maximize();
		
		//click on create account button
		
		WebElement Createaccountbtn = driver.findElement(By.linkText("Create new account"));
		Createaccountbtn.click();
		Thread.sleep(5000);
		
		WebElement Firstname = driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Allu");
		Thread.sleep(5000);
		
		WebElement Surname = driver.findElement(By.name("lastname"));
		 Surname.sendKeys("Arjun");
		 Thread.sleep(5000);
		 
		 WebElement Gender = driver.findElement(By.className("_58mt"));
		 Gender.click();
		 Thread.sleep(5000);
		 
		 WebElement Phonenumber = driver.findElement(By.name("reg_email__"));
		 
		 Phonenumber.sendKeys("9423690119");
		 
		 Thread.sleep(5000);
		 
		 
		 WebElement Password = driver.findElement(By.name("reg_passwd__"));
		 Password.sendKeys("94236901");
		 Thread.sleep(5000);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
			 
	
		
	}

}
