package org.magnitia.seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement Countrydropdown1=driver.findElement(By.name("country"));
		Select Countryoptions2=new Select(Countrydropdown1);
		
		List<WebElement> Options3= Countryoptions2.getOptions();
		System.out.println();
		
		for(int i=0; i<Options3.size();i++)
		{
			System.out.println(Options3.get(i).getText());
		}
		
	/*	for (WebElement options4:Options3)
		{
			System.out.println(Options4.getText());
		}*/
		
	}

}
