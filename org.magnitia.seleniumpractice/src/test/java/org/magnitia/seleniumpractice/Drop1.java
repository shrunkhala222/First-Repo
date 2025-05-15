package org.magnitia.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop1 {

	public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/selenium/newtours/ "); 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.linkText("REGISTER")).click();
	 WebElement Countrydropdown = driver.findElement(By.name("country"));
		 
		 Select Countryname = new Select(Countrydropdown);
	         Countryname.selectByIndex(7);
		

	}

}
