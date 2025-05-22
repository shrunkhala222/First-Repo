package org.magnitia.seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDoptions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement CDD = driver.findElement(By.name("country"));
		Select CDDE = new Select(CDD);
		List<WebElement> DDOptions = CDDE.getOptions();
		System.out.println("Number of options in a Country dropdown"+ DDOptions.size());
		 
		// Display options from dropdown using for loop
		for (int i=0;i<DDOptions.size(); i++)
		{
			System.out.println(DDOptions.get(i).getText());
		}
		 
	/*	for (WebElement Options:DDOptions)
		{
		  System.out.println(Options.getText());	
		}*/
		
		
		

	}

}
