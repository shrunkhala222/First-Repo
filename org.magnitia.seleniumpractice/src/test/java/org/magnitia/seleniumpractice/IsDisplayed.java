package org.magnitia.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	//method-1	
	/*WebElement LOGO = driver.findElement(By.xpath(" //img[@alt= 'nopCommerce demo store']"));
	System.out.println("Display status of the logo is" + LOGO.isDisplayed());*/;

	//method - 2
	boolean status = driver.findElement(By.xpath(" //img[@alt= 'nopCommerce demo store']")).isDisplayed();
	System.out.println("display status of the logo"+ status);
	
	
	}

}
