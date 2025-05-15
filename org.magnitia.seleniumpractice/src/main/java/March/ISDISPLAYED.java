package March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISDISPLAYED {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/registar");
		driver.manage().window().maximize();
		
		//method 1
		
	/*	WebElement LOGO = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		System.out.println("Display status of the LOGO is"+ LOGO.isDisplayed());*/
		
		//method 2
		boolean Status = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
		System.out.println("Display status of the LOGO is" + Status);
		
		
	}
}
