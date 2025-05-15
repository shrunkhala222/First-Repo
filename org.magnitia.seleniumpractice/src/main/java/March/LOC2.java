package March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOC2 {

	public static void main(String[] args) throws Exception {
	   
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Rinku");
			Thread.sleep(5000);
		
		driver.findElement(By.name("lastname")).sendKeys("Shende");
		Thread.sleep(5000);
		
		driver.findElement(By.id("sex")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("9423690118");
		Thread.sleep(5000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("942369011");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"u_0_n_wp\"]/text()")).click();
	
		Thread.sleep(5000);
		
	
			
		

	}

}
